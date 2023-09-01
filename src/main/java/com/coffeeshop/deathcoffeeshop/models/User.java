package com.coffeeshop.deathcoffeeshop.models;

import jakarta.persistence.*;

@Entity
@Table(name= "user")
public class User {
    @Id
//    GenerationType.Identity assigns primary key using databaase identity column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="username",nullable = false, length = 50, unique = true)
    private String username;
    @Column(name="fname",nullable = false, length = 50, unique = true)
    private String fname;
    @Column(name="lname",nullable = false, length = 50, unique = true)
    private String lname;
    @Column(name="email",nullable = false, length = 100, unique = true)
    private String email;
    @Column(name="password",nullable = false, length = 100, unique = true)
    private String password;
    @Column(name="confpassword",nullable = false, length = 100, unique = true)
    private String confpassword;
    @Column(name="address",nullable = false, unique = true)
    private String address;
    @Column(name="address2",nullable = false, unique = true)
    private String address2;
    @Column(name="city",nullable = false, length = 50, unique = true)
    private String city;
    @Column(name="state",nullable = false, length = 50, unique = true)
    private String state;
    @Column(name="zip",nullable = false, length = 20, unique = true)
    private String zip;

    // Constructors


    public User(Long id, String username, String fname, String lname, String email, String password, String confpassword, String address, String address2, String city, String state, String zip) {
        this.id = id;
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.confpassword = confpassword;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public User() {

    }
//Getters and Setter Methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public String getConfpassword() {
        return confpassword;
    }

    public void setConfpassword(String confpassword) {
        this.confpassword = confpassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
//Generated ToString method
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confpassword='" + confpassword + '\'' +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
