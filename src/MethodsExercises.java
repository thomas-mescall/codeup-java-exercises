import java.util.Scanner;

public class MethodsExercises {
    //public static void main(String[] args) {
        public static int addition(int x, int y){
            return x + y;
        }

        public static int subtraction(int x, int y){
            return x - y;
        }

        public static int multiply(int x, int y){
//            return multiplication(x, y);
            int temp = 0;
//            for(int i = 0; i < y; i++){
//                temp += x;
//            }
//            return temp;
            if(y > 0) {
                temp = x + multiply(x, y - 1);
            }
            return temp;
        }

        public static int division(int x, int y){
            if(y == 0) {
                return 0;
            }
            return x / y;
        }

        public static int modulus(int x, int y){
            return x % y;
        }

        public static int getInteger(int min, int max) {


            Scanner myScanner = new Scanner(System.in);
            int userIntInput;
            do {
                System.out.println("Enter a number");
                while(!myScanner.hasNextInt()){
                    System.out.println("Your number is not valid");
                    myScanner.next();
                }
                userIntInput = myScanner.nextInt();
            }while(userIntInput < max && userIntInput > min);

            return userIntInput;
        }

        public static int factorial(){
            Scanner myScanner = new Scanner(System.in);
            int userinput1;
            System.out.println("Enter an integer between 1 and 10");
            userinput1 = myScanner.nextInt();
            int factor = 1;
            if(userinput1 > 1 && 10 > userinput1) {
                for (int i = 1; i <= userinput1; i++) {
                    factor *= i;
                }
            }
            return factor;
        }

        public static int diceRoll(){
            Scanner myScanner = new Scanner(System.in);
            int dice1, dice2;
            do {
                System.out.println("Enter the number of sides for your dice");
                int userinput = myScanner.nextInt();
                dice1 = (int) Math.floor(Math.random() * userinput) + 1;
                myScanner.next();
                dice2 = (int) Math.floor(Math.random() * userinput) + 1;
                myScanner.next();
                System.out.printf("You rolled a %d and a %d. Want to try again? (y/n)", dice1, dice2);
                myScanner.next();
            }while(myScanner.next().equalsIgnoreCase("y"));

            return dice1;
        }

    //function for testing
    public static void main(String[] args) {


        int numOne = 5;
        int numTwo = 10;

        System.out.println("Q4");
        System.out.println(diceRoll());
        System.out.println("Q3");
        System.out.println(factorial());
        System.out.println("Q2");
        System.out.println(getInteger(numOne, numTwo));
        System.out.println("Q1");
        System.out.println(addition(numOne, numTwo));
        System.out.println(subtraction(numOne, numTwo));
        System.out.println(multiply(numOne, numTwo));
        System.out.println(division(numTwo, numOne));
        System.out.println(modulus(numOne, numTwo));
    }


    }
