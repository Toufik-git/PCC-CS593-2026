import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int mark1, mark2, mark3;

    Student(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
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

    String remarks() {
        double p = percentage();

        if (p >= 75)
            return "Excellent";
        else if (p >= 60)
            return "Good";
        else if (p >= 40)
            return "Average";
        else
            return "Needs Improvement";
    }

    String remarks(int bonus) {
        double p = (total() + bonus) / 3.0;

        if (p >= 75)
            return "Excellent";
        else if (p >= 60)
            return "Good";
        else if (p >= 40)
            return "Average";
        else
            return "Needs Improvement";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNo = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        int bonus = sc.nextInt();

        Student s = new Student(rollNo, name, mark1, mark2, mark3);

        System.out.println("Student ID: " + s.rollNo);
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.mark1 + ", " + s.mark2 + ", " + s.mark3);
        System.out.println("Total: " + s.total());
        System.out.printf("Percentage: %.2f%%%n", s.percentage());
        System.out.println("remarks(): " + s.remarks());
        System.out.println("remarks(" + bonus + "): " + s.remarks(bonus));

        sc.close();
    }
}
