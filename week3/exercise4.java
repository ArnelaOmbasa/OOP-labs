
package week3;

import java.util.Scanner;
public class exercise4 {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        System.out.println("Name written in reverse order: ");
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i)+" ");
        }}
}
