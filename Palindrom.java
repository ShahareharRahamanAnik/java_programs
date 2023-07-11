package Practice_problem_2;


import java.util.Scanner;

public class Palindrom {
    //public void pal (String s){
    public static boolean  pal(String s ){

        int left = 0 ;
        int right = s.length()-1;
        while( left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        Palindrom pm = new Palindrom();
        Scanner sc = new Scanner(System.in);
        for ( ; ; ) {
            System.out.println("Enter the word: ");
            String ss = sc.nextLine();
            pm.pal(ss);
            if (pal(ss)){
                System.out.println( ss  + " : This is palindrom");
            }
            else {
                System.out.println(ss + ": This is not palindrom");
            }
        }
    }
}