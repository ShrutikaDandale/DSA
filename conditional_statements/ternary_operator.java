package conditional_statements;

public class ternary_operator {
    public static void main(String[] args) {
        int number = 4;

        // to check if the num is odd or even using ternary operator
       String type = ((number%2 == 0) ? "even" : "odd");
       System.out.println(type);
    }
}
