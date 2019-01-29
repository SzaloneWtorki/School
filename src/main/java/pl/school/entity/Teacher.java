package pl.school.entity;

import org.hibernate.validator.constraints.Length;
import pl.school.repository.SchoolStaffGet;
import pl.school.repository.SchoolStaffUpdater;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

public class Teacher implements SchoolStaffGet, SchoolStaffUpdater {
    @NotNull
    @Length(min = 3, message = "This name should have at least 3 characters.")
    private String fullName;
    @NotNull
    private Subjects[] educationSpecialtys;
    @Min(value = 6, message = "Teacher must work between 6 and 12 hours per week.")
    @Max(value = 12, message = "Teacher must work between 6 and 12 hours per week.")
    private int availableLessonHours;
    @NotNull
    private String educationalClass = "No class";

    private Teacher() {

    }

    public static class Builder {
        private Teacher teacher = new Teacher();

        public Builder setFullName(String fullName) {
            teacher.fullName = fullName;
            return this;
        }

        public Builder setEducationSpecialty(Subjects[] educationSpecialtys) {
            teacher.educationSpecialtys = educationSpecialtys;
            return this;
        }

        public Builder setAvailableLessonHours(int availableLessonHours) {
            teacher.availableLessonHours = availableLessonHours;
            return this;
        }

        public Builder setEducationalClass(String educationalClass) {
            teacher.educationalClass = educationalClass;
            return this;
        }

        public Teacher build() {
            return teacher;
        }
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public Subjects[] getEducationSpecialtys() {
        return educationSpecialtys;
    }

    @Override
    public int getAvailableLessonHours() {
        return availableLessonHours;
    }

    @Override
    public String getEducationalClass() {
        return educationalClass;
    }

    @Length(min = 3, message = "Name should be at least 3 characters.")
    @Override
    public void updateFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void updateEducationSpecialtys(Subjects[] educationSpecialtys) {
        this.educationSpecialtys = educationSpecialtys;
    }

    @Override
    public void updateAvailableLessonHours(int availableLessonHours) {
        this.availableLessonHours = availableLessonHours;
    }

    @Override
    public void updateEducationalClass(String educationalClass) {
        this.educationalClass = educationalClass;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", educationSpecialtys=" + Arrays.toString(educationSpecialtys) +
                ", availableLessonHours=" + availableLessonHours +
                ", educationalClass='" + educationalClass + '\'' +
                '}';
    }
}
