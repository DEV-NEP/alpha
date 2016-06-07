
package com.Vinay;

/** @author Leviathan
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
   public String getaddr(){
       return address;
   }
     
    public static void main(String[] arg) {
        Alpha name = new Alpha("Vinay KC");
        name.getage( );
        name.setaddr("Sanepa, Kathmandu");
       // name.getaddr();
                
        
      System.out.println("My name is " + name.name);
      System.out.println("My age is " + name.age);
      System.out.println("I am from " + name.getaddr());
      System.out.println("And I am a Computer Engineering student at ACEM ");
    }
    
}
