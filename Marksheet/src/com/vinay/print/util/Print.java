/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.print.util;

/**
 *
 * @author Leviathan
 */
public class Print {
    
    
    public void print(int a,int b,int c,int d,int e){
        
        System.out.println("\n\tMarks Obtained");
        System.out.println(String.format("\n\tSimulation: %d",a));
        System.out.println(String.format("\tMaths:      %d",b));
        System.out.println(String.format("\tNetwork:    %d",c));
        System.out.println(String.format("\tMultemedia: %d",d));
        System.out.println(String.format("\tAgile:      %d",e));
        
        int total=a+b+c+d+e;
        float per=total/5;
        System.out.println(String.format("\nTotal: %d",total));
        System.out.println(String.format("Percentage: %f", per));
        
        if (a >= 32 && b >= 32 && c >= 32 && d >= 32 && e >= 32) {
            System.out.println("Status: Pass");
           
            if (per >= 75) {
                System.out.println("Division: Distinction");
            } else if (per>= 60 && per < 75) {
                System.out.println("Division: First Division");
            } else if (per >= 40 && per < 60) {
                System.out.println("Division: Second Division");
            } else {
                System.out.println("Division: Pass");
            }
        
        }else System.out.println("Status: Fail");
}
}
