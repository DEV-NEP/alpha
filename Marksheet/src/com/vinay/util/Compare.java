/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.util;
import java.util.Scanner;
import com.vinay.print.util.Print;
/**
 *
 * @author Leviathan
 */
public class Compare {
    
    

    public void comp(String name,int sym) {
              
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks in Simulation: ");
        int a =in.nextInt();
        System.out.println("Enter marks in Maths: ");
        int b =in.nextInt();
        System.out.println("Enter marks in Network: ");
        int c =in.nextInt();
        System.out.println("Enter marks in Multimedia: ");
        int d =in.nextInt();
        System.out.println("Enter marks in Agile: "); 
        int e =in.nextInt();
        
        System.out.println("\n      -------MARKSHEET-------");
        System.out.println(String.format("\nName: %s\tSymbol No.: %d",name,sym));
        
        Print pr= new Print();
        pr.print(a,b,c,d,e);
        
    }
    
        
        
        
    }

