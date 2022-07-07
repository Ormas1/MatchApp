package com.matches.matchApp.dtos;

import com.matches.matchApp.entities.UserEntity;
import com.matches.matchApp.enums.Gender;

public class User {
    private long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Gender gender;
    private long userProfileId;

    public User() {
    }

    public User(UserEntity userEntity) {
        this.firstName = userEntity.getFirstName();
        this.lastName = userEntity.getLastName();
        this.email = userEntity.getEmail();
        this.password = userEntity.getPassword();
        this.gender = userEntity.getGender();
        this.userProfileId = userEntity.getUserProfileId();
    }

    public User(long userId, String firstName, String lastName, String email, String password, Gender gender, long userProfileId) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.userProfileId = userProfileId;
    }

    public User(String firstName, String lastName, String email, String password, Gender gender, long userProfileId) {
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
