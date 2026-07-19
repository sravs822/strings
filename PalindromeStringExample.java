
// A string is called a palindrome if it reads the same forward and backward.

package strings.part3;
import java.util.Scanner;
public class PalindromeStringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Checks palindrome or not : ");
		String s=sc.nextLine();
		String original=s;
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
