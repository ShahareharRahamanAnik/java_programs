package Practice_problem_2;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public void anagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        // check if length is same
        if(a.length() == b.length()) {

            // convert strings to char array
            char[] charArray1 = a.toCharArray();
            char[] charArray2 = b.toCharArray();
            System.out.println("Tha arrays of these words are:\n1."+ Arrays.toString(charArray1)+"\n2."+Arrays.toString(charArray2) );
            // sort the char array
            Arrays.sort(charArray1);
            System.out.println("by sorting 1st array:" + Arrays.toString(charArray1));
            Arrays.sort(charArray2);
            System.out.println("by sorting 1st array:" + Arrays.toString(charArray2));
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(a + " and " + b + " are anagram.");
            }
            else {
                System.out.println(a + " and " + b + " are not anagram.");
            }
        }

    }

    public static void main(String[] args) {
        Anagram ang = new Anagram();
        Scanner ss = new Scanner(System.in);
        System.out.println("type the first Word:");
        String a = ss.nextLine();
        System.out.println("Type the second Word:");
        String b = ss.nextLine();
        ang.anagram(a,b);

    }


    }

