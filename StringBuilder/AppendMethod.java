// append() - Adds the given value to the end of the StringBuilder.

package strings.StringBuilder;
public class AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is a Programming Language. ");
      
        sb.append(" EmployeeId : ");
        sb.append(" 101");
        sb.append(" ,EmployeeName :");
        sb.append(" MadhuLatha");
        sb.append(" ,Salary :");
        sb.append("50,000");
        System.out.println(sb);
        
    }
}