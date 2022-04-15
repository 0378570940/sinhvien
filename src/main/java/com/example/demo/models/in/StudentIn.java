package com.example.demo.models.in;

import com.example.demo.models.dto.ClassDto;

import java.util.Date;

public class StudentIn  {
    private long id;
    private String name;
    private Date birthday;
    private String address;
    private String phoneNumber;
    private String interests;
    private String facebook;
    private String gender;
    private String malop;
    private String lop;
    private String giaovien;
    private String dtb;

    public StudentIn() {
    }

    public StudentIn(String name, Date birthday, String address, String phoneNumber, String interests, String facebook, String gender, String malop, String lop, String giaovien, String dtb) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.interests = interests;
        this.facebook = facebook;
        this.gender = gender;
        this.malop = malop;
        this.lop = lop;
        this.giaovien = giaovien;
        this.dtb = dtb;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
