package Practice_problem_2;

import java.util.Scanner;

public class MaxNum {
    public void max(int x, int y, int z){
        if(x>y && x>z){
            System.out.println("The Maximum num is : " +x);
        } else if (x>y && x<z) {
            System.out.println("The Maximum num is : " +z);
        } else {
            System.out.println("The Maximum num is : " +y);
        }
    }

    public static void main(String[] args) {
        MaxNum m = new MaxNum();
        Scanner s = new Scanner(System.in);
        System.out.println("input the first num:");
        int k = s.nextInt();
        System.out.println("input the Second num:");
        int l = s.nextInt();
        System.out.println("input the Third num:");
        int n = s.nextInt();
        m.max(k,l,n);
    }
}

