package com.kshrd.jpajwtdemo.api;

import com.kshrd.jpajwtdemo.domain.Role;
import com.kshrd.jpajwtdemo.domain.User;
import com.kshrd.jpajwtdemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class UserResource {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<User>saveUser(@RequestBody User user){
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @PostMapping("/role/save")
    public  ResponseEntity<Role>saveRole(@RequestBody Role role){
        return ResponseEntity.ok().body(userService.saveRole(role));
    }

    @PostMapping("/role/addtouser")
    public  ResponseEntity<?>addRoleToUser(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRolename());
        return ResponseEntity.ok().build();
    }

}

@Data
class RoleToUserForm {
    private String username;
    private String rolename;
}