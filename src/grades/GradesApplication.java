package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Tom");
        Student student2 = new Student("Tommy");
        Student student3 = new Student("Thomas");
        Student student4 = new Student("Tomas");
        Student missing = new Student("MISSING");

        student1.addGrade(100);
        student1.addGrade(50);
        student1.addGrade(100);
        student1.addGrade(50);

        student2.addGrade(75);
        student2.addGrade(25);
        student2.addGrade(75);
        student2.addGrade(25);

        student3.addGrade(0);
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(100);

        student4.addGrade(70);
        student4.addGrade(80);
        student4.addGrade(90);
        student4.addGrade(100);

        students.put("tomDaBomb", student1);
        students.put("tommySalammi", student2);
        students.put("thomasTheTrain", student3);
        students.put("tomasLlamas", student4);

        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Students:%ntomDaBomb%ntommySalammi%nthomasTheTrain%ntomasLlamas%n%nWhich student would you like to review?%n");

        String userinput = myScanner.nextLine();

        boolean yes = false;
        while(!yes) {
            boolean stopper = false;
            while (!stopper) {
                switch (userinput) {
                    case "tomDaBomb" -> {
                        System.out.println("Name: " + student1.getName("Tom"));
                        System.out.println("Average: " + student1.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        stopper = true;
                    }
                    case "tommySalammi" -> {
                        System.out.println("Name: " + student2.getName("Tommy"));
                        System.out.println("Average: " + student2.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        stopper = true;
                    }
                    case "thomasTheTrain" -> {
                        System.out.println("Name: " + student3.getName("Thomas"));
                        System.out.println("Average: " + student3.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        stopper = true;
                    }
                    case "tomasLlamas" -> {
                        System.out.println("Name: " + student4.getName("Tomas"));
                        System.out.println("Average: " + student4.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        stopper = true;
                    }
                    default -> {
                        System.out.println(userinput + " Is Not A Valid Username. Please Enter A Valid Username");
                        userinput = myScanner.nextLine();
                    }
                }
            }
            System.out.println("CONTINUE???? (y/n)");
            userinput = myScanner.nextLine();
            switch(userinput){
                case "y" -> {
                    System.out.println("Alrighty then!");
                    userinput = myScanner.nextLine();
                }
                case "n" -> {
                    System.out.println("Okay dokay");
                    yes = true;
                }
                default -> {
                    System.out.println("Please pick one of the two letters");
                    userinput = myScanner.nextLine();
                }
            }
        }
    }
}
