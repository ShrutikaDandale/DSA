package conditional_statements;

public class check_pass_fail {
    public static void main(String[] args) {
        int marks = 67;

        String reportcard = marks >= 33 ? "pass" : "fail";
        System.out.println(reportcard);
    }
}
