package com.rayhantsaury.repository;

import com.rayhantsaury.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
