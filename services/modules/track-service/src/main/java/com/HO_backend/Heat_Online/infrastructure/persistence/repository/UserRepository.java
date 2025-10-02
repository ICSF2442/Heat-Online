package com.HO_backend.Heat_Online.infrastructure.persistence.repository;

import com.HO_backend.Heat_Online.infrastructure.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}