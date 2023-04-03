package zombieGame;

import java.util.Scanner;

public class Characters {
    public int characterClass(){
        Scanner myScanner = new Scanner(System.in);

        //building character menu
        System.out.println("CHOOSE YOUR CHARACTER: ");
        System.out.println("(1) Doctor");
        System.out.println("(2) Soldier");
        System.out.println("(3) Farmer");
        System.out.println("(4) Police Officer");
        System.out.println("(5) Teenager");
        System.out.println("(6) Mechanic");
        System.out.println("(7) Elderly Person");

        //building character descriptions
        int userInput = myScanner.nextInt();
        boolean characterSelect = false;
        while(!characterSelect) {
            switch (userInput) {
                case 1:
                    System.out.println("A doctor can provide medical assistance and knowledge of diseases but lacks the ability to think outside the box.");
                    characterSelect = true;
                    break;
                case 2:
                    System.out.println("A soldier with combat skills and survival training but is hard to get along with others.");
                    characterSelect = true;
                    break;
                case 3:
                    System.out.println("A farmer can provide food and knowledge of agriculture but lacks technical skills.");
                    characterSelect = true;
                    break;
                case 4:
                    System.out.println("A police officer has firearms training and knowledge of tactics but struggles to understand others.");
                    characterSelect = true;
                    break;
                case 5:
                    System.out.println("A teenager is fast and agile, but lacks experience and skills.");
                    characterSelect = true;
                    break;
                case 6:
                    System.out.println("A mechanic can fix vehicles and create improvised weapons but cannot read.");
                    characterSelect = true;
                    break;
                case 7:
                    System.out.println("An elderly person may not be physically strong, but has wisdom and knowledge of survival techniques and is blind.");
                    characterSelect = true;
                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID CHARACTER ID");
                    userInput = myScanner.nextInt();
            }
        }

        myScanner.nextLine();
        return userInput;
    }
}
