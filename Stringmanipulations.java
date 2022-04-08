/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulations;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Stringmanipulations {
    String data;

   Stringmanipulations(String r) {
       data=r;
    }
    public void strlen(){
        System.out.println(" The length of the string is:"+data.length());
    }
     public void strConcat(){
         System.out.println("The string concated with hello is:"+(data.concat("hello")));
     }
     public void strcmp(){
         System.out.println("The string compared is:"+(data.compareTo("JAVA")));
     }
     
     
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String str;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the string:");
      str=sc.nextLine();
      
      Stringmanipulations s1= new Stringmanipulations(str);
      s1.strlen();
      s1.strConcat();
      s1.strcmp();
        // TODO code application logic here
    }
    
}
