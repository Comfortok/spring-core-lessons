package com.epam.spring.core.bean;

public class Client {
    private String id;
    private String fullName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Client() {
    }

    public Client(String id, String fullName) {
        super();
        this.id = id;
        this.fullName = fullName;
    }

    public void setGreeting(String gr) {
        
    }
}