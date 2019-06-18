package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


    @Test
    public void getAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.getAverageExamScore();

// Then
        Assert.assertEquals(output, "125.00");
    }

    @Test
    public void setExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

// Then
        Assert.assertEquals((double)student.getIndexValue(0), 150.0, .5);
    }

    @Test
    public void addExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.addExamScore(100.0);
        String output = student.getExamScores();

// Then
        Assert.assertEquals((double)student.getIndexValue(0), 100.0, .05);
    }

    @Test
    public void getNumberOfExamsTaken() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        Integer output = student.getNumberOfExamsTaken();

// Then
        Assert.assertEquals((int)output, 4);
    }

    @Test
    public void getExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.getExamScores();
        String outpute = "\tExam 1-> 100.0\n" +
                "\tExam 2-> 95.0\n" +
                "\tExam 3-> 123.0\n" +
                "\tExam 4-> 96.0\n";
// Then
        Assert.assertEquals(output, outpute);
    }

    @Test
    public void toStringTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.toString();

// Then
        System.out.println(output);
    }
}