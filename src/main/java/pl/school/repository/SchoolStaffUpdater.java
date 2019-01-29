package pl.school.repository;

import pl.school.entity.Subjects;

public interface SchoolStaffUpdater {
    public void updateFullName(String fullName);
    public void updateEducationSpecialtys(Subjects[] educationSpecialtys);
    public void updateAvailableLessonHours(int availableLessonHours);
    public void updateEducationalClass(String educationalClass);
}
