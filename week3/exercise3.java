
package week3;
import java.util.Scanner;

public class exercise3 {
    
  public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        int counter = 1;
        while (counter <= name.length()) {
            System.out.println(counter + ". letter " + name.charAt(counter-1));
            counter++;

        }
    }
    
}
