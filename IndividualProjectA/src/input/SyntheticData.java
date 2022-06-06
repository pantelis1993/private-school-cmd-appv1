package input;
import static input.Database.*;
import models.*;
import java.time.LocalDate;

public class SyntheticData {

private String name = "Synthetic Data";

    public static void syntheticData() {

//Courses
        Course cProgramming = new Course("C programming", "C", "Full-time", LocalDate.of(2022, 5, 22), LocalDate.of(2022, 6, 3));
        Course java = new Course("Java", "Java", "Part-time", LocalDate.of(2022, 6, 10), LocalDate.of(2022, 6, 24));
        Course javascript = new Course("Javascript", "Javascript", "Part-time", LocalDate.of(2022, 7, 15), LocalDate.of(2022, 7, 28));
        Course react = new Course("React", "React", "Full-time", LocalDate.of(2022, 6, 1), LocalDate.of(2022, 6, 15));

//Add courses to all courses list(Database)
        addCourse(cProgramming);
        addCourse(java);
        addCourse(javascript);
        addCourse(react);

//Trainers
        Trainer trainer1 = new Trainer("Thanos", "Petalwtis", "C programming");
        Trainer trainer2 = new Trainer("Kostas", "Sotos", "Javascript,C programming");
        Trainer trainer3 = new Trainer("Iwannis", "Tzouvaras", "Java");
        Trainer trainer4 = new Trainer("Andreas", "Mixalopoulos", "Javascript");
        Trainer trainer5 = new Trainer("Anastasia", "Georgiou", "React");

//Add trainers to allTrainers list(Database)
        addTrainer(trainer1);
        addTrainer(trainer2);
        addTrainer(trainer3);
        addTrainer(trainer4);
        addTrainer(trainer5);

//Add trainers to trainers per course list
        cProgramming.getTrnPerCourse().getTrnPerCourse().add(trainer1);
        cProgramming.getTrnPerCourse().getTrnPerCourse().add(trainer2);
        java.getTrnPerCourse().getTrnPerCourse().add(trainer3);
        javascript.getTrnPerCourse().getTrnPerCourse().add(trainer2);
        javascript.getTrnPerCourse().getTrnPerCourse().add(trainer4);
        react.getTrnPerCourse().getTrnPerCourse().add(trainer5);

//Students

        Student padelis = new Student("Padelis", "Logothetis", LocalDate.of(1993, 5, 13), 350);
        Student dimitris = new Student("Dimitris", "Kolovos", LocalDate.of(1994, 7, 18), 400);
        Student grigoris = new Student("Grigoris", "Ladas", LocalDate.of(1991, 2, 26), 500);
        Student antonis = new Student("Antonis", "Katsakos", LocalDate.of(1989, 4, 7), 280);
        Student giorgos = new Student("Giorgos", "Azakas", LocalDate.of(1995, 6, 28), 400);
        Student mihalis = new Student("Mihalis", "Vlahiotis", LocalDate.of(1987, 2, 1), 550);
        Student aggeliki = new Student("Aggeliki", "Morianopoulou", LocalDate.of(1989, 5, 6), 300);

//Add students to allStudents list(Database)
        addStudent(padelis);
        addStudent(dimitris);
        addStudent(grigoris);
        addStudent(antonis);
        addStudent(giorgos);
        addStudent(mihalis);
        addStudent(aggeliki);

//Add students to students per course list
        react.getStdPerCourse().getStdPerCourse().add(padelis);
        cProgramming.getStdPerCourse().getStdPerCourse().add(dimitris);
        cProgramming.getStdPerCourse().getStdPerCourse().add(grigoris);
        cProgramming.getStdPerCourse().getStdPerCourse().add(antonis);
        cProgramming.getStdPerCourse().getStdPerCourse().add(giorgos);
        javascript.getStdPerCourse().getStdPerCourse().add(mihalis);
        java.getStdPerCourse().getStdPerCourse().add(aggeliki);
        java.getStdPerCourse().getStdPerCourse().add(padelis);
        cProgramming.getStdPerCourse().getStdPerCourse().add(dimitris);
        react.getStdPerCourse().getStdPerCourse().add(grigoris);
        java.getStdPerCourse().getStdPerCourse().add(antonis);
        cProgramming.getStdPerCourse().getStdPerCourse().add(giorgos);
        cProgramming.getStdPerCourse().getStdPerCourse().add(mihalis);
        javascript.getStdPerCourse().getStdPerCourse().add(aggeliki);


//Assignments for C course
        Assignment c_fundamentals = new Assignment("C", "C fundamentals", LocalDate.of(2022, 6, 4), 50, 100);
        Assignment c_algorithms = new Assignment("C", "C Algorithms", LocalDate.of(2022, 6, 13), 50, 100);
//Assignments for java course
        Assignment core_java = new Assignment("Java", "Core-Java", LocalDate.of(2022, 6, 15), 50, 100);
        Assignment java_se = new Assignment("Java", "Java SE", LocalDate.of(2022, 12, 4), 50, 100);
        Assignment individualProject = new Assignment("Individual Java Project", "Java", LocalDate.of(2022, 5, 29), 50, 100);
        Assignment groupProject = new Assignment("Group Java Project", "Java", LocalDate.of(2022, 9, 27), 50, 100);
 //Assignments for javascript course
        Assignment javascript_vanilla = new Assignment("Javascript", "Vanilla Javascript", LocalDate.of(2022, 5, 29), 50, 100);
        Assignment javascript_jquery = new Assignment("Javascript", "Javascript Jquery", LocalDate.of(2022, 7, 12), 50, 100);
        Assignment javascript_individualProject = new Assignment("Javascript", "Individual Project", LocalDate.of(2022, 7, 9), 50, 100);
        Assignment javascript_groupProject = new Assignment("Javascript", "Group Project", LocalDate.of(2022, 9, 28), 50, 100);
//Assignments for react course
        Assignment react_basics = new Assignment("React", "React Basics", LocalDate.of(2022, 6, 19), 50, 100);
        Assignment react_advance = new Assignment("React", "Advance React", LocalDate.of(2022, 8, 12), 50, 100);

//Add assignments to all assignments list(Database)
        addAsn(c_algorithms);
        addAsn(c_fundamentals);
        addAsn(core_java);
        addAsn(java_se);
        addAsn(individualProject);
        addAsn(groupProject);
        addAsn(javascript_vanilla);
        addAsn(javascript_groupProject);
        addAsn(javascript_jquery);
        addAsn(javascript_individualProject);
        addAsn(react_basics);
        addAsn(react_advance);

//Add assignment to assignment per course list(Database)
        cProgramming.getAsnPerCourse().getAsnPerCourse().add(c_fundamentals);
        cProgramming.getAsnPerCourse().getAsnPerCourse().add(c_algorithms);
        java.getAsnPerCourse().getAsnPerCourse().add(core_java);
        java.getAsnPerCourse().getAsnPerCourse().add(java_se);
        java.getAsnPerCourse().getAsnPerCourse().add(individualProject);
        java.getAsnPerCourse().getAsnPerCourse().add(groupProject);
        javascript.getAsnPerCourse().getAsnPerCourse().add(javascript_vanilla);
        javascript.getAsnPerCourse().getAsnPerCourse().add(javascript_jquery);
        javascript.getAsnPerCourse().getAsnPerCourse().add(javascript_individualProject);
        javascript.getAsnPerCourse().getAsnPerCourse().add(javascript_groupProject);
        react.getAsnPerCourse().getAsnPerCourse().add(react_basics);
        react.getAsnPerCourse().getAsnPerCourse().add(react_advance);

//Add assignment to assignment per course list and per student


    }
}
