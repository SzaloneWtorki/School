package pl.school.entity;

import lombok.Data;

@Data
public class Classroom {

    private int ClassroomNumber;
    private boolean isClassroomFree = true;

    public Classroom(int classroomNumber) {
        if (classroomNumber <= 10 && classroomNumber > 0) {
            this.ClassroomNumber = classroomNumber;
        } else {
            System.out.println("The classroom number does not exist");
        }

    }
}