import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABBATest {

    @Test
    public void testCanObtain() {
        assertAll(
            () -> assertEquals("Possible",ABBA.canObtain("B","ABBA")),
            () -> assertEquals("Impossible",ABBA.canObtain("AB","ABB")),
            () -> assertEquals("Impossible",ABBA.canObtain("BBAB","ABABABABB")),
            () -> assertEquals("Possible",ABBA.canObtain("BBBBABABBBBBBA","BBBBABABBABBBBBBABABBBBBBBBABAABBBAA")),
            () -> assertEquals("Impossible",ABBA.canObtain("A","BB")));
    }
}
