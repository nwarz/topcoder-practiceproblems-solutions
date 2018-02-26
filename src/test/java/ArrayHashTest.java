import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayHashTest {

    @Test
    public void testGetHash() {
        assertAll(
                () -> assertEquals(21, ArrayHash.getHash(new String[]{"CBA", "DDD"})),
                () -> assertEquals(25, ArrayHash.getHash(new String[]{"Z"})),
                () -> assertEquals(30, ArrayHash.getHash(new String[]{"A", "B", "C", "D", "E", "F"})),
                () -> assertEquals(4290, ArrayHash.getHash(new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"})),
                () -> assertEquals(295, ArrayHash.getHash(new String[]{"ZZZZZZZZZZ"}))
        );
    }
}
