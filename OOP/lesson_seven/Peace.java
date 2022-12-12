package OOP.lesson_seven;

public class Peace<T> {
    private T value;

    public Peace(T value) {
        this.value = value;
        System.out.println("Peace constructor");

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    

    
}
