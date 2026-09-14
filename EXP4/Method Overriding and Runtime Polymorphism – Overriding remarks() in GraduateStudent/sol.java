import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int mark1, mark2, mark3;

    Student(int rollNumber, String name, int mark1, int mark2, int mark3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int total() {
        return mark1 + mark2 + mark3;
    }

    double percentage() {
        return total() / 3.0;
    }

    void remarks() {
        int score = total();

        if (score >= 220) {
            System.out.println("remarks(): Excellent");
        } else if (score >= 180) {
            System.out.println("remarks(): Good");
        } else if (score >= 120) {
            System.out.println("remarks(): Average");
        } else {
            System.out.println("remarks(): Needs Improvement");
        }
    }

    void remarks(int bonus) {
        // Unchanged
    }

    void display() {
        System.out.println("Student ID: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + total());
        System.out.printf("Percentage: %.2f%%%n", percentage());
    }
}

class GraduateStudent extends Student {
    int thesisMarks;

    GraduateStudent(int rollNumber, String name, int mark1, int mark2,
                    int mark3, int thesisMarks) {
        super(rollNumber, name, mark1, mark2, mark3);
        this.thesisMarks = thesisMarks;
    }

    int finalScore() {
        return total() + thesisMarks;
    }

    @Override
    void remarks() {
        int score = total() + thesisMarks;

        if (score >= 220) {
            System.out.println("remarks(): Excellent");
        } else if (score >= 180) {
            System.out.println("remarks(): Good");
        } else if (score >= 120) {
            System.out.println("remarks(): Average");
        } else {
            System.out.println("remarks(): Needs Improvement");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Plain Student
        int roll1 = sc.nextInt();
        sc.nextLine();
        String name1 = sc.nextLine();

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        // Graduate Student
        int roll2 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();

        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int m6 = sc.nextInt();
        int thesisMarks = sc.nextInt();

        Student[] students = new Student[2];

        students[0] = new Student(roll1, name1, m1, m2, m3);
        students[1] = new GraduateStudent(
            roll2, name2, m4, m5, m6, thesisMarks
        );

        for (Student s : students) {
            s.display();
            s.remarks();
        }

        sc.close();
    }
}
