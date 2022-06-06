package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double tuitionFees;
    private String dOfB;
    private AssignmentPerStudent asnPerStudent;

    public Student() {

    }

    public Student(String firstName,String lastName,LocalDate dateOfBirth,double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        asnPerStudent = new AssignmentPerStudent();
    }

    public Student(String firstName,String lastName,double tuitionFees,String dOfB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuitionFees = tuitionFees;
        this.dOfB = dOfB;
        asnPerStudent = new AssignmentPerStudent();
    }

    public String getdOfB() {
        return dOfB;
    }

    public void setdOfB(String dOfB) {
        this.dOfB = dOfB;
    }

    public AssignmentPerStudent getAsnPerStudent() {
        return asnPerStudent;
    }

    public void setAsnPerStudent(AssignmentPerStudent asnPerStudent) {
        this.asnPerStudent = asnPerStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) && lastName.equals(student.lastName) && dateOfBirth.equals(student.dateOfBirth) && dOfB.equals(student.dOfB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dOfB);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Student's firstName is: ").append(firstName);
        sb.append(", lastName is: ").append(lastName);
        sb.append(", dateOfBirth is: ").append(dateOfBirth);
        sb.append(", tuitionFees are: ").append(tuitionFees);
        sb.append(", dOfB is: ").append(dOfB);
        sb.append('.');
        return sb.toString();
    }
}
