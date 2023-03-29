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

    public int getInt(){
        System.out.println("Enter an integer: ");
        while(!myScanner.hasNextInt()) {
            System.out.println("Please enter a valid integer: ");
            myScanner.next();
        }
        return myScanner.nextInt();
    }

    public int getInt(int min, int max) {
        int num = 0;
        while(num < min || num > max) {
            num = getInt();
            System.out.println("Pick a number between 2 - 9");
        }
        return num;
    }

    public double getDouble(){
        System.out.println("Enter a Double: ");
        while(!myScanner.hasNextDouble()) {
            System.out.println("Please enter a valid Double: ");
            myScanner.next();
        }
        return myScanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double num = 0;
        while(num < min || num > max) {
            num = getDouble();
            System.out.println("Pick a number between 2 - 9");
        }
        return num;
    }
}
