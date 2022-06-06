package models;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class AssignmentPerCourse {
    private static ArrayList<Assignment> asnPerCourse;

    public AssignmentPerCourse() {
        AssignmentPerCourse.asnPerCourse = new ArrayList<>();
    }

    public ArrayList<Assignment> getAsnPerCourse() {
        return asnPerCourse;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
       return Objects.hash(asnPerCourse);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Assignment's per course: ").append(getAsnPerCourse()).toString();
    }
}
