package models;

import java.time.LocalDate;
import java.util.Objects;

public class Assignment {
    private String title;
    private String description;
    private LocalDate subDate;
    private String submissionDate;
    private int oralMark;
    private int totalMark;  //from 0 to 100

    public Assignment(){}

    public Assignment(String title,String description,LocalDate subDate,int oralMark,int totalMark) {
        this.title = title;
        this.description = description;
        this.subDate = subDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public Assignment(String title,String description,String submissionDate,int oralMark,int totalMark) {
        this.title = title;
        this.description = description;
        this.submissionDate = submissionDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public LocalDate getSubDate() {
        return subDate;
    }

    public void setSubDate(LocalDate subDate) {
        this.subDate = subDate;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return oralMark == that.oralMark && totalMark == that.totalMark && title.equals(that.title) && description.equals(that.description) && subDate.equals(that.subDate) && submissionDate.equals(that.submissionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, subDate, submissionDate, oralMark, totalMark);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Assignment's title is: ").append(this.title);
        sb.append(", description is: ").append(this.description);
        sb.append(", subDate is: ").append(this.subDate);
        sb.append(", oralMark is: ").append(this.oralMark);
        sb.append(", totalMark is: ").append(this.totalMark);
        return sb.toString();
    }
}
