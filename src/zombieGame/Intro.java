package zombieGame;

import java.util.Scanner;

public class Intro {
    public static int DoctorScenarios(){
        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();
        //building scenarios
        System.out.println("While performing open heart surgery your patient's arm begins to move and his eyes open. The patient quickly grabs your assistant's hand and bites a chunk out of it. You quickly jump back in disbelief and grab a...");
        return userInput;
    }
}
