// Count the total number of spaces in a String.
package strings.part2;
import java.util.Scanner;
public class CountSpacesExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Count the spaces:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
