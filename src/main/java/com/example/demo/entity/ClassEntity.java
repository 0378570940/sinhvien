package com.example.demo.entity;

import javax.persistence.*;

@Entity(name = "Class")
@Table(name = "Class")
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "malop")
    private String malop;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "FaceBook")
    private String facebook;
    @Column(name = "Address")
    private String address;
    @Column(name = "giaovien")
    private String giaovien;
    @Column(name = "dtb")
    private String dtb;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "gmail")
    private String gmail;

    public ClassEntity() {
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public long getId() {
        return id;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
