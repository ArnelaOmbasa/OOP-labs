
package week3;

import java.util.Scanner;
public class exercise5 {
    
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.err.println("first word: ");
        String first=reader.nextLine();
         System.err.println("second word: ");
        String second=reader.nextLine();
        
        
        if(first.indexOf(second)==-1){
            System.err.println("does not contain");
         
        }
        else {
              System.err.println("contain "+second);
        }
    }
    
}
