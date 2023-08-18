package Lecture05;

public class Student {
    String name;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;
    double min;
    double amount;
    String subject;


    Student() {
    }

    Student(String name, double grade, int yearInCollege, boolean isDegree, double money, double min, double amount, String subject) {
        this.name = name;
        this.grade = grade;
        this.yearInCollege = yearInCollege;
        this.isDegree = isDegree;
        this.money = money;
        this.min = min;
        this.amount = amount;
        this.subject = subject;
    }

    void upYear() {
        if (this.yearInCollege < 4) {
            System.out.println("Student Anna is not Degree");
            yearInCollege++;
        } else if (yearInCollege == 4) {
            isDegree = true;
            System.out.println("Student Anna is Degree");
        }

    }


    double receiveScholarship(double min, double amount) {
        if (grade >= min && age < 30) {
            money += amount;
        }
        return money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", yearInCollege=" + yearInCollege +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", money=" + money +
                ", min=" + min +
                ", amount=" + amount +
                ", subject='" + subject + '\'' +
                '}';
    }
}
