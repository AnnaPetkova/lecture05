package Lecture05;

import javax.security.auth.Subject;
import java.util.Arrays;

public class StudentGroupDemo {
    public static void main(String[] args) {


        Student anna = new Student("Anna", 5.0, 4, true, 100.3, 2, 200, "psychology");
        Student mila = new Student("Mila", 4.0, 3, false, 150, 2, 200, "sociology");
        Student mihail = new Student("Mihail", 3.0, 2, false, 60, 2, 150, "psychology");
        Student kristin = new Student("Kristin", 2.0, 2, false, 44, 3, 88, "psychology");
        Student ivan = new Student("Ivan", 1.0, 1, false, 33, 2, 66, "psychology");
        Student alex = new Student("Alex", 2.0, 1, false, 6777, 7, 789, "psychology");

        StudentGroup psychology = new StudentGroup("psychology");
        psychology.addStudent(anna);
        psychology.addStudent(mila);
        psychology.addStudent(mihail);
        psychology.addStudent(kristin);
        psychology.addStudent(ivan);
        psychology.addStudent(alex);

        System.out.println(psychology.students[0]);
		System.out.println(psychology.students[1]);
        System.out.println(psychology.students[2]);
        System.out.println(psychology.students[3]);
        System.out.println(psychology.students[4]);;

        System.out.println(psychology.toString());
        System.out.println(psychology.students.length-1);

        String bestStudent = psychology.findBestStudent();
        System.out.println("The best student is " + bestStudent);

        psychology.printStudentsInGroup();


    }

}