package Practice_problem_2;
import java.util.Arrays;
import java.util.Scanner;
public class large_value {
        public void ar(int [] a){
            int l = a.length;
            int large =a[0];
            for (int i=0;i<l-1;i++){
                if(large<a[i+1]){
                    large=a[i+1];
                }
            }
            System.out.println("the large value of the array is:"  + large );
        }
        public static void main(String[] args) {
            large_value avn= new large_value();
            Scanner s = new Scanner(System.in);
            System.out.println("Input the length of the array:");
            int l =s.nextInt();
            int[] a = new int[l];
            for(int i=0;i<l;i++){
                System.out.println("input the value for:" +(i+1));
                int v =s.nextInt();
                a[i]=v;
            }
            System.out.println("the array is :"+ Arrays.toString(a));
            avn.ar(a);
        }
    }

