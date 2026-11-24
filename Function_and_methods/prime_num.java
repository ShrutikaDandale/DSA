package Function_and_methods;

public class prime_num {
    
    public static boolean isPrime(int n){
        // corner cases
        // for 2
        if(n == 2){
            return true;
        }
        
        for(int i=2; i<n-1; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
