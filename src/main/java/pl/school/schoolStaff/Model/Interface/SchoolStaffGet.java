package pl.school.schoolStaff.Model.Interface;

import pl.school.schoolStaff.Model.Subjects;

public interface SchoolStaffGet {
    public String getFullName();
    public Subjects[] getEducationSpecialtys();
    public int getAvailableLessonHours();
    public String getEducationalClass();
}
