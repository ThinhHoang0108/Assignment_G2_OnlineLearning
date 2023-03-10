/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ADMIN
 */
@Builder
@Getter
@Setter
@ToString
public class User {
    private int userID;
    private String name;
    private Date dob;
    private String phone;
    private String username;
    private String password;
    private String email;
    private int roleID;
    private Role role;

    public User() {
    }

    public User(int userID, String name, Date dob, String phone, String username, String password, String email, int roleID, Role role) {
        this.userID = userID;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roleID = roleID;
        this.role = role;
    }
    public User(int userID, String name, Date dob, String phone, String username, String password, String email, int roleID) {
        this.userID = userID;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roleID = roleID;
        this.role = role;
    }
    
    
}
