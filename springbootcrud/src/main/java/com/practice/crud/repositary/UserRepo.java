package com.practice.crud.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.crud.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
