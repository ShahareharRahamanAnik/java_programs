package Practice_problem_2;

import javax.script.ScriptContext;
import java.util.Scanner;

public class CharacterOccurrence {
    public void occ(String s, char c){
        int count=0;
        int n=s.length();
        for (int i = 0; i<n; i++){
            if(c == s.charAt(i)){
                count++;
            }
        }
        System.out.println(c + " is "+ count+ " times in the word");
    }

    public static void main(String[] args) {
        CharacterOccurrence co = new CharacterOccurrence();
        Scanner ss = new Scanner(System.in);
        System.out.println("Input a word:");
        String s= ss.nextLine();
        System.out.println("which letter do you want to count:");
        char c = ss.next().charAt(0);
        co.occ(s,c);
    }
}
