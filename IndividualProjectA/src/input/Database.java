package input;

import models.*;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Course> allCourses = new ArrayList<>();
    public static ArrayList<Student> allStudents = new ArrayList<>();
    public static ArrayList<Trainer> allTrainers = new ArrayList<>();
    public static ArrayList<Assignment> allAssignments = new ArrayList<>();

    //---------------------Adding data to lists-------------------
    public static void addCourse(Course course) {
        if(!allCourses.contains(course)){
            allCourses.add(course);
        }
    }

    public static void addTrainer(Trainer trainer) {
        if(!allTrainers.contains(trainer)) {
            allTrainers.add(trainer);
        }
    }

    public static void addStudent(Student student) {
        if(!allStudents.contains(student)) {
            allStudents.add(student);
        }
    }

    public static void addAsn(Assignment assignment) {
        if(!allAssignments.contains(assignment)) {
            allAssignments.add(assignment);
        }
    }
}
