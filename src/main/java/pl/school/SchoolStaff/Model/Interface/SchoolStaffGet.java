package pl.school.SchoolStaff.Model.Interface;

import pl.school.SchoolStaff.Model.Subjects;

public interface SchoolStaffGet {
    public String getFullName();
    public Subjects[] getEducationSpecialtys();
    public int getAvailableLessonHours();
    public String getEducationalClass();
}
