package Practice_problem_2;

import java.util.Arrays;
import java.util.Scanner;

public class RotateanArray {
    public void rotate(int[] array, int k) {
        int len = array.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }
        for (int i = k; i < len; i++) {
            array[i - k] = array[i];
        }
        for (int i = 0; i < k; i++) {
            array[len - k + i] = temp[i];
        }
        System.out.println("the array is:" + Arrays.toString(array));

    }

    public static void main(String[] args) {
        RotateanArray r = new RotateanArray();
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
        System.out.println("input a value from where you want to break:");
        int k =ss.nextInt();
        r.rotate(array,k);
    }
}
