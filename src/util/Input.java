package util;

import java.util.Scanner;

public class Input {
    private Scanner myScanner;

    public Input(){
        myScanner = new Scanner(System.in);
        String userInput = myScanner.next();
    }

    public String getString(){
        System.out.println("Enter a String");
        return myScanner.next();
    }

    public boolean yesNo(){
        System.out.println("Si or No");
        String userInput = myScanner.next();
        return userInput.equalsIgnoreCase("Si");
    }

    public int getInt(int min, int max) {
        min = 2;
        max = 9;
        int num = getInt();
        while(num < min && num > max) {
            System.out.println("Pick a number between 2 - 9");
        }
        return num;
    }

    public int getInt(){
        System.out.println("Enter an integer: ");
        while(!myScanner.hasNextInt()) {
            System.out.println("Please enter a valid integer: ");
            myScanner.next();
        }
        return myScanner.nextInt();
    }

    public static void main(String[] args) {

    }
}
