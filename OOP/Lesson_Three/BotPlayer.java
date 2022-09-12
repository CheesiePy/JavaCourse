package OOP.Lesson_Three;

import java.util.Random;
import java.util.Scanner;

public class BotPlayer extends AbstractPlayer {

    /* (non-Javadoc)
     * @see OOP.Lesson_Three.AbstractPlayer#play()
     */
    @Override
    public int play() {
        Random random = new Random();
        int rand;
        System.out.println("Bot is playing");
        rand = random.nextInt(9);
        return rand;
        // TODO Auto-generated method stub
        
    }

}
    
