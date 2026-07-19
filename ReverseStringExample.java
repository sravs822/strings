
// Write a Java program to reverse a given string.
package strings.part3;
import java.util.Scanner;
public class ReverseStringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reverse String:");
		String s=sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		System.out.print(reverse);	
	}

}
