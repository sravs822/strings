
// matches() - Checks whether the entire string matches the given regular expression (regex).
package strings.methods;
public class MatchesMethod {
	public static void main(String[] args) {
		String s = "java";
		System.out.println(s.matches("[a-z]+"));
	    String email = "abc@gmail.com";
	    System.out.println(email.matches(".+@.+\\..+"));
	}
}
