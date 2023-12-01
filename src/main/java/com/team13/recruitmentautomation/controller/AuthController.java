package com.team13.recruitmentautomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for authorization endpoints
 * @author Mylov Sergey <mylov91@yandex.ru>
 * @version 1.0
 */
@Controller
public class AuthController {

    /**
     * Show custom login page
     * @return custom html login form
     */
    @GetMapping("/login")
    public String login() {
        return "auth/authorization";
    }
}
