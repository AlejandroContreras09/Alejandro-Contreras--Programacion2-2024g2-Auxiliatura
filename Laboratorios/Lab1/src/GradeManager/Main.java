package GradeManager;

import grades.GradeManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add grade");
            System.out.println("2. View average grade");
            System.out.println("3. View number of passing grades");
            System.out.println("4. Exit");
            System.out.println("5. Remove grade");
            System.out.print("Choose an option: ");
            Integer choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a grade: ");
                    Double grade = scanner.nextDouble();
                    gradeManager.addGrade(grade);
                    break;
                case 2:
                    System.out.println("Average grade: " + gradeManager.calculateAverage());
                    break;
                case 3:
                    System.out.println("Number of passing grades: " + gradeManager.countPassingGrades());
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Remove by: 1) Value 2) Position");
                    int removeChoice = scanner.nextInt();
                    if (removeChoice == 1) {
                        System.out.print("Enter the grade to remove: ");
                        Double gradeToRemove = scanner.nextDouble();
                        boolean removed = gradeManager.removeGradeByValue(gradeToRemove);
                        if (removed) {
                            System.out.println("Grade removed.");
                        } else {
                            System.out.println("Grade not found.");
                        }
                    } else if (removeChoice == 2) {
                        System.out.print("Enter the index to remove (starting from 0): ");
                        int index = scanner.nextInt();
                        boolean removed = gradeManager.removeGradeByIndex(index);
                        if (removed) {
                            System.out.println("Grade at index " + index + " removed.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            
            gradeManager.showAllGrades();
        }
    }
}

