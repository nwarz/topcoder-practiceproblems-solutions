import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksNumberingTest {

    @Test
    public void testNumberOfBooks() {
        assertAll(
                () -> assertEquals(10, BooksNumbering.numberOfBooks(11)),
                () -> assertEquals(-1, BooksNumbering.numberOfBooks(10)),
                () -> assertEquals(99, BooksNumbering.numberOfBooks(189)),
                () -> assertEquals(100, BooksNumbering.numberOfBooks(192)),
                () -> assertEquals(7, BooksNumbering.numberOfBooks(7)),
                () -> assertEquals(219448716, BooksNumbering.numberOfBooks(1863927342)),
                () -> assertEquals(-1, BooksNumbering.numberOfBooks(1863927343)));
    }
}
