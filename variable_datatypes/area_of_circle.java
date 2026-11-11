package variable_datatypes;
import java.util.*;

public class area_of_circle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double r = sc.nextFloat();
    double pie = 3.14;
    double area = (pie * r * r);

    System.out.println("area"+"="+area);

    sc.close();
}  
}
