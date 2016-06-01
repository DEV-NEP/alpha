/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.mrkshtUsingArray;

import java.util.Scanner;

/**
 *
 * @author Leviathan
 */
public class Program {

    public static void print(String[] a, float[] b) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(String.format("\t%s\t%f", a[i], b[i]));
        }

    }
    

    public static void calc(float[] a) {

        if (a[0] >= 32 && a[1] >= 32 && a[2] >= 32 && a[3] >= 32 && a[4] >= 32) {
            float total = 0;
            float percent;
            System.out.println("\nStatus: Pass");

            for (int i = 0; i < a.length; i++) {
                total += a[i];
            }
            System.out.println("Total: " + total);
            percent = total / 5;
            System.out.println("Percentage: " + percent);

            if (percent >= 75) {
                System.out.println("Division: Distinction");
            } else if (percent >= 60 && percent < 75) {
                System.out.println("Division: First Division");
            } else if (percent >= 40 && percent < 60) {
                System.out.println("Division: Second Division");
            } else {
                System.out.println("Division: Third Division");
            }
        } else {
            System.out.println("\nStatus: Fail");
        }
    }

    
    public static void main(String[] args) {
        String[] sub = {"Science", "Social", "Maths", "Health", "Account"};
        float[] marks = new float[sub.length];

        Scanner ip = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the name: ");
            String a = ip.next();
            System.out.println("Enter the symbol no.: ");
            int b = ip.nextInt();

            for (int i = 0; i < marks.length; i++) {
                System.out.println("Enter the marks in " + sub[i]);
                marks[i] = ip.nextFloat();
            }

            System.out.println("\n\t------MARKSHEET------");
            System.out.println(String.format("\nName: %s\tSymbol No.: %d", a, b));
            System.out.println("\n\tMarks Obtained\n");

            print(sub, marks);
            calc(marks);

            System.out.println("\nDo you want to continue?[Y/N]");
            if (ip.next().equalsIgnoreCase("N")) {
                System.exit(0);
            }

        }

    }
}
