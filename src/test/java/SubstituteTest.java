import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubstituteTest {

    @Test
    void testGetValue() {
        /**
            key: "TRADINGFEW"
            code: "LGXWEV"
            Returns: 709
         */
        assertEquals(709, Substitute.getValue("TRADINGFEW", "LGXWEV"));

        /**
            "ABCDEFGHIJ"
            "XJ"
            Returns: 0
         */
        assertEquals(0, Substitute.getValue("ABCDEFGHIJ", "XJ"));

        /**
            "CRYSTALBUM"
            "MMA"
            Returns: 6
         */
        assertEquals(6, Substitute.getValue("CRYSTALBUM", "MMA"));

    }
}
