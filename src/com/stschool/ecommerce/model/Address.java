package com.stschool.ecommerce.model;

public class Address {
    private String houseNumber;
    private String areaName;
    private String landMark;
    private String city;
    private String pinCode;
    private  String state;

    public Address() {
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public Address setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getPinCode() {
        return pinCode;
    }

    public Address setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public String getAreaName() {
        return areaName;
    }

    public Address setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public String getLandMark() {
        return landMark;
    }

    public Address setLandMark(String landMark) {
        this.landMark = landMark;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }
}
