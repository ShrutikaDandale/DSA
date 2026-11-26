package Arrays;

public class linear_search_practice {
    public static int linSer(String fruits[], String key) {
       
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String fruits [] = {"mango", "guava", "banana"};
        String key = "mango";

         int index = linSer(fruits, key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println("key is found at index : "+ index);
        }

    }
}
