package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName(String name){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
