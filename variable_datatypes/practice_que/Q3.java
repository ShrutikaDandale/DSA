package variable_datatypes.practice_que;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = (pencil + pen + eraser);
        System.out.println("total bill =" + bill);

        float gst = ((bill*18)/100);
        System.out.println("gst="+gst);

        sc.close();
    }
}
