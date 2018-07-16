package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author JIAOJIAO
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
