package com.example.demo.entity;

import jdk.internal.dynalink.GuardedInvocationFilter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Student")
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "malop")
    private String malop;
    @Column(name = "Birthday")
    private Date birthday;
    @Column(name = "Address")
    private String address;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "Interests")
    private String interests;
    @Column(name = "FaceBook")
    private String facebook;
    @Column(name = "GenDer")
    private String gender;
    @Column(name = "lop")
    private String lop;
    @Column(name = "giaovien")
    private String giaovien;
    @Column(name = "dtb")
    private String dtb;

    public StudentEntity() {
    }

    public String getGiaovien() {
        return giaovien;
    }

    public void setGiaovien(String giaovien) {
        this.giaovien = giaovien;
    }

    public String getDtb() {
        return dtb;
    }

    public void setDtb(String dtb) {
        this.dtb = dtb;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public GuardedInvocationFilter stream() {
        return null;
    }
}
