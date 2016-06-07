/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.database.entity;

import java.util.Scanner;

/**
 *
 * @author Leviathan
 */
public class Student {

    Scanner ip = new Scanner(System.in);
    private int id;
    private String firstName, lastName, address, contactNo;
    private boolean status;

    public Student() {
    }

    public void program() {
        setId();
        setFirstName();
        setLastName();
        setAddress();
        setContactNo();
        setStatus();

    }

    public String getFullInfo() {
        return ("ID:" + id + "\nName:" + firstName + " " + lastName + "\nAddress:" + address + "\nContact No.:" + contactNo + "\nStaus:" + status);

    }

    public String getFullName() {
        return (firstName + " " + lastName);
    }

    public int getId() {
        return id;
        
    }

    public void setId() {
        System.out.println("Enter the ID:");
        id = ip.nextInt();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        System.out.println("Enter the first name:");
        firstName = ip.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Enter the last name:");
        lastName = ip.next();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.println("Enter the address:");
        address = ip.next();
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo() {
        System.out.println("Enter the contact no.:");
        contactNo = ip.next();
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus() {
        System.out.println("Enter the status[true/false]:");
        Boolean s = ip.nextBoolean();
        status = s == true;

    }

}
