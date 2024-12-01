package com.example.Guvi_Bus.Repository;

import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Guvi_Bus.Entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    
    UserEntity findByEmail(String email);

}
