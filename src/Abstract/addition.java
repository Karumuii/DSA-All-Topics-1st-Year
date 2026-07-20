package Abstract;

public class addition extends op{
        
        int num1;
        int num2;
    
        addition (int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
        @Override
        int operation(){
            return num1 + num2;
        }
        
        
   
}




