package Practice_problem_2;

public class anagrams {
    
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";

        boolean ana =isAnagram(str1, str2);

        if (ana) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            System.out.println(ch);
            charCount[ch]++;
            System.out.println("ক্ক"+charCount[ch]);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            System.out.println(ch);
            charCount[ch]--;
            System.out.println(charCount[ch]);
        }

        for (int i = 0; i < 256; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
