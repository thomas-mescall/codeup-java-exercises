import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        do {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("What do you want?");
            String userinput = myScanner.nextLine();
            if (userinput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userinput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userinput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever...");
            }

        }while(true);
    }
}
