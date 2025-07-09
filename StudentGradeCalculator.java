import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Array to hold marks
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            int mark = scanner.nextInt();

            // Validate input
            while (mark < 0 || mark > 100) {
                System.out.println("⚠️ Invalid input! Marks should be between 0 and 100.");
                System.out.print("Re-enter marks for subject " + (i + 1) + ": ");
                mark = scanner.nextInt();
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        // Calculate average percentage
        double percentage = (double) totalMarks / numSubjects;

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Display results
        System.out.println("\n📋 Student Grade Report");
        System.out.println("----------------------------");
        System.out.println("Total Marks     : " + totalMarks + " out of " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade           : " + grade);
        System.out.println("----------------------------");
        System.out.println("✅ Calculation Complete");

        scanner.close();
    }
}
