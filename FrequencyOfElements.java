package Practice_problem_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {
    public void frequency(int [] array){
        Map<Integer, Integer> freq = new HashMap<>();
        for (int element : array) {
            if (freq.containsKey(element)) {
                freq.put(element, freq.get(element) + 1);
            } else {
                freq.put(element, 1);
            }
        }

        // Print the frequency of each element.
        System.out.println("The frequency of each element is:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        FrequencyOfElements fe = new FrequencyOfElements();
        Scanner ss = new Scanner(System.in);
        System.out.println("input the range of your array:");
        int n = ss.nextInt();
        int [] array = new int[n];
        for (int x = 0 ; x<=n-1; x++){
            System.out.println("input the value for " + x + " :");
            int p = ss.nextInt();
            array[x]=p;
        }
        System.out.println("the array is : " + Arrays.toString(array));
        fe.frequency(array);
    }
}
