package OOP.Lesson_one;

public class Main {
    public static void main(String[] args) {
        Father tal = new Father(52);
        Father michael = new Father(42, "Michael", "Black");
        Son ari = new Son(12);

        System.out.println(Father.count);
        // System.out.println(tal.add_two(1, 2));
        // System.out.println(ari.add_two(1, 2));
        
    }
}
