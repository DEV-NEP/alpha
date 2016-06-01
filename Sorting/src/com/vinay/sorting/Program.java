/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.sorting;

/**
 *
 * @author Leviathan
 */
public class Program {
    
    public static void asc(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("In ascending order: ");
        for(int i=0;i<num.length;i++){
        System.out.println(num[i]);
        }
    }
    
    public static void des(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]<num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("\nIn descending order: ");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num={2,1,5,15,8,16,12,1};
        asc(num);
        des(num);
        
// TODO code application logic here
    }
    
}
