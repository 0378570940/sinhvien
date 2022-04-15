package com.example.demo.models.dto;

import java.util.Date;

public class StudentDto {
    private String name;
    private Date birthday;
    private String address;
    private String phoneNumber;
    private String interests;
    private String facebook;
    private String gender;
    private String maLop;
    private String lop;
    private String giaovien;
    private String dtb;
    private String fullName;
    private String gmail;

    public StudentDto() {
    }

    public StudentDto(String name, Date birthday, String address, String phoneNumber, String interests, String facebook, String gender, String maLop, String lop, String giaovien, String dtb, String fullName, String gmail) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.interests = interests;
        this.facebook = facebook;
        this.gender = gender;
        this.maLop = maLop;
        this.lop = lop;
        this.giaovien = giaovien;
        this.dtb = dtb;
        this.fullName = fullName;
        this.gmail = gmail;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
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

}
