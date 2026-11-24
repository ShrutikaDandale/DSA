package Function_and_methods;

public class fxn_overloading_using_datatypes {
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }


       public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(4.5f, 5.6f));
       }
}
