package com.assignment1.userdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment1.userdata.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
