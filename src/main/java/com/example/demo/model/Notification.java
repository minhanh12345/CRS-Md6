package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date timeCreate;
    private String content;
    @ManyToOne
    private Users userTarget;
    @ManyToOne
    private Post postLike;
    @ManyToOne
    private Comment comment;
    @ManyToOne
    private CmtLike cmtLike;

    public Notification() {
    }

    public Notification(long id, Date timeCreate, String content, Users userTarget, Post postLike, Comment comment, CmtLike cmtLike) {
        this.id = id;
        this.timeCreate = timeCreate;
        this.content = content;
        this.userTarget = userTarget;
        this.postLike = postLike;
        this.comment = comment;
        this.cmtLike = cmtLike;
    }}

