package Practice_problem_2;

import java.util.Scanner;

public class Factorial {
        public void fact(int x){
            int mul = 1;

            while (  x>=1) {
                mul = mul * x;
                x--;

            }
            System.out.println(" The factorial value is : " + mul );

        }

        public static void main(String[] args) {
            Factorial pm = new Factorial();
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter any number: ");
            int sp = sc.nextInt();
            pm.fact(sp);
        }
    }

