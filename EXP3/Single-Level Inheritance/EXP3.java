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
        S
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

    GraduateStudent(int rollNumber, String name, int mark1, int mark2, int mark3, int thesisMarks) {
        super(rollNumber, name, mark1, mark2, mark3);
        this.thesisMarks = thesisMarks;
    }

    int finalScore() {
        return total() + thesisMarks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNumber = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int thesisMarks = sc.nextInt();

        GraduateStudent student = new GraduateStudent(
            rollNumber, name, mark1, mark2, mark3, thesisMarks
        );

        student.display();
        System.out.println("Final Score (with thesis): " + student.finalScore());

        sc.close();
    }
}
