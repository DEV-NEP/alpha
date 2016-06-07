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
public class StudentDOA {

    private Student[] studentList = new Student[10];
    private int counter=0;
    
    Scanner ip= new Scanner(System.in);

    public void insert(Student s) {
        studentList[counter] = s;
        counter++;
    }

    public boolean delete(int id) {
        for (int i=0;i<studentList.length;i++) {
            Student a=studentList[i];
            if (a != null && a.getId() == id) {
                studentList[i] = null;
                counter--;
                //System.out.println("Deleted");
                return true;
                
            }
        }
        //System.out.println("There is no data");
        return false;
    }

    public Student getById(int id) {
        for (int i=0;i<studentList.length;i++) {
            Student a=studentList[i];
            if (a != null && a.getId() == id) {

                return a;
                
                
            }
        }

        return null;

    }

    public boolean update(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {
                
                s.setFirstName();
                s.setLastName();
                s.setAddress();
                s.setContactNo();
                s.setStatus();
                System.out.println("Now the updated id information is : ");
                System.out.println(s.getFullInfo());
                counter++;
                return true;

            }
        }
        return false;

    }

    public void getAllInfo() {
        for (int i = 0; i < studentList.length;) {
            Student s = studentList[i];
            if (s != null) {
                System.out.println(s.getFullInfo());

            }

        }
    }

}
