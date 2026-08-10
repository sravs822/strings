
// Count occurrences of one given characte
package strings.part2;
import java.util.Scanner;
public class CountCharacterOccurrencesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        System.out.println("Enter Character:");
        char target = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences : " + count);
        
    }
}