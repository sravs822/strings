import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String s1 = "java     programming Language";
        String[] s2 = s1.split("\\s+");
        System.out.println(Arrays.toString(s2));
        String v = "Sravanthi,Mulagalapalli";
        String[] arr = v.split(",");
        System.out.println(Arrays.toString(arr));
        String s3 = "Python Full stack";
        String[] str = s3.split(" ");

        for(String ss : str) {
            System.out.println(ss);
        }
    }
}