
import java.util.Scanner;

public class ConsoleExercises{
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately: " + pi);
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: " + userInput);
//
//        //clearing
//        scanner.nextLine();
//
//        System.out.println("Enter three words: ");
//        String userInputTwo = scanner.nextLine();
//        String userInputThree = scanner.nextLine();
//        String userInputFour = scanner.nextLine();
//        System.out.println("You entered: " + userInputTwo + " "+ userInputThree + " " + userInputFour);
//
//        //clearing
//        scanner.nextLine();
//
//        System.out.println("Enter a sentence: ");
//        String userInputFive = scanner.nextLine();
//        System.out.println("Your sentence is: " + "\"" + userInputFive + "\"");
//
//        //clearing
//        scanner.nextLine();

        System.out.println("Enter the length, width and height of your room: ");
        String userInputSix = scanner.nextLine();
        String userInputSeven = scanner.nextLine();
        String userInputEight = scanner.nextLine();
        System.out.println("Your room dimensions are: " + userInputSix + " by " + userInputSeven + " by " + userInputEight);

        double numSix, numSeven, numEight;
        numSix = Double.parseDouble(userInputSix);
        numSeven = Double.parseDouble(userInputSeven);
        numEight = Double.parseDouble(userInputSeven);

        double area = numSix * numSeven;
        double perimeter = (numSix + numSeven) * 2;
        double volume = area * numEight;
        System.out.println("The area of your room is: " + area);
        System.out.println("The perimeter of your room is: " + perimeter);
        System.out.printf("Your room has a volume of: %f", volume);

        //clearing
//        scanner.nextLine();



    }
}
