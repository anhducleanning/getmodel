package com.example.demo.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReponistory  extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
