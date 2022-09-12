package OOP.Lesson_Three;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

    @Override
    public int play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 - 9: ");
        int number = sc.nextInt();
        // TODO Auto-generated method stub
        return number;
    }

}
