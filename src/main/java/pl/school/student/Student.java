package pl.school.student;

import jdk.jfr.DataAmount;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
public class Student implements StudentUpdate {
    @NotNull
    @Length(min = 3, message = "Student's first name should have at least 3 characters.")
    private String firstName;
    @NotNull
    @Length(min = 3, message = "Student's last name should have at least 3 characters.")
    private String lastName;
    @NotNull
    private LocalDate dateOfBirth;
    @Min(value = 1, message = "Student's number should be at least 1.")
    private int logNumber;

    private Student() {

    }

    public static class Build {
        private Student student = new Student();

        public Build setFirstName(String firstName) {
            student.firstName = firstName;
            return this;
        }

        public Build setLastName(String lastName) {
            student.lastName = lastName;
            return this;
        }

        public Build setDateOfBirth(LocalDate dateOfBirth) {
            student.dateOfBirth = dateOfBirth;
            return this;
        }

        public Build setLogNumber(int logNumber) {
            student.logNumber = logNumber;
            return this;
        }

        public Student build() {
            return student;
        }
    }

    @Override
    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void updateDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
