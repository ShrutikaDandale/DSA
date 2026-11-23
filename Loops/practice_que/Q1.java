// Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.

package Loops.practice_que;
import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalnum= sc.nextInt();
        int evensum = 0;
        int oddsum = 0;

        for(int i=0; i<totalnum; i++){
            int num = sc.nextInt();
            if( i % 2 == 0 ){
                 evensum = num + evensum;
            }
            
            else{
                oddsum = num + oddsum; 
            }
        }
        
        System.out.println("evensum: " + evensum);
        System.out.println("oddsum: " + oddsum);

    }
    
}