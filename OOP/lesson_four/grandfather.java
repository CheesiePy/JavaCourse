package OOP.lesson_four;

public class grandfather {
    // // we have four access modifiers in java
    // String name; // default
    // public int age; // public
    // protected int height; // protected
    // private int weight; // private
    private int age;
    
    private boolean Alive;

    public grandfather() {
        this.age = 0;
        this.Alive = true;
    }

    public void grow(){
        if (this.age >= 120){
            this.Alive = false;
            System.out.println("the dead can't grow");
            return;
        }
        if(this.Alive){
            this.age++;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age > 120){
            setAlive(false);
            return;
        }
        if(age < 0){
            System.out.println("Age can't be negative");
            return;
        }
        this.age = age;
    }


    public boolean isAlive() {
        return Alive;
    }


    private void setAlive(boolean isAlive) {
        this.Alive = isAlive;
    }

    

}
