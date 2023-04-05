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

        students.put("tomDaBomb", student1);
        students.put("tommySalammi", student2);
        students.put("thomasTheTrain", student3);
        students.put("tomasLlamas", student4);

//        System.out.printf("Student 1: %s%nStudent 2: %s%nStudent 3: %s%nStudent 4: %s%n",students.get("tomDaBomb"),students.get("tommySalammi"),students.get("thomasTheTrain"),students.get("tomasLlamas"));

        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Students:%ntomDaBomb%ntommySalammi%nthomasTheTrain%ntomasLlamas%n%nWhich student would you like to review?%n");

        String userinput = myScanner.nextLine();

        boolean stopper = false;

        while(!stopper){
            if(userinput != students.get()){
                System.out.println("Please Enter A Valid Username");
                userinput = myScanner.nextLine();
            } else if(userinput == students.)
        }


    }
}
