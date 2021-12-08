package com.kshrd.jpajwtdemo.repo;

import com.kshrd.jpajwtdemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    public Role findByName(String name);
}
