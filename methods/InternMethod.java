
// intern() - Returns the string from the String Constant Pool.
package strings.methods;
public class InternMethod {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		s1 = s1.intern();
		System.out.println(s1 == s2);
	}

}
