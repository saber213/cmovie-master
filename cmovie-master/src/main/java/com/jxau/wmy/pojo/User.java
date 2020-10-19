package com.jxau.wmy.pojo;

public class User {
    private Integer id;
    private String nickname;
    private String email;
    private String password;
    private String salt;
    private String phone;
    private Integer gender;
    private Integer role;

    public User() {
    }

    public User(Integer id, String nickname, String email, String password, String salt, String phone, Integer gender, Integer role) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.phone = phone;
        this.gender = gender;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}
