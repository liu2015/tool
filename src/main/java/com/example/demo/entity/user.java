package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_text")
public class user {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String password;
    private String jaose;
    private String qx;
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getJaose() {
        return jaose;
    }

    public void setJaose(String jaose) {
        this.jaose=jaose;
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx=qx;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text=text;
    }


}
