import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects;
        int[] marks;

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

       
        marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

   
        int totalMarks = calculateTotalMarks(marks);


        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

        String grade = assignGrade(averagePercentage);

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }

   
    public static int calculateTotalMarks(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

  
    public static double calculateAveragePercentage(int totalMarks, int numOfSubjects) {
        return (double) totalMarks / (numOfSubjects * 100) * 100;
    }

    
    public static String assignGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
