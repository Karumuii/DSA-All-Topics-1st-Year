package Abstract;
// 2/11/26
public class Main {
    public static void main(String[] args) {
         
         addition a = new addition(1,1);     // 2
         subtraction s = new subtraction(10,9); // 1
         
         System.out.println(a.operation());
         System.out.println(s.operation());
         
         
    }
}
