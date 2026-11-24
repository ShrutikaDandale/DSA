package Function_and_methods;

public class function_overloading_using_parameters {

    // function to calc sum of 2 num
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calc sum of 3 num
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(4, 5, 6));
    }

 }
