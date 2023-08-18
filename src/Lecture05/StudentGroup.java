package Lecture05;

import java.util.Arrays;

public class StudentGroup {

    String groupSubject;
    Student[] students;
    int freePlaces;
    // int[] masivIme = new int[5];
    // Student[] StudentGroup = new Student[5];

    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }


    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }


    void addStudent(Student s) {
        if(!s.subject.equals(this.groupSubject)) {
            System.out.println(s.name +" has different subject!");
            return;
        }
        if(freePlaces == 0) {
            System.out.println("Sorry, there is not free place");
            return;
        }

        students[students.length - freePlaces] = s;
        freePlaces --;
    }


    void emptyGroup() {
        freePlaces = 5;
        students = new Student[5];
    }

    String findBestStudent() {
        // be careful of the group have students
        Student bestStudent = students[0];

        for (int i = 1; i < students.length - freePlaces; i++) {
            if(students[i].grade > bestStudent.grade) {
                bestStudent = students[i];
            }
        }
        return bestStudent.name;
    }

    void printStudentsInGroup() {
        for (int i = 0; i < students.length - freePlaces; i++) {
            System.out.println("Name:" + students[i].name + " grade: " + students[i].grade );
        }
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupSubject='" + groupSubject + '\'' +
                ", students=" + Arrays.toString(students) +
                ", freePlaces=" + freePlaces +
                '}';
    }
}


