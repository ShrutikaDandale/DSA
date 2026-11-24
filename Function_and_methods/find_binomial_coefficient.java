package Function_and_methods;

public class find_binomial_coefficient {

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nminusr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nminusr);

        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}



// formula of binCoeff is - n!/(r! * (n-r)!)