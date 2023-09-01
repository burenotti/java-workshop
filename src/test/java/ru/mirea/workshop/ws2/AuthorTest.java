package ru.mirea.workshop.ws2;

import org.junit.Assert;
import org.junit.Test;

public class AuthorTest {
    @Test
    public void test_Author() {
        {
            final var name = "J.K. Rowling";
            final var email = "rowling@gmail.com";
            final var gender = 'f';
            var a = new Author(name, email, gender);
            Assert.assertEquals(name, a.getName());
            Assert.assertEquals(email, a.getEmail());
            Assert.assertEquals(gender, a.getGender());
        }
        {
            final var name = "J.K. Rowling";
            final var email = "rowling@gmail.com";
            final var gender = 'x';
            final var targetGender = 'u';

            var a = new Author(name, email, gender);
            Assert.assertEquals(name, a.getName());
            Assert.assertEquals(email, a.getEmail());
            Assert.assertEquals(targetGender, a.getGender());
        }
        {
            final var name = "Arthur Conan Doyle";
            final var email = "doyle@heavens.god";
            final var gender = 'm';

            var a = new Author(name, email, gender);
            Assert.assertEquals(name, a.getName());
            Assert.assertEquals(email, a.getEmail());
            Assert.assertEquals(gender, a.getGender());
        }
    }

    @Test
    public void test_toString() {
        {
            var rowling = new Author("J.K. Rowling", "rowling@gmail.com", 'f');
            Assert.assertEquals("J.K. Rowling (f) at rowling@gmail.com", rowling.toString());
        }
        {
            var doyle = new Author("Arthur Conan Doyle", "doyle@heavens.god", 'm');
            Assert.assertEquals("Arthur Conan Doyle (m) at doyle@heavens.god", doyle.toString());
        }
    }
}
