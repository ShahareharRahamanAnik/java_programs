package Practice_problem_2;

import java.util.Scanner;

public class CheckOddEven {
   public void num(int x){
       if (x%2 ==0){
           System.out.println("This is Even");
       } else {
           System.out.println("This is Odd");
       }
   }

    public static void main(String[] args) {
        CheckOddEven c = new CheckOddEven();
        Scanner s = new Scanner(System.in);
        for ( ; ; ){
        System.out.println("Enter a number:");
        int n = s.nextInt();
        c.num(n);
    }
   }
}
