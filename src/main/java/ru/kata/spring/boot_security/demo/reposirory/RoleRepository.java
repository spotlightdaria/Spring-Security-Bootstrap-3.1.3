package ru.kata.spring.boot_security.demo.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    //Role findRoleByName(String name);
}