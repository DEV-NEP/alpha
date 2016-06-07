/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.database;
import com.vinay.database.entity.Menu;
//import com.vinay.database.entity.Student;
import java.util.Scanner;
/**
 *
 * @author Leviathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ip=new Scanner(System.in);
        //Student std=new Student();
        Menu menu=new Menu();
        
        System.out.println("WELCOME TO MANAGEMENT SYSTEM");
        System.out.println("1.Teaching Staffs Information");
        System.out.println("2.Student Information");
        System.out.println("3.Non-teaching Staffs Information");
        System.out.println("Enter your choice[1-3]");
        switch(ip.nextInt()){
            
            case 2:
                menu.main();
                
        }
        
        // TODO code application logic here
    }
    
}
