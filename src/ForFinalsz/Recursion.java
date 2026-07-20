package ForFinalsz;

public class Recursion {
    public static void main(String[] args) {
        int i = 0;
        recursive(i);
    }
    static void recursive(int i){
        //    >=  works too
        if (i == 5){
            return;
        }
        System.out.println("try and catch");
        recursive(i);
    }
}





