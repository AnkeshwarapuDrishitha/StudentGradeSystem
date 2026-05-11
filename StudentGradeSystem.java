import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        double average = total / 3.0;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Displaying report
        System.out.println("\n===== Student Report =====");
        System.out.println("Student Name: " + name);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}