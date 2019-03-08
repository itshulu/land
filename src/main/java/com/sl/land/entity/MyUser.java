package com.sl.land.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * @author shulu
 */
@Entity
public class MyUser implements Serializable {
    @Id
    private String id;
    private String userName;
    private String password;

    public MyUser() {
    }

    public MyUser(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
