package pl.school.entity;

import lombok.Getter;

@Getter
public enum Subjects {
    POLISH(0, "Polish", new int[]{1, 2, 3, 4, 5, 6}),
    MATHEMATICS(1, "Mathematics", new int[]{1, 2, 3, 4, 5, 6}),
    NATURE(2, "Nature", new int[]{4, 5, 6}),
    ENGLISH(3, "English", new int[]{1, 2, 3, 4, 5, 6}),
    GERMAN(4, "German", new int[]{4, 5, 6}),
    HISTORY(5, "History", new int[]{1, 2, 3, 4, 5, 6}),
    COMPUTER_SCIENCE(6, "Computer Science", new int[]{4, 5, 6}),
    PLASTICITY(7, "Plasticity", new int[]{4}),
    MUSIC(8, "Music", new int[]{4, 5}),
    TECHNIQUE(9, "Technique", new int[]{6}),
    PHYSICAL_EDUCATION(10, "Physical education", new int[]{1, 2, 3, 4, 5, 6}),
    SEX_EDUCATION(11, "Sex education", new int[]{1, 2, 3, 4, 5, 6}),
    RELIGION(12, "Religion", new int[]{1, 2, 3, 4, 5, 6}),
    EDUCATIVE_HOUR(13, "Educative hour", new int[]{1, 2, 3, 4, 5, 6});

    private int subjectNumber;
    private String subjectName;
    private int[] classes;

    Subjects(int subjectNumber, String subjectName, int[] classes) {
        this.subjectNumber = subjectNumber;
        this.subjectName = subjectName;
        this.classes = classes;
    }
}
