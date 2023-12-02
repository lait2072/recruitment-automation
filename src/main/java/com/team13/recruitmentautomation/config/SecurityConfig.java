package com.team13.recruitmentautomation.config;

import com.team13.recruitmentautomation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Spring Security configuration class
 * @author Mylov Sergey <mylov91@yandex.ru>
 * @version 1.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * Inject this object for transfer user credentials to authentication manager
     * @see UserService
     * @see AuthenticationManager
     */
    private final UserService userService;

    @Autowired
    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    /**
     * Processes the authentication request
     * @return authentication result
     */
    @Bean
    public AuthenticationManager authenticationManager() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return new ProviderManager(authProvider);
    }

    /**
     * Setting up a sequence of filters to display a custom authorization form and determining which endpoints
     * which role has access to, as well as setting up deleting cookies and closing the session when logging out
     * @param http allows configuring web based security
     * @return an object of the HttpSecurity class on which all filters are applied
     * @see HttpSecurity
     * @throws Exception if something goes wrong
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .defaultSuccessUrl("/recruiter/candidates")
                        .permitAll())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/recruiter/**").hasAnyAuthority("RECRUITER", "ADMIN_RECRUITER")
                        .requestMatchers("/customer/**").hasAnyAuthority("CUSTOMER", "CUSTOMER_MANAGER")
                        .anyRequest().authenticated())
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .logoutSuccessUrl("/login")
                        .permitAll());
        return http.build();
    }

    /**
     * Allows to use encryption in passwords store
     * @return standard BCrypt password encoder
     * @see BCryptPasswordEncoder
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
