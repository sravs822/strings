
// Count Lowercase Letters
package strings.part2;
import java.util.Scanner;
public class CountLowercaseLettersExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:" );
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
