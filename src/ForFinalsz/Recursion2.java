package ForFinalsz;

public class Recursion2 {
    static int sum = 0; //Global variable, use static
    public static void main(String[] args) {
        int i = 0;
        recursive(i);
        System.out.println(sum);
    }
    static void recursive(int i){
        if (i >= 5){
          return;
        }
        sum = sum + i;
        System.out.println("try and catch");
        recursive(i + 1);
        
    }
}




