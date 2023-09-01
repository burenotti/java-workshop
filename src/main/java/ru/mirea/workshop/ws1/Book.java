package ru.mirea.workshop.ws1;

public class Book {
    private String name;

    private String author;


    public Book(String name, String author) {
        this.setAuthor(author);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return String.format("%s was written by %s", this.getName(), this.getAuthor());
    }
}
