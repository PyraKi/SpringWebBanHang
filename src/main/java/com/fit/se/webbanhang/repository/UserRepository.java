package com.fit.se.webbanhang.repository;


import com.fit.se.webbanhang.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = :email") // Username = Email
    public User getUserByUsername(@Param("email") String username);
}
