
// Count Total Characters (without directly printing length())
package strings.part1;
import java.util.Scanner;
public class CharacterCountExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int totalCharCount=0;
		for(int i=0;i<s.length();i++) {
			totalCharCount++;
		}
		System.out.println(totalCharCount);
	}

}
