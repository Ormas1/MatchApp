package com.matches.matchApp.entities;

import com.matches.matchApp.dtos.User;
import com.matches.matchApp.enums.Gender;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    private long userId;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @OneToOne(cascade = CascadeType.ALL)
    private long userProfileId;

    public UserEntity() {
    }

    public UserEntity(User user) {
        this.userId = user.getUserId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.gender = user.getGender();
        this.userProfileId = user.getUserProfileId();
    }

    public UserEntity(String firstName, String lastName, String email, String password, Gender gender, long userProfileId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.userProfileId = userProfileId;
    }

    public UserEntity(long userId, String firstName, String lastName, String email, String password, Gender gender, long userProfileId) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.userProfileId = userProfileId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(long userProfileId) {
        this.userProfileId = userProfileId;
    }
}
