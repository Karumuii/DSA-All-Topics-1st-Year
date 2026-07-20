package Abstract;

public class subtraction extends op{
   
        int n1;
        int n2;
        
        subtraction (int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
        }
        @Override
        int operation (){
            return n1 - n2;
        }
        
        
   
}




