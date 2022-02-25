package com.erichiroshi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
