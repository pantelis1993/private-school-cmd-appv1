package models;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class AssignmentPerStudent {
   private static ArrayList<Assignment> asnPerStudent;

   public AssignmentPerStudent() {
       AssignmentPerStudent.asnPerStudent = new ArrayList<>();
   }

    public ArrayList<Assignment> getAsnPerStudent() {
        return asnPerStudent;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asnPerStudent);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Assignment's per student: ").append(getAsnPerStudent()).toString();
    }
}
