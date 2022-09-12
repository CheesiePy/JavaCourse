package OOP.Lesson_two;

public class Cat extends Animal{
    
    public void meow(){
        System.out.println("Meow");
    }
    

    @Override
    public int add_one(int w) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public int add_one(int a, String b){
        return 1;
    }

    public void death(){
        System.out.println("The cat died");
    }
}
