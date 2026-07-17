// Print Characters at Even Indexes
package strings.part1;
import java.util.Scanner;
public class EvenIndexCharactersExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
