package pl.school.repository;

import java.time.LocalDate;

public interface StudentUpdate {
    public void updateFirstName(String firstName);
    public void updateLastName(String lastName);
    public void updateDateOfBirth(LocalDate dateOfBirth);
}
