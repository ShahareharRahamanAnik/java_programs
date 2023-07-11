package Practice_problem_2;

import java.util.Arrays;
import java.util.Scanner;

public class SumFinding {
    public void array(int[] ary, int sum) {
        int n = ary.length;
        int temp = 0;
        Arrays.sort(ary);
        System.out.println("the  rearrange array is : " + Arrays.toString(ary));
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <= n-1; j++) {
                temp = (ary[i] + ary[j]);
                if (temp == sum){
                    System.out.println("from this array the sum of " +ary[i]+ " and "+ary[j]+" is equal to your given value "+sum );
                }
            }
            }
        }

    public static void main(String[] args) {
        SumFinding s = new SumFinding();
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
        System.out.println("your given summation:");
        int k = ss.nextInt();
        s.array(array, k);
    }
}
