package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName(){
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


    public String displayGrade(){
        int[] newGrade = new int[4];
        for(int i = 0; i < 4; i++) {
            newGrade[i] = grades.get(i);
        }
        return Arrays.toString(newGrade);
    }
}
