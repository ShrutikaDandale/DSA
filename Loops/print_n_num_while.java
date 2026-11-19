package Loops;
import java.util.*;

public class print_n_num_while {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 int n = sc.nextInt();

    int num = 1;
    while(num <= n){
        System.out.println(num);
        num++;
    }
    
    sc.close();
 }
    
}