package com.example.demo.Module;

import javax.persistence.*;

@Entity
public class CmtLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Comment comment;

    public CmtLike() {
    }

    public CmtLike(long id, User user, Comment comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
