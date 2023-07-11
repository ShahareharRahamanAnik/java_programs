package Practice_problem_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Avg_num {
public void ar(int [] a){
    int l = a.length;
    float sum =0;
    for (int i=0;i<l;i++){
        sum=sum+a[i];
    }
    float p = sum/l;
    System.out.println("the average vaule of the array is:"  + p );
}

    public static void main(String[] args) {
        Avg_num avn= new Avg_num();
        Scanner s = new Scanner(System.in);
        System.out.println("input the length of the array:");
        int l =s.nextInt();
        int[] a = new int[l];
        for(int i=0;i<l;i++){
            System.out.println("input the value for:" +(i+1));
            int v =s.nextInt();
            a[i]=v;
        }
        System.out.println("the array is :"+Arrays.toString(a));
        avn.ar(a);


    }
}
