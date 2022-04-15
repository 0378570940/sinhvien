package com.example.demo.models.in;

public class ClassIn {
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

    public ClassIn() {
    }

    public ClassIn(long id, String name, String malop, String phoneNumber, String facebook, String address, String giaovien, String dtb, String fullname, String gmail) {
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

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
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

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
