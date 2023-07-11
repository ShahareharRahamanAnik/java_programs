package Practice_problem_2;

import java.util.Arrays;
import java.util.Scanner;

public class Secondsmallestarrays {
    public void small(int [] ary){
        Arrays.sort(ary);
        System.out.println("the  rearrange array is : " + Arrays.toString(ary));
        System.out.println("the Second smallest element is:" + ary[1]);
    }
    public static void main(String[] args) {
        SecondSmallestElement s = new SecondSmallestElement();
        Scanner ss = new Scanner(System.in);
        System.out.println(" input the range of your array:");
        int n = ss.nextInt();
        int [] array = new int[n];
        for (int x = 0 ; x<=n-1; x++){
            System.out.println("input the value for " + x + " :");
            int p = ss.nextInt();
            array[x]=p;
        }
        System.out.println("the array is : " + Arrays.toString(array));
        s.small(array);
    }
}
