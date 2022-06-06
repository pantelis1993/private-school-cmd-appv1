package operations;
import models.*;
import input.*;
import static input.Database.*;
import static input.UserInput.course;
import static input.UserInput.std;

import java.util.Scanner;

public class PrintData {

    static int i;
    static int j;
    static Scanner scanner = new Scanner(System.in);

    public static void printCourses() {
        i = 0;
        System.out.println("The list of the courses: ");
        for(Course course:allCourses){
            i++;
            System.out.println(" " + i + "-->" + course);
        }
    }

    public static void printTrainers() {
        i = 0;
        System.out.println("The list of trainers is: ");
        for(Trainer trainer:allTrainers){
            i++;
            System.out.println(" " + i + "-->" + trainer);
        }
    }

    public static void printStudents() {
        i = 0;
        System.out.println("The list of students is: ");
        for(Student student:allStudents) {
            i++;
            System.out.println(" " + i + "-->" + student);
        }
    }

    public static void printAssignments() {
        i = 0;
        System.out.println("The list of the assignments is: ");
        for(Assignment assignment:allAssignments) {
            i++;
            System.out.println(" " + i + "-->" + assignment);
        }
    }

    public static void printStdPerCourse() {
        System.out.println("Choose course to see the student's");
        Course course = course();
        System.out.println("The list of student's is: ");
        for(j = 0; j < course.getStdPerCourse().getStdPerCourse().size(); j++) {
            System.out.println(" " + (j+1) +"-->" + course.getStdPerCourse().getStdPerCourse().get(j));
        }
    }

    public static void printTrnPerCourse() {
        System.out.println("Select course to see trainer's");
        Course course = course();

        System.out.println("The list of trainer's is: ");
        for(j = 0; j < course.getTrnPerCourse().getTrnPerCourse().size(); i++) {
            System.out.println(" " + (j+1) + "-->" + course.getTrnPerCourse().getTrnPerCourse().get(j));
        }
    }

    public static void printAsgntPerCourse() {
        System.out.println("Select course to see the assignment's: ");
        Course course = course();

        System.out.println("The list of assignment's is: ");
        for(j = 0; j < course.getAsnPerCourse().getAsnPerCourse().size(); j++) {
            System.out.println(" " + (j+1) + "-->" + course.getAsnPerCourse().getAsnPerCourse().get(j));
        }
    }
    public static void printAsgntPerStudent() {
        System.out.println("Choose student to see his assignment's");
        Student student = std();

        System.out.println("The list of assignment's for the student is: ");
        for(j = 0; j < student.getAsnPerStudent().getAsnPerStudent().size(); j++) {
            System.out.println(" " + (j+1) + "-->" + student.getAsnPerStudent().getAsnPerStudent().get(j));
        }
    }

    public static void listCase(int n) {
        switch(n) {
            case 1:
                printStudents();
                break;
            case 2:
                printCourses();
                break;
            case 3:
                printAssignments();
                break;
            case 4:
                printTrainers();
            case 5:
                printAsgntPerCourse();
                break;
            case 6:
                printAsgntPerStudent();
                break;
            case 7:
                printStdPerCourse();
                break;
            case 8:
                printTrnPerCourse();
                break;
            default:
                System.out.println("Choose one of the option's above");
        }
    }
}
