import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class guessname {
    public static void main(String[]args){
        Scanner reader=new Scanner(System.in);
        String play="yes";
        //while loop to determine if we are going to play the game again.
        while(play.equals("yes")){
            Random rand=new Random();
            int randNum= rand.nextInt(100);
            randNum++;
            int guess=-1;
            int tries=0;
            while(guess!=randNum){
                System.out.println("guess the number between 1 to 100");
                guess=reader.nextInt();
                tries++;

                if(guess==randNum){
                    System.out.println("awesome you did that right guess ");
                    System.out.println("in just "+tries);
                    System.out.println("would you like to play again yes or no");
                    play=reader.next().toLowerCase();
                } else if (guess>randNum) {
                    System.out.println("your guess is higher ");

                } else  {
                    System.out.println("your is less than the random number");
                }
            }


        }
        reader.close();
    }
}
