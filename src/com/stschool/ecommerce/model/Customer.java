package com.stschool.ecommerce.model;

import com.stschool.ecommerce.enums.Gender;
import com.stschool.ecommerce.enums.MemberShip;
import com.stschool.ecommerce.enums.Status;

import java.util.Objects;

public class Customer {
   private int id;
   private String name;
   private  String email;
   private String phoneNumber;
   private byte age;
   private Gender gender;
   private MemberShip memberShip;
   private Status status;
   private  Address shippingAddress;
   private  Address residentalAddress;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return  this;
    }

    public byte getAge() {
        return age;
    }

    public Customer setAge(byte age) {
        this.age = age;
        return  this;
    }

    public Gender getGender() {
        return gender;
    }

    public Customer setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    public Customer setMemberShip(MemberShip memberShip) {
        this.memberShip = memberShip;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Customer setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Customer setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public Address getResidentalAddress() {
        return residentalAddress;
    }

    public Customer setResidentalAddress(Address residentalAddress) {
        this.residentalAddress = residentalAddress;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && age == customer.age && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(phoneNumber, customer.phoneNumber) && gender == customer.gender && memberShip == customer.memberShip && status == customer.status && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(residentalAddress, customer.residentalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNumber, age, gender, memberShip, status, shippingAddress, residentalAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", memberShip=" + memberShip +
                ", status=" + status +
                ", shippingAddress=" + shippingAddress +
                ", residentalAddress=" + residentalAddress +
                '}';
    }
}
