package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Tom");
        student1.addGrade(99);
        student1.addGrade(100);
        System.out.printf("Class Average: %f", student1.getGradeAverage());
    }
}
