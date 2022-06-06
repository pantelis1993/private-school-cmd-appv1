package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Course {
   private String title;
   private String stream;
   private String type;
   private String stDate;
   private String enDate;
   private LocalDate startDate;
   private LocalDate endDate;

   private StudentPerCourse stdPerCourse;
   private TrainerPerCourse trnPerCourse;
   private AssignmentPerCourse asnPerCourse;

   public Course(){
      stdPerCourse = new StudentPerCourse();
      trnPerCourse = new TrainerPerCourse();
      asnPerCourse = new AssignmentPerCourse();
   }

   public Course(String title,String stream,String type,LocalDate startDate,LocalDate endDate) {
      this.title = title;
      this.stream = stream;
      this.type = type;
      this.startDate = startDate;
      this.endDate = endDate;
      stdPerCourse = new StudentPerCourse();
      trnPerCourse = new TrainerPerCourse();
      asnPerCourse = new AssignmentPerCourse();
   }

   public Course(String title,String stream,String type,String stDate,String enDate) {
      this.title = title;
      this.stream = stream;
      this.type = type;
      this.stDate = stDate;
      this.enDate = enDate;
      stdPerCourse =new StudentPerCourse();
      trnPerCourse = new TrainerPerCourse();
      asnPerCourse = new AssignmentPerCourse();
   }


   //Getters and Setters


   public String getStDate() {
      return stDate;
   }

   public void setStDate(String stDate) {
      this.stDate = stDate;
   }

   public String getEnDate() {
      return enDate;
   }

   public void setEnDate(String enDate) {
      this.enDate = enDate;
   }

   public StudentPerCourse getStdPerCourse() {
      return stdPerCourse;
   }

   public void setStdPerCourse(StudentPerCourse stdPerCourse) {
      this.stdPerCourse = stdPerCourse;
   }

   public TrainerPerCourse getTrnPerCourse() {
      return trnPerCourse;
   }

   public void setTrnPerCourse(TrainerPerCourse trnPerCourse) {
      this.trnPerCourse = trnPerCourse;
   }

   public AssignmentPerCourse getAsnPerCourse() {
      return asnPerCourse;
   }

   public void setAsnPerCourse(AssignmentPerCourse asnPerCourse) {
      this.asnPerCourse = asnPerCourse;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getStream() {
      return stream;
   }

   public void setStream(String stream) {
      this.stream = stream;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public LocalDate getStartDate() {
      return startDate;
   }

   public void setStartDate(LocalDate startDate) {
      this.startDate = startDate;
   }

   public LocalDate getEndDate() {
      return endDate;
   }

   public void setEndDate(LocalDate endDate) {
      this.endDate = endDate;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Course course = (Course) o;
      return title.equals(course.title) && stream.equals(course.stream) && type.equals(course.type) && startDate.equals(course.startDate) && endDate.equals(course.endDate);
   }

   @Override
   public int hashCode() {
      return Objects.hash(title, stream, type, startDate, endDate);
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("Course title is: ").append(title);
      sb.append(", stream is: ").append(stream);
      sb.append(", type is: ").append(type);
      sb.append(", startDate is: ").append(stDate);
      sb.append(", endDate is: ").append(enDate);
     return sb.toString();

   }
}
