
package week3;


import java.util.ArrayList;
public class exercise7 {
     public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("burch");
        list.add("Test");
        list.add("Aabbaa!");
        list.add("arnela ombasa");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of words is: " + lengths);
        }
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (String words : list) {
            lengths.add(words.length());
        }
        return lengths;
    }
}
