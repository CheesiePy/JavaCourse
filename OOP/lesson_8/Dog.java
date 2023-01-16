package OOP.lesson_8;

public class Dog extends Animal{
    
    public Dog(){
        System.out.println("a dog was created");
    }

    @Override
    public void roar() {
        System.out.println("wolf");
        
    }
}
