
// Count Total Words in a Sentence
package strings.part3;
import java.util.Scanner;
public class WordCountExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = s.split(" ");
        System.out.println("Total Words : " + word.length);

    }
}