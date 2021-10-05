package com.example.demo.Module;

import javax.persistence.*;

@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User userSource;
    @ManyToOne
    private User userTarget;
    private boolean isAgree;

    public Friend() {
    }

    public Friend(long id, User userSource, User userTarget, boolean isAgree) {
        this.id = id;
        this.userSource = userSource;
        this.userTarget = userTarget;
        this.isAgree = isAgree;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUserSource() {
        return userSource;
    }

    public void setUserSource(User userSource) {
        this.userSource = userSource;
    }

    public User getUserTarget() {
        return userTarget;
    }

    public void setUserTarget(User userTarget) {
        this.userTarget = userTarget;
    }

    public boolean isAgree() {
        return isAgree;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }
}
