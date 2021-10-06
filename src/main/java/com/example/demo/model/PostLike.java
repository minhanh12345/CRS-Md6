package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PostLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Users user;
    @ManyToOne
    private Post post;


}

