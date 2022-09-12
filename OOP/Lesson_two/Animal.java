package OOP.Lesson_two;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void death(){};

    public abstract int add_one(int a);

    public abstract int add_one(int a, String b);


    public String print(){
        return this.name;
    }
    
}