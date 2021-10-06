package com.example.demo.repository;

import com.example.demo.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface IFriendRepository extends CrudRepository<Friend,Long> {
}
