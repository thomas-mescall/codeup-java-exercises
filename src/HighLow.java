import java.util.Scanner;

public class HighLow {
    public static int gameDev() {
       int randNum = (int) Math.floor(Math.random() * 100) + 1;
       int count = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 - 100");
        int userInput = myScanner.nextInt();

        while(count < 4){
            if(userInput == randNum) {
                System.out.println("GOOD GUESS");
            }
            else if(userInput > randNum) {
                System.out.println("TOO HIGH");
            }
            else if(userInput < randNum) {
                System.out.println("TOO LOW");
            }

            count++;
            if(count == 3) {
                System.out.println("YOU LOSE");
                return randNum;
            }
            userInput = myScanner.nextInt();
        }
        //System.out.println("GOOD GUESS");
        return randNum;
    }

    public static void main(String[] args){
        System.out.println(gameDev());
    }
}
