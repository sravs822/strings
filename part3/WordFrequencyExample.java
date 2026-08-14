// Write a Java program to find the frequency of each word in a given string.
// Input:
// java is easy and java is powerful
//Output:
//java = 2
//is = 2
//easy = 1
//and = 1
//powerful = 1
package strings.part3;
import java.util.*;
public class WordFrequencyExample {
    public static void main(String[] args){
        String str = "java is easy and java is powerful";
        String[] words = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        for (String word : hm.keySet()) {
            System.out.println(word + " = " + hm.get(word));
        }
    }
    }




