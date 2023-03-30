package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Would you like to view movies by category or all movies?%n1: By Category%n2: All Movies");
        MoviesArray[] animated = movies.MoviesArray();
        MoviesArray[] drama;
        MoviesArray[] horror;
        MoviesArray[] scifi;
        int userInput = myScanner.nextInt();
        boolean stopper = false;
        while(!stopper) {
            if (userInput == 1) {
                System.out.printf("What category would you like to view?%n1: animated%n2: drama%n3: horror%n4: scifi");
                switch (userInput){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
                stopper = true;
            } else if (userInput == 2) {
                System.out.println("Enjoy :)");
                stopper = true;
            } else {
                System.out.println("Please enter a valid selection");
                userInput = myScanner.nextInt();
            }
        }
    }
}
