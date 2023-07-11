package Practice_problem_2;

import java.util.Scanner;

public class Summation {
    public void summation(int x){
        int sum=0;
        while(x>=0){
            sum=sum+x;
            x--;
        }
        System.out.println("the total summation of natural num of your given limit is: " +sum);
    }

    public static void main(String[] args) {
        Summation sm = new Summation();
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the limit of your summation: ");
        int s=ss.nextInt();
        sm.summation(s);

    }
}
