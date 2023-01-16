package OOP.lesson_8;

public class Cat extends Animal {
    
    public Cat(){
        System.out.println("a cat was created");
    }
    public void pour(){
        this.setHealth(getHealth() + 1);
    }
    @Override
    public void roar() {
        System.out.println("mew");
    }
}
