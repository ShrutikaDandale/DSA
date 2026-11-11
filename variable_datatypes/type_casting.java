// type castng - if we wanna convert the values which are lossy


package variable_datatypes;
import java.util.*;

public class type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float a =23.43f;
        int b = (int) a;
        System.out.println(b);



        // type casting means convertion of charectors into integers are also possible 
        char ch = 'a';
        int number = ch;
        System.out.println(number);

        sc.close();

    }
} 
