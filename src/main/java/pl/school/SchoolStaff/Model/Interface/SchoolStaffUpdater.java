package pl.school.SchoolStaff.Model.Interface;

import pl.school.SchoolStaff.Model.Subjects;

public interface SchoolStaffUpdater {
    public void updateFullName(String fullName);
    public void updateEducationSpecialtys(Subjects[] educationSpecialtys);
    public void updateAvailableLessonHours(int availableLessonHours);
    public void updateEducationalClass(String educationalClass);
}
