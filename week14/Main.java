
package week14;

import java.util.Scanner;
import week14.Education;
import week14.Employees;
import week14.Person;


public class Main {

   
    public static void main(String[] args) {
        /*System.out.print("Give a string: ");
	Scanner reader = new Scanner(System.in);
	String word = reader.nextLine();
	isAWeekDay(word);
        allVowels(word);
        clockTime(word);
        /*Person arto = new Person("Arto", Education.D);
        System.out.println(arto);*/
        
       Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education.GRAD));
        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.GRAD);

        System.out.println("==");

        university.print();
    }
    
        
       public static boolean isAWeekDay(String string) {
	if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The form is fine");
            return true;
	}else{
            System.out.println("The form is wrong");
            return false;
	}
    }
	
    public static boolean allVowels(String string) {
	if(string.matches("(a|e|i|o|u)*")){
            System.out.println("The form is fine");
            return true;
	}else{
            System.out.println("The form is wrong");
            return false;
	}
    }
    
    public static boolean clockTime(String string){
        if(string.matches("(((0|1)[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]")){
            System.out.println("The form is fine");
            return true;
	}else{
            System.out.println("The form is wrong");
            return false;
	}
    }
}

