package models;

import java.util.ArrayList;
import java.util.Objects;


public class StudentPerCourse {
    private static ArrayList<Student> stdPerCourse;

    public StudentPerCourse() {
        StudentPerCourse.stdPerCourse = new ArrayList<>();
    }

    public ArrayList<Student> getStdPerCourse() {
        return stdPerCourse;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        final StudentPerCourse other = (StudentPerCourse) obj;
        if (!Objects.equals(this.getStdPerCourse() , other.getStdPerCourse())) {
            return false;
        }
        return  true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdPerCourse);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Students per course: ").append(this.getStdPerCourse()).toString();
    }
}
