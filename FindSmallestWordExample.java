
// Find the Smallest Word in a Sentence
package strings.part3;
import java.util.Scanner;
public class FindSmallestWordExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[]word=s.split(" ");
		String smallest=word[0];
		for(int i=1;i<word.length;i++) {
			if(word[i].length()<smallest.length()) {
				smallest=word[i];
			}
		}
		System.out.println(smallest);
	}

}
