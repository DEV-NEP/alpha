/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay;

import java.util.Scanner;
import com.vinay.util.Compare;

/**
 *
 * @author Leviathan
 */
public class Program {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        int b;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Name: ");
            a = in.next();
            
            System.out.println("Enter your Symbol No.: ");
            b = in.nextInt();

            Compare cmp = new Compare();
            cmp.comp(a, b);
            System.out.println("\nDo you want to enter next data?[Y/N]");
            if (in.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }
    }

}
