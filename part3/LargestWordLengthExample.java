package strings.part3;
public class LargestWordLengthExample {
	public static void main(String[] args) {
		String str = "Java is very powerful";
		String[] words = str.split(" ");
		int maxLength = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
			}
		}
		System.out.println("Largest word length: " + maxLength);
	}
}