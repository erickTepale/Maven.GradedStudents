package io.zipcoder;

import org.junit.Assert;

import java.util.ArrayList;

public class Classroom {
    private Student [] students;

    public Classroom(){
        students = new Student[30];
    }

    public Classroom(Integer maxSize){
        students =  new Student[maxSize];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student each: students) {
            for (int i = 0; i < each.getNumberOfExamsTaken() ; i++) {
                sum += each.examScores.get(i);
            }
        }


        return (sum / students.length);
    }

    public void addStudent(Student student){

        if (students[0] == null)
            students[0] = student;
        else {
            Student[] temp = new Student[this.students.length + 1];
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            temp[temp.length - 1] = student;
            students = temp;
        }

    }

    public void removeStudent(String firstName, String lastName){

    }

  

    public Student[] getStudents() {
        return students;
    }
}
