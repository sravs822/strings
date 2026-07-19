
// Reverse each word in a sentence, but keep the word order the same.package strings.part3;
package strings.part3;
import java.util.Scanner;
public class ReverseEachWordExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverse = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }
            System.out.print(reverse + " ");
        }

     
    }
}