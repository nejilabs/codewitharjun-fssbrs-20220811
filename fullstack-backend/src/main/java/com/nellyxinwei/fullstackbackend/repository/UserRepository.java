package com.nellyxinwei.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nellyxinwei.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
