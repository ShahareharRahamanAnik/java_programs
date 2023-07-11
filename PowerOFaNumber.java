package Practice_problem_2;

import java.util.Scanner;

public class PowerOFaNumber {
    public void power(int exponent , int b){
        long power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= b;
        }

        System.out.println(b + " to the power of " + exponent + " is " + power);
    }

    public static void main(String[] args) {

        PowerOFaNumber pw = new PowerOFaNumber();
        Scanner s = new Scanner(System.in);
        System.out.println("input the exponent:");
        int e = s.nextInt();
        System.out.println("input the base:");
        int b = s.nextInt();
        pw.power(e,b);
    }
}
