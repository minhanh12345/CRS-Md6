package com.example.demo.repository;

import com.example.demo.model.Notification;
import org.springframework.data.repository.CrudRepository;

public interface INotifiRepository extends CrudRepository<Notification,Long> {
}
