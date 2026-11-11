package variable_datatypes;
import java.util.*;

public class input {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // this is used for a single word
        String input = sc.next();
        System.out.println(input);

        //for string - this is use for the whole line
        String name = sc.nextLine();
        System.out.println(name);

        // for int
        int number = sc.nextInt();
        System.out.println(number);

        // for float
        float price = sc.nextFloat();
        System.out.println(price);

        // for double
        double num = sc.nextDouble();
        System.out.println(num);

        // for boolean
        boolean b = sc.nextBoolean();
        System.out.println(b);

        // for short 
        short s = sc.nextShort();
        System.out.println(s);

        // for long 
        long l = sc.nextLong();
        System.out.println(l);

     }
}
