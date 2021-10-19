package com.ftb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftb.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
