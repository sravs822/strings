// Count the total number of special characters in a String.
package strings.part2;
import java.util.Scanner;
public class CountSpecialCharactersExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Count the total number of special characters:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')|| (ch>='0' && ch<='9')||(ch==' ')) {
				continue;
				
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}

}
