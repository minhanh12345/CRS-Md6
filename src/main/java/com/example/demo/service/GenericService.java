package com.example.demo.service;

import java.util.Optional;

public interface GenericService <T>{
    Iterable<T> findAll();
    Optional<T> findById(long id);
    T save (T t);
    void delete(long id);

}
