/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum1;

/**
 *
 * @author Leviathan
 */
public class SUM1 {

    
     public static int add(){
        int sum=0;     
      for(int i=1;i<=10;i++){
        sum=sum+(2*i);
        
      }
      //System.out.println(sum);
        return sum;
     } 
    public static void main(String[] args) {
        System.out.println(add());
    }  
       
       
       
       
        
        
    
}
