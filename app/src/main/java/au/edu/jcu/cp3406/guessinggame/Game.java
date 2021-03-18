package au.edu.jcu.cp3406.guessinggame;
import java.util.Random;

public class Game {
    private int magicNum;

    public Game (){
        Random rd = new Random();
        magicNum = rd.nextInt(10);
    }

    public boolean check (int guess){
        return (guess == magicNum);
    }
}
