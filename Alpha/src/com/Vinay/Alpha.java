/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vinay;

/**
 *
 * @author Leviathan
 */
public class Alpha {
String name, address;
int age;

//This is a constructor
   public Alpha(String x){
       name=x;
      
        }
   public int getage(){
      age = 22;
      return age;
   }
   public void setaddr(String y){
     address=y;  
   }
   /*public String getaddr(){
       return address;
   }*/
     
    public static void main(String[] arg) {
        Alpha name = new Alpha("Vinay");
        name.getage( );
        name.setaddr("Sanepa");
       // name.getaddr();
                
        
      System.out.println("My name is " + name.name);
      System.out.println("My age is " + name.age);
      System.out.println("I am from " + name.address);
    }
    
}
