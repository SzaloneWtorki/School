package pl.school.journal;

import lombok.Getter;
import pl.school.schoolStaff.Model.Teacher;
import pl.school.student.Student;

@Getter
public class Journal {

    private Student student;
    private String note;
    private Teacher teacher;


    private Journal() {

    }

    public static class Builder {
        private Journal journal = new Journal();


        public Builder setStudent(Student student) {
            journal.student = student;
            return this;
        }

        public Builder setNote(String note) {
            journal.note = note;
            return this;
        }

        public Builder setTeacher(Teacher teacher) {
            journal.teacher = teacher;
            return this;
        }

        public Journal build() {
            return journal;
        }
    }

    @Override
    public String toString() {
        return "Journal{" +
                "student=" + student +
                ", note='" + note + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
