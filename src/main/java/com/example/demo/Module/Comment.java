package com.example.demo.Module;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;
    private Date timeCreate;

    public Comment() {
    }

    public Comment(long id, String content, User user, Post post, Date timeCreate) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.post = post;
        this.timeCreate = timeCreate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }
}
