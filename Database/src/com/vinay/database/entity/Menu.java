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
public class Menu {
    
    static Scanner ip = new Scanner(System.in);

    public void main() {
        
        StudentDOA stdDOA=new StudentDOA();
        while (true) {

            System.out.println("Your choices are : ");
            System.out.println("1. Insert   \n2. Search   \n3. Delete   \n4. Update   \n5. View all records   \n6. Exit    ");
            System.out.print("Enter any one option [1-6] : ");

            switch (ip.nextInt()) {

                case 1: {
                    Student std=new Student(); 
                    std.program();
                    break;
         
                }

                case 2: {
                    System.out.print("Enter the ID of Student to search: ");
                    int insId = ip.nextInt();
                    Student s=stdDOA.getById(insId);
                    System.out.println(s.getFullInfo());
                    break;
                }

                case 3: {
                    System.out.println("Enter the ID of Student to delete: ");
                    int delId = ip.nextInt();
                    System.out.println(stdDOA.delete(delId));
                    
                    break;
                }

                case 4: {
                    System.out.println("Enter the ID of Student to update: ");
                    int upId = ip.nextInt();
                    System.out.println(stdDOA.update(upId));
                    
                    break;
                }

                case 5: {
                    stdDOA.getAllInfo();
                    
                    break;
                }

                case 6: {
                    System.exit(0);
                    break;
                }

                }

            }

        }
    }