package com.kshrd.jpajwtdemo.service;

import com.kshrd.jpajwtdemo.domain.Role;
import com.kshrd.jpajwtdemo.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();

}
