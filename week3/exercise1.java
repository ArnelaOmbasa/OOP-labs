

package week3;

public class exercise1 {

   public static double average(int number1,int number2,int number3,int number4){
       int sum=number1+number2+number3+number4;
       return (sum/(4f));
   }
    public static void main(String[] args) {
        double answer=average(4,3,3,1);
        System.err.println(answer);
       
    }
    
}
