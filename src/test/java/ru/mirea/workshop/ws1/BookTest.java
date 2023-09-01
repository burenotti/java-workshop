package ru.mirea.workshop.ws1;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void testBook() {
        var b = new Book("name", "author");
        Assert.assertEquals("name", b.getName());
        Assert.assertEquals("author", b.getAuthor());

        b.setName("changed");
        Assert.assertEquals("changed", b.getName());

        b.setAuthor("another author");
        Assert.assertEquals("another author", b.getAuthor());
    }

    @Test
    public void test_toString() {
        var b = new Book("Harry Potter", "J.K. Rowling");
        Assert.assertEquals("Harry Potter was written by J.K. Rowling", b.toString());
    }

}
