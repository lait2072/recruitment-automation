package com.team13.recruitmentautomation.repository;

import com.team13.recruitmentautomation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Standard repository for searching for a user by name. Optional is used because the username entered may not
 be in the database
 * @author Mylov Sergey <mylov91@yandex.ru>
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
