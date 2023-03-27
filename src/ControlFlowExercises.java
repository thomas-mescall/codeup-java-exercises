import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] arrgs) {

        int i = 5;
        while (i < 16) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int j = 100;
        do {
            System.out.print(j + " ");
            j -= 5;
        } while(j > -10);

        System.out.println();

        long w = 2;
        do {
            System.out.println(w);
            w *= w;
        } while(w * w < 1000000);

        System.out.println();

        for(int s = 5; s < 16; s++) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int t = 100; t > -10; t -= 5) {
            System.out.print(t + " ");
        }

        for(long q = 2; q < 100000; q *= q) {
            System.out.println(q);
        }

        System.out.println();

        //Fizzbuzz
        for(int x = 1; x < 101; x++) {
            if(x % 3 == 0 && x % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            }
            else if(x % 3 == 0) {
                System.out.print("Fizz" + " ");
            }
            else if(x % 5 == 0) {
                System.out.print("Buzz" + " ");
            }
            else{
                System.out.print(x + " ");
            }

        }

        System.out.println();

        Scanner myScanner = new Scanner(System.in);
        String userinput2 = "y";

        do {
            System.out.print("Enter an integer: ");
            //myScanner.next();
            int userinput = Integer.parseInt(myScanner.nextLine());



            System.out.println("Your Squared Numbers are: ");
            for (int g = 1; g < userinput + 1; g++) {
                System.out.println(Math.pow(g, 2));
            }
            System.out.println("Your Cubed Numbers are: ");
            for (int g = 1; g < userinput + 1; g++) {
                System.out.println(Math.pow(g, 3));
            }

            System.out.println("Would you like to continue? (y/n)");

            userinput2 = myScanner.nextLine();
            System.out.println(userinput2);

            if (!userinput2.equalsIgnoreCase("y")) {
                break;
            }
            //else{break;}

        } while(true);






    }
}