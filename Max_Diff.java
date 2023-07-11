package Practice_problem_2;

import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.abs;
import static sun.util.calendar.CalendarUtils.mod;

public class Max_Diff {
    public void small(int [] ary){
        Arrays.sort(ary);
        System.out.println("the  rearrange array is : " + Arrays.toString(ary));
        int l = ary.length;
        int diff =0;
        int p=0;
        int a=0;
        int b=0;
        for (int i=0;i<l-1;i++){
            p= (Math.abs(ary[i+1]-ary[i]));
            if(diff<p){
                diff=p;
                 a = ary[i+1];
                 b = ary[i];
            }
        }
        System.out.println("the highest difference is: "  + diff+ ".\nwhich is between: "+a+ " and "+b );
    }
    public static void main(String[] args) {
        Max_Diff s = new Max_Diff();
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
