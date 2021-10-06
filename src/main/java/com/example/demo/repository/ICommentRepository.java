package com.example.demo.repository;

import com.example.demo.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface ICommentRepository extends CrudRepository<Comment,Long> {
}
