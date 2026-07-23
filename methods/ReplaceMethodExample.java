
// replace()--method
package strings.methods;
public class ReplaceMethodExample {
	public static void main(String[] args) {
		String s="I love java";
		String b="banana";
		String e="Education";
		System.out.println(s.replace("java", "python"));
		System.out.println(b.replace('a','o'));
		System.out.println(e.replace('e','*'));
		System.out.println(e.replace('i','*'));
		System.out.println(e.replace('o','*'));
		System.out.println(e.replace('u','*'));
	}
}
