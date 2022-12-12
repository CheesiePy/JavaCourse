package OOP.lesson_seven;
public class BoardChild<T> extends Board<T> {
    private Peace<Integer> peace;


    public BoardChild(T defaultValue) {
        super(3, defaultValue);
        System.out.println("BoardChild constructor");
        System.out.println();
        //TODO Auto-generated constructor stub
    }
    
}
