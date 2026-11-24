package Function_and_methods;

import java.util.Scanner;

public class syntax_with_parameter {


    // parameter or formal parameters
    public static int calculateSum(int num1, int num2){ 
        int sum = num1 + num2;
        return sum;
    }


    // arguments or actual parameters
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int sum = calculateSum(a, b);
     System.out.println("The sum is: " + sum);   
    }
    
}
