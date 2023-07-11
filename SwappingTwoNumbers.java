package Practice_problem_2;

import javax.script.ScriptContext;
import java.util.Scanner;

public class SwappingTwoNumbers {
    public void nums(int x, int y){
        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println("The Swapping value is: \nSwapping first value, A: " +x+"\nSwapping Second value, B: " +y);
    }

    public static void main(String[] args) {
        SwappingTwoNumbers STN = new SwappingTwoNumbers();
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the first value A: ");
        int a = ss.nextInt();
        System.out.print("Enter the second value B: ");
        int b = ss.nextInt();
        STN.nums(a,b);

    }
}
