/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.alphabetcheck;

import java.util.Scanner;

/**
 *
 * @author Leviathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text;
        System.out.print("Enter a String:");
        text = in.nextLine();

        int vowelcount = 0;
        int consonant = 0;
       
        text = text.toUpperCase();
        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);

            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowelcount++;
                System.out.println("vowels leters are" + " " + letter);
            } else if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U' && letter != ' ') {
                consonant++;
                System.out.println("consonant leters are" + " " + letter);
            }
        }
        int total = vowelcount + consonant;
        System.out.println("\nTotal no. of alphabets: " + total);
        System.out.println("\nNo. of Vowels:" + vowelcount + "\nNo. of Consonants :" + consonant);

    }
}
