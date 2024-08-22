import java.util.Scanner;
import java.util.Random;

public class Random_number_game{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chance = 10;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Hey Buddy");
        System.out.println("Wanna play a game? You have " + chance + " hances to win this game");
        while (playAgain) {
            int Random = getRandomN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chance; i++) {
                System.out.println("Chace  " + (i + 1) + " Enter your guess: ");
                int player = sc.nextInt();
                if (player == Random) {
                    guess = true;
                    finals += 1;
                    System.out.println("You did it you won nice job!!");
                    break;
                } else if (player > Random) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
            }
            if (guess==false) {
                System.out.println("Sorry friend.You lost the game.The number is : " + Random);
            }
            System.out.println("DO you want to play again(y/n)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("y");
        }
        System.out.println("Thats it my friend,Hope you enjoyed it :)");
        System.out.println("Here is your score " + finals);
    }
    public static int getRandomN(int min, int max){
        return(int)(Math.random()*(max-min+1))+min;

    }


}


