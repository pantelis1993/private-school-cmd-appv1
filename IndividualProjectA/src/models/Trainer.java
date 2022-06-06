package models;

import java.util.Objects;

public class Trainer {
    private String firstName;
    private String lastName;
    private String subject;

    public Trainer(){}

    public Trainer(String firstName,String lastName,String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return firstName.equals(trainer.firstName) && lastName.equals(trainer.lastName) && subject.equals(trainer.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, subject);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Trainer's first name is: ").append(firstName);
        sb.append(", his last name is: ").append(lastName);
        sb.append(", his subject is: ").append(subject);
        sb.append('.');
        return sb.toString();
    }
}
