package conditional_statements;

public class largest_of_num {
    public static void main(String[] args) {
        int a=2, b=3, c=4;
         if(a>=b && a>=c){
            System.out.println("largest is = " + a);
         } 
         else if(b>=c){
            System.out.println("largest is = " + b);
         }
         else{
            System.out.println("largest is = " + c);
         }
    }
}
