package com.example.demo.service.User;

import com.example.demo.model.Users;
import com.example.demo.service.GenericService;

import java.util.Optional;

public interface IUserService extends GenericService {
    Optional<Users> findByUsername(String name); //Tim kiem User co ton tai trong DB khong?
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Users save(Users users);
}
