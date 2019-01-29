package pl.school.repository;

import pl.school.entity.Subjects;

public interface SchoolStaffGet {
    public String getFullName();
    public Subjects[] getEducationSpecialtys();
    public int getAvailableLessonHours();
    public String getEducationalClass();
}
