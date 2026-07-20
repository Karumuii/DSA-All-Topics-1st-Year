package Polymorphism.abstracts;

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.makesound();
        
        Animal b = new Dog();
        b.makesound();
    }
}
