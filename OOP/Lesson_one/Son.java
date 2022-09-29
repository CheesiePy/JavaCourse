package OOP.Lesson_one;
/*
 * This is a class that is used to demonstrate the concept of inheritance.
 * 
 */
public class Son extends Father {
    // This is a constructor that is used to create a son object.
    public Son(int age) {
        super(); // This is a call to the constructor of the father class.
        this.age = 15;
        this.setAge(age);
    }


    public void setAge(int number){
        if (number < 0 || number > 18){
            System.out.println("You are too young to be a son");
        }else{
            this.age = number;
        }
    }

    @Override
    public int add_two(int a, int b){
        return a + b + 1;
    }
}
