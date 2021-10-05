package com.example.demo.Module;

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
    private User userTarget;
    @ManyToOne
    private PostLike postLike;
    @ManyToOne
    private Comment comment;
    @ManyToOne
    private CmtLike cmtLike;

    public Notification() {
    }

    public Notification(long id, Date timeCreate, String content, User userTarget, PostLike postLike, Comment comment, CmtLike cmtLike) {
        this.id = id;
        this.timeCreate = timeCreate;
        this.content = content;
        this.userTarget = userTarget;
        this.postLike = postLike;
        this.comment = comment;
        this.cmtLike = cmtLike;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUserTarget() {
        return userTarget;
    }

    public void setUserTarget(User userTarget) {
        this.userTarget = userTarget;
    }

    public PostLike getPostLike() {
        return postLike;
    }

    public void setPostLike(PostLike postLike) {
        this.postLike = postLike;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public CmtLike getCmtLike() {
        return cmtLike;
    }

    public void setCmtLike(CmtLike cmtLike) {
        this.cmtLike = cmtLike;
    }
}
