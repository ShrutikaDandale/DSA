package operators;

public class arithematic {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // binary
        System.out.println("sum = " + (a+b));
        System.out.println("sub = " + (a-b));
        System.out.println("mul = " + (a*b));
        System.out.println("div = " + (a/b));
        System.out.println("mod = " + (a%b));


        // unary
        int c = 10;
        int d = ++c;
        int e = c++;
        int f = c--;
        int g = --c;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
