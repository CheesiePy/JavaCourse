package OOP.lesson_8;

public abstract class Animal{
    private int health;
    public Animal(){
        health = 100;
        System.out.println("an animal was created");
    }
    
    public abstract void roar();

    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        if(health < 0){
            return;
        }
        this.health = health;
    }

}
