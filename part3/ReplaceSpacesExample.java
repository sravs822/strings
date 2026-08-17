package strings.part3;
public class ReplaceSpacesExample {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String result = str.replace(" ", "-");
        System.out.println("Original String: " + str);
        System.out.println("After Replacing Spaces: " + result);
    }
}