package util;

import java.util.Scanner;

public class Input {
    private Scanner myScanner;

    public Input(){
        myScanner = new Scanner(System.in);
        //String userInput = myScanner.next();
    }

    public String getString(){
        //System.out.println("Enter a String");
        return myScanner.next();
    }

    public boolean yesNo(){
        System.out.println("Yes or No");
        String userInput = myScanner.next();
        return userInput.equalsIgnoreCase("Yes");
    }

    public int getInt(){
        System.out.printf("%nEnter an integer: 0 - 5%n");
        int count = 0;
        while(true) {
            if(myScanner.nextInt() < 0 && myScanner.nextInt() > 5){
                return Integer.valueOf(getString());
            } else{
                count++;
                if(count > 3){
                    throw new RuntimeException("YOU HAVE EXCEED THE MAXIMUM ATTEMPTS. PLEASE LEAVE");
                }
                System.out.println("Please enter a valid integer: ");
            }
        }
    }

    public int getInt(int min, int max) {
        int num = 0;
        while(num < min || num > max) {
            num = getInt();
            System.out.println("Pick a number between" + min + " - " + max);
        }
        return num;
    }

    public double getDouble(){
        System.out.println("Enter a Double: 0 - 5");
        int count = 0;
        while(!myScanner.hasNextDouble() || count != 3) {
            System.out.println("Please enter a valid Double: ");
            count++;
            //myScanner.next();
        }
        return Double.valueOf(getString());
    }

    public double getDouble(double min, double max) {
        double num = 0;
        while(num < min || num > max) {
            num = getDouble();
            System.out.println("Pick a number between" + min + " - " + max);
        }
        return num;
    }
}
