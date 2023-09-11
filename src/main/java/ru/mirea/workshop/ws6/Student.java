package ru.mirea.workshop.ws6;

public class Student implements Comparable<Student> {
    private int gpa;

    private String fullName;
    private String group;

    public Student(String group, String fullName, int gpa) {
        this.group = group;
        this.fullName = fullName;
        this.gpa = gpa;
    }

    public Student(String group, String fullName) {
        this(group, fullName, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (gpa != student.gpa) return false;
        if (!fullName.equals(student.fullName)) return false;
        return group.equals(student.group);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (group.compareTo(other.group) != 0) {
            return group.compareTo(other.group);
        } else {
            return fullName.compareTo(other.fullName);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", fullName='" + fullName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
