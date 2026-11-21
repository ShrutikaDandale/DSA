package Loops;
import java.util.*;

public class continue_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your num: ");
            int num = sc.nextInt();

            if(num%10 == 0){
                continue;
            }

            System.out.println("your num was: " + num);
        } while(true);
    }
}
