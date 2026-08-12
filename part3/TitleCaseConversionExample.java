
// Write a Java program to convert a given string into Title Case
// "hello world"        → "Hello World"
// "java programming"   → "Java Programming"
// "welcome to java"    → "Welcome To Java"
package strings.part3;
public class TitleCaseConversionExample {
    public static void main(String[] args) {
        String str = "java is very easy";
        String result = "";
        String[] words = str.split(" ");
        for (String word : words) {
            result = result
                    + Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase()
                    + " ";
        }
        System.out.println("Original String: " + str);
        System.out.println("Title Case: " + result.trim());
    }
}