package models;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class TrainerPerCourse {
    private static ArrayList<Trainer> trnPerCourse;

    public TrainerPerCourse() {
        TrainerPerCourse.trnPerCourse = new ArrayList<>();
    }

    public ArrayList<Trainer> getTrnPerCourse() {
        return trnPerCourse;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrainerPerCourse other = (TrainerPerCourse) obj;
        if (!Objects.equals(this.getTrnPerCourse(), other.getTrnPerCourse())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trnPerCourse);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Trainers per course: ").append(this.getTrnPerCourse()).toString();
    }
}