package com.software.TPE.model;

import lombok.Getter;
import lombok.Setter;


public class User {
    @Getter
    @Setter
    private int id;
    private String email;
    private String name;
    private String password;
    private String type;


    public User(int id, String email, String name, String password, String type) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.type = type;
    }


}
