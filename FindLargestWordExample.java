
// Given a sentence, print the longest word.
package strings.part3;
import java.util.Scanner;
public class FindLargestWordExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[]word=s.split(" ");
		 String largest=word[0];
		for(int i=1;i<word.length;i++) {
			if(word[i].length()>largest.length()) {
				largest=word[i];
			}
			
		}
		System.out.println(largest);
		
	}

}
