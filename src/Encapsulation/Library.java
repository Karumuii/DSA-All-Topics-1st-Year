package Encapsulation;

public class Library {
  
    private int BookID;
    private String BookName;
    
    public void setID(int newID){
        this.BookID = newID;
    }
    public int getID(){
        return BookID;
    }
    public void setBookName(String newBN){
        this.BookName = newBN;
    }
    public String getBN(){
        return BookName;
    }
   
    
}




