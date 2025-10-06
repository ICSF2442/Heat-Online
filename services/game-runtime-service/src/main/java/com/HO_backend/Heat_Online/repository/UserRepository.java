package com.HO_backend.Heat_Online.repository;

import com.HO_backend.Heat_Online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}