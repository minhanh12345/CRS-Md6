package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Users userSource;
    @ManyToOne
    private Users userTarget;
    private boolean isAgree;


}
