package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        examScores = new ArrayList<>();
        examScores.addAll(Arrays.asList(testScores));

    }

    public String getAverageExamScore(){
        Double result = 0.0;
        for (int i = 0; i <examScores.size() ; i++) {
            result += examScores.get(i);
        }
        return String.format("%.2f", result / examScores.size());
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber - 1 , newScore);
    }

    public void addExamScore(Double exam){
        examScores.add(exam);
    }


    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public Double getIndexValue (int index){
        return examScores.get(index);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String result = "";
        for (int i = 0; i < examScores.size(); i++) {
            result += "\tExam " + (i + 1) + "-> " + examScores.get(i) + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student Name: " +firstName + " " + lastName + '\n' +
                "> Average Score: " + getAverageExamScore() +
                "\n> Exam Scores:\n" + getExamScores();

    }
}
