import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxesOfBooksTest {

    @Test
    public void testBoxes() {
        assertEquals(3, BoxesOfBooks.boxes(new int[]{ 5, 5, 5, 5, 5, 5 }, 10));
        assertEquals(5, BoxesOfBooks.boxes(new int[]{ 51, 51, 51, 51, 51 }, 100));
        assertEquals(4, BoxesOfBooks.boxes(new int[]{ 1, 1, 1, 7, 7, 7 }, 8));
        assertEquals(6, BoxesOfBooks.boxes(new int[]{ 12, 1, 11, 2, 10, 3, 4, 5, 6, 6, 1 }, 12));
        assertEquals(0, BoxesOfBooks.boxes(new int[]{ }, 7));
        assertEquals(1, BoxesOfBooks.boxes(new int[]{ 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 }, 1000));
    }
}
