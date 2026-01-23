package com.jiwanshu.ecom.repositories;

import com.jiwanshu.ecom.model.AppRole;
import com.jiwanshu.ecom.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
