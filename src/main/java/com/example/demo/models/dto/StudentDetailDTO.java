package com.example.demo.models.dto;

import java.util.Date;

public class StudentDetailDTO extends StudentDto{
    private long id;
    private String name;
    private String malop;
    private String phoneNumber;
    private String facebook;
    private String address;
    private String giaovien;
    private String dtb;
    private String fullname;
    private String gmail;

    public StudentDetailDTO() {
    }

    public StudentDetailDTO(long id, String name, Date birthday, String address, String phoneNumber, String interests, String facebook, String gender, String malop, String lop, String giaovien, String dtb) {
        super(id, name, birthday, address, phoneNumber, interests, facebook, gender, malop, lop, giaovien, dtb);
    }

    public StudentDetailDTO(long id, String name, String malop, String phoneNumber, String facebook, String address, String giaovien, String dtb, String fullname, String gmail) {
        this.id = id;
        this.name = name;
        this.malop = malop;
        this.phoneNumber = phoneNumber;
        this.facebook = facebook;
        this.address = address;
        this.giaovien = giaovien;
        this.dtb = dtb;
        this.fullname = fullname;
        this.gmail = gmail;
    }

    public StudentDetailDTO(long id, String name, Date birthday, String address, String phoneNumber, String interests, String facebook, String gender, String malop, String lop, String giaovien, String dtb, long id1, String name1, String malop1, String phoneNumber1, String facebook1, String address1, String giaovien1, String dtb1, String fullname, String gmail) {
        super(id, name, birthday, address, phoneNumber, interests, facebook, gender, malop, lop, giaovien, dtb);
        this.id = id1;
        this.name = name1;
        this.malop = malop1;
        this.phoneNumber = phoneNumber1;
        this.facebook = facebook1;
        this.address = address1;
        this.giaovien = giaovien1;
        this.dtb = dtb1;
        this.fullname = fullname;
        this.gmail = gmail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMalop() {
        return malop;
    }

    @Override
    public void setMalop(String malop) {
        this.malop = malop;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFacebook() {
        return facebook;
    }

    @Override
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getGiaovien() {
        return giaovien;
    }

    @Override
    public void setGiaovien(String giaovien) {
        this.giaovien = giaovien;
    }

    @Override
    public String getDtb() {
        return dtb;
    }

    @Override
    public void setDtb(String dtb) {
        this.dtb = dtb;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
