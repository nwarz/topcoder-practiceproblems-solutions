import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubstituteTest {

    @Test
    void testGetValue() {
        assertAll(
                () -> assertEquals(709, Substitute.getValue("TRADINGFEW", "LGXWEV")),
                () -> assertEquals(0, Substitute.getValue("ABCDEFGHIJ", "XJ")),
                () -> assertEquals(6, Substitute.getValue("CRYSTALBUM", "MMA")));
    }
}
