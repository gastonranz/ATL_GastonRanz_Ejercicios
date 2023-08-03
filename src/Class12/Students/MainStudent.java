package Class12.Students;

import Class12.Students.Student;
import Class12.Students.Subject;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        List<Subject> subjectStudent1 = new ArrayList<>();
        subjectStudent1.add(subject1);
        subjectStudent1.add(subject2);

        for(Subject subject : subjectStudent1) {
            System.out.println(subject);
        }
        Student gastonRanz = new Student("Gaston", "Ranz", "gastonranz94@gmail.com","3513248129",subjectStudent1);
        System.out.println(gastonRanz);
        System.out.println(gastonRanz.getSubject().get(0));
        System.out.println(gastonRanz.promedioStudent());

        Subject subject3 = new Subject();
        Subject subject4 = new Subject();
        Subject subject5 = new Subject();
        List<Subject> subjectStudent2 = new ArrayList<>();
        subjectStudent2.add(subject3);
        subjectStudent2.add(subject4);
        subjectStudent2.add(subject5);

        for(Subject i : subjectStudent2) {
            System.out.println(i);
        }
        Student kimWilde = new Student("Kim", "Wilde","kimwilde@yahoo.com", "10218239498", subjectStudent2);
        System.out.println(kimWilde.promedioStudent());
        System.out.println(kimWilde);
    }
}