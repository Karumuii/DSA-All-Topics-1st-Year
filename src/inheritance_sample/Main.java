package inheritance_sample;

public class Main {
    public static void main(String[] args) {
         
        // Inheritance = One class inherits the attributes and methods 
        //               from another class/
        //               Children <- Parent <- Grandparent
        
        
         Cat cat = new Cat();
         Dog dog = new Dog();
         
         dog.eat();
         cat.eat();
         
         System.out.println(dog.age);
         System.out.println(cat.age);
         
         dog.speak();
         cat.speak();
         
        dog.isAlive = false;
         System.out.println("The Dog is Alive? " + dog.isAlive);
         System.out.println("The Cat is Alive? " + cat.isAlive);
         
         
    }
}
