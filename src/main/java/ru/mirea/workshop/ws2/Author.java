package ru.mirea.workshop.ws2;

public class Author {
    private String email;
    private final String name;
    private final char gender;

    public Author(String name, String email, char gender) {
        if (gender != 'm' && gender != 'f')
            gender = 'u';

        this.gender = gender;

        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s (%c) at %s", name, gender, email);
    }
}
