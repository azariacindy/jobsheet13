import java.util.Scanner;

public class cubeStudent07 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        System.out.print("Enter the number of weeks: ");
        int numWeeks = input.nextInt();

        int[][] grades = new int[numStudents][numWeeks];

        // Function to input students' grade data
        inputStudentGrades(grades, input);

        // Function to display all student grades
        displayAllStudentGrades(grades);

        // Function to find the week that has the highest grade from all students
        int highestWeek = findHighestWeek(grades);
        System.out.println("Week " + highestWeek + " has the highest grade from all students.");

        // Function to find the student with the highest grade
        findStudentWithHighestGrade(grades);

        input.close();
    }

    // Function to input students' grade data
    static void inputStudentGrades(int[][] grades, Scanner input) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input.nextInt();
            }
        }
    }

    // Function to display all student grades
    static void displayAllStudentGrades(int[][] grades) {
        System.out.println("\nAll Student Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Week " + (j + 1) + ": " + grades[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Function to find the week that has the highest grade from all students
    static int findHighestWeek(int[][] grades) {
        int highestWeek = 1;
        int maxSum = Integer.MIN_VALUE;

        for (int j = 0; j < grades[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                highestWeek = j + 1;
            }
        }
        return highestWeek;
    }

    // Function to find the student with the highest grade
    static void findStudentWithHighestGrade(int[][] grades) {
        int highestStudent = 1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                highestStudent = i + 1;
            }
        }

        System.out.println("Student " + highestStudent + " has the highest grade.");
        System.out.println("Details:");
        for (int j = 0; j < grades[highestStudent - 1].length; j++) {
            System.out.println("Week " + (j + 1) + ": " + grades[highestStudent - 1][j]);
        }
    }
}
