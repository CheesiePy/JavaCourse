package OOP.Lesson_one;
/*
 * This is a class that is used to demonstrate the concept of inheritance.
 * 
 */
public class Father {
    static int count = 0;
    public int age; // this is a protected variable that can be accessed by the child class.
    private String name; // this is a private variable that can only be accessed by the father class.
    private String hairColor;

    public Father(){
        count++;
        this.age = 0;
        this.name = "No name";
        this.hairColor = "No hair color";
    }

    public Father(int age) {
        count++;
        this.setAge(age);
    }

    public Father(int age, String name, String hairColor) {
        count++;
        this.setAge(age);
        this.setName(name);
        this.setHairColor(hairColor);
    }

    

    private void setHairColor(String hairColor2) {
        this.hairColor = hairColor2;
    }

    public int add_two(int a, int b){
        return a + b;
    }

    
    public int add_two(int a){
        return a + 5;
    }

    public int add_two(int a, int b, int c){
        System.out.println("This is three numbers man!");
        return a + b + c;
    }


    public void setAge(int age){
        if (age < 13 || age > 120){
           System.out.println("You are too young to be a father"); 
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return getYearsUntilDeath();
    }

    public void setName(String name){
        if (name.length() < 2){
            System.out.println("name is not long enough");
        }else{
            this.name = name;
        }
    }
    private int getYearsUntilDeath(){
        return 120 - this.age;
    }


}