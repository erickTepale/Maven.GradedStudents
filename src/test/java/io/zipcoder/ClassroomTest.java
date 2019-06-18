package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void testAvg(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[]{s1,s2};
        Classroom classroom = new Classroom(students);

// When
        double output = classroom.getAverageExamScore();

// Then
        System.out.println(output);

        Assert.assertEquals(250.0, classroom.getAverageExamScore(), .5);
    }

    @Test
    public void testAdd(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

// When
        classroom.addStudent(student);
        Student [] preEnrollment = classroom.getStudents();
        classroom.addStudent(new Student("erick", "tep", examScores));
        Student [] postEnrollment = classroom.getStudents();


// Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }
}
