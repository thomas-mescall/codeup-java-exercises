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

        double classTotal = student1.getGradeAverage() + student2.getGradeAverage() + student3.getGradeAverage() + student4.getGradeAverage();

        double classAverage = classTotal / 4;

        students.put("tomDaBomb", student1);
        students.put("tommySalammi", student2);
        students.put("thomasTheTrain", student3);
        students.put("tomasLlamas", student4);

        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Student Usernames:%ntomDaBomb%n~~~~~~~~~~~~~~%ntommySalammi%n~~~~~~~~~~~~~~%nthomasTheTrain%n~~~~~~~~~~~~~~%ntomasLlamas%n%nPlease enter the username of the student%n that you would like to review.%n%n(1) To View All Grades%n%n(2) To View Class Average%n");

        String userinput = myScanner.nextLine();
        int userinput1 = myScanner.nextInt();

        boolean yes = false;
        while(!yes) {
            boolean stopper = false;
            while (!stopper) {
                switch (userinput1){
                    case 1 -> {
                        System.out.println(student1.getName() + ": " + student1.displayGrade());
                        System.out.println(student2.getName() + ": " + student2.displayGrade());
                        System.out.println(student3.getName() + ": " + student3.displayGrade());
                        System.out.println(student4.getName() + ": " + student4.displayGrade());
                        stopper = true;
                    }
                    case 2 -> {
                        System.out.printf("Class Average: %f%n",classAverage);
                        stopper = true;
                    }
                    default -> {
                        System.out.println("ENTER A VALID NUMBER");
                    }

                }
                switch (userinput) {
                    case "tomDaBomb" -> {
                        System.out.println("Name: " + student1.getName());
                        System.out.println("Average: " + student1.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        System.out.println("Grades: " + student1.displayGrade());
                        stopper = true;
                    }
                    case "tommySalammi" -> {
                        System.out.println("Name: " + student2.getName());
                        System.out.println("Average: " + student2.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        System.out.println("Grades: " + student1.displayGrade());
                        stopper = true;
                    }
                    case "thomasTheTrain" -> {
                        System.out.println("Name: " + student3.getName());
                        System.out.println("Average: " + student3.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        System.out.println("Grades: " + student1.displayGrade());
                        stopper = true;
                    }
                    case "tomasLlamas" -> {
                        System.out.println("Name: " + student4.getName());
                        System.out.println("Average: " + student4.getGradeAverage());
                        System.out.println("Username: " + userinput);
                        System.out.println("Grades: " + student1.displayGrade());
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
