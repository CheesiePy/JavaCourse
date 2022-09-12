package OOP.Lesson_Three;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int counter = 0;
        ArrayList<AbstractPlayer> players = new ArrayList<AbstractPlayer>();
        players.add(new HumanPlayer());
        players.add(new BotPlayer());
        while (flag == false) {
            System.out.println(players.get(counter%2).play());
            if (counter == 9) {
                flag = true;
            }
            counter++;
        }

    }
}
