package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CmtLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Comment comment;


}
