package Arrays;
import java.util.*;

public class ip_op_update {
    public static void main(String[] args) {
        int marks[] = new int[100]; //define the array
        
        Scanner sc = new Scanner(System.in);

        System.out.println("length of array: "+ marks.length);

        marks[0] = sc.nextInt(); //marks of 0th index
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("math :" + marks[2]);

        //update array
        marks[2] = marks[2]+1;
        System.out.println("math :" + marks[2]);

        // percentage calculation
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");

        sc.close();
    }

}
