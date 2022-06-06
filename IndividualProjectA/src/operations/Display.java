package operations;
import input.SyntheticData;
import input.UserInput;

import java.util.Scanner;


public class Display {

    public static void displayData() {
        String answer;
        System.out.println("Welcome!Would you like to insert data? ");
        answer = UserInput.YorN();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Please create a course by providing information.");
            UserInput.createCourse();

            System.out.println("Please create trainers.");
            UserInput.createTrainer();

            System.out.println("Please create students.");
            UserInput.createStudent();

            System.out.println("Lastly please create assignment's");
            UserInput.createAssignment();
        }
        System.out.println("");
        menu();

        if(answer.equalsIgnoreCase("n")) {
            SyntheticData.syntheticData();
            System.out.println("");
            menu();
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Insert #1 for the the list of student's.");
            System.out.println("Insert #2 for the list of course's.");
            System.out.println("Insert #3 for the list of assignment's.");
            System.out.println("Insert #4 for the list of trainer's.");
            System.out.println("Insert #5 for the list of assignment's per course.");
            System.out.println("Insert #6 for the list of assignment;s per student.");
            System.out.println("Insert #7 for the list of student's per course.");
            System.out.println("Insert #8 for the list of trainer's per course.");
            System.out.println("Insert #9 to apply a date and view the pending assignment's.");

            System.out.println("Make a choice: ");
            n = scanner.nextInt();
            PrintData.listCase(n);
        }while(n != 0);
        System.out.println("Bye Bye");
        System.exit(0);
    }
}
