import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int mark1, mark2, mark3;

    // Parameterized constructor
    Student(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate and display result
    void displayResult() {
        int total = mark1 + mark2 + mark3;
        double percentage = (total / 300.0) * 100;

        System.out.println("Student ID: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        String name = sc.nextLine();

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        // Create Student object using parameterized constructor
        Student student = new Student(rollNo, name, mark1, mark2, mark3);

        student.displayResult();

        sc.close();
    }
}
