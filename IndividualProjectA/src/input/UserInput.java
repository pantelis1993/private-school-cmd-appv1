package input;

import models.Assignment;
import models.Course;
import java.util.Scanner;

import models.Student;
import models.Trainer;
import operations.Validation;
import static input.Database.*;
import static operations.PrintData.*;

public class UserInput {

    static Scanner scanner = new Scanner(System.in);
    static String input;
    static int num;
    static String date;
    static String stream;

    public static String YorN() {
        System.out.println("Please choose Y(yes) or N(no)");
        input = scanner.next();
        while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            System.out.println("Please provide correct input.Yes or No");
            input = scanner.next();
        }
        return input;
    }

    public static Course course() {
        printCourses();
        int getList = Validation.check_size_of_list(scanner.nextInt(),allCourses);
        return allCourses.get(getList - 1);
    }

    public static Student std() {
        printStudents();
        int getList = Validation.check_size_of_list(scanner.nextInt() , allStudents);
        return allStudents.get(getList - 1);
    }

    public static void createCourse() {
        do {
            Course course = new Course();
            input = scanner.nextLine();
            System.out.println("The title of the course: ");
            input = scanner.nextLine();
            course.setTitle(input);

            System.out.println("Course's type: ");
            input = Validation.checkString(scanner.nextLine());
            course.setType(input);

            System.out.println("Course's stream: ");
            input = Validation.checkString(scanner.nextLine());
            course.setStream(input);

            System.out.println("Course's starting date: ");
            date = scanner.nextLine();
            date = Validation.checkDate(date);
            course.setStartDate(Validation.convertToLocalDate(date));
            course.setStDate(date);

            System.out.println("Course's ending date: ");
            date = scanner.nextLine();
            date = Validation.checkDate(date);
            course.setEndDate(Validation.convertToLocalDate(date));
            course.setEnDate(date);

            addCourse(course);
            System.out.println("Would you like to add more courses?");
            input = YorN();
        }while (input.equalsIgnoreCase("y"));
    }

    public static void createTrainer() {
        do {
            input = scanner.nextLine();
            Trainer trainer = new Trainer();
            System.out.println("Trainer's first name: ");
            input = Validation.checkString(scanner.nextLine());
            trainer.setFirstName(input);

            System.out.println("Trainer's last name: ");
            input = Validation.checkString(scanner.nextLine());
            trainer.setLastName(input);

            System.out.println("Trainer's subject: ");
            input = Validation.checkString(scanner.nextLine());
            trainer.setSubject(input);

            addTrainer(trainer);

            System.out.print("Provide a number that belongs to the course you want to assign the trainer: ");
            course().getTrnPerCourse().getTrnPerCourse().add(trainer);
            System.out.println("Would you like to add more trainers?");
            input = YorN();
        }while(input.equalsIgnoreCase("y"));
    }

    public static void createStudent() {
        do {
            input = scanner.nextLine();
            Student student = new Student();
            System.out.println("Provide student's first name: ");
            input = Validation.checkString(scanner.nextLine());
            student.setFirstName(input);

            System.out.println("Provide student's last name: ");
            input = Validation.checkString(scanner.nextLine());
            student.setLastName(input);

            System.out.println("Provide student's date of birth: ");
            date = scanner.nextLine();
            date = Validation.checkDate(date);
            student.setDateOfBirth(Validation.convertToLocalDate(scanner.nextLine()));
            student.setdOfB(date);

            System.out.println("Provide student's tuition fees: ");
            num = Validation.tuitionCheck(scanner.nextInt());
            student.setTuitionFees(num);

            addStudent(student);

            System.out.println("Provide a number that belongs to the course you want to assign the student");
            course().getStdPerCourse().getStdPerCourse().add(student);

            System.out.println("Would you like to add more students to the course?");
            input = YorN();
        }while(input.equalsIgnoreCase("y"));
    }

    public static void createAssignment() {
        do {
            input = scanner.nextLine();
            Assignment asgnmnt = new Assignment();

            System.out.println("Provide assignment's title: ");
            input = Validation.checkString(scanner.nextLine());
            asgnmnt.setTitle(input);

            System.out.println("Provide assignment's description: ");
            input = Validation.checkString(scanner.nextLine());
            asgnmnt.setDescription(input);

            System.out.println("Provide assignment's submission date: ");
            date = scanner.nextLine();
            date = Validation.checkDate(date);
            asgnmnt.setSubDate(Validation.convertToLocalDate(scanner.nextLine()));
            asgnmnt.setSubmissionDate(date);

            System.out.println("Provide oral mark (max=20): ");
            num = Validation.oralMarkCheck(scanner.nextInt());
            asgnmnt.setOralMark(num);

            System.out.println("Provide total mark (max=100): ");
            num = Validation.totalMarkCheck(scanner.nextInt());
            asgnmnt.setTotalMark(num);

            addAsn(asgnmnt);

            System.out.println("Please enter a number that belongs to the course you want to assign this assignment.");
            course().getAsnPerCourse().getAsnPerCourse().add(asgnmnt);

            System.out.println("Would you like to add more courses?");
            input = YorN();
        }while(input.equalsIgnoreCase("y"));
    }

}
