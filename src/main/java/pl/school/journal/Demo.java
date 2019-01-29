package pl.school.journal;

import pl.school.schoolStaff.Model.Teacher;
import pl.school.student.Student;

public class Demo {
    public static void main(String[] args) {


        Journal journal = new Journal.Builder()
                .setNote("Uwaga za zachowanie")
                .setTeacher(new Teacher.Builder().build())
                .setStudent(new Student.Build().build())
                .build();

        System.out.println(journal);
            }
}