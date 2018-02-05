import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelLatinTest {

    @Test
    public void testTranslate() {
        assertAll(
            () -> assertEquals("XYz", VowelLatin.translate("XYz")),
            () -> assertEquals("pplctnaiaio", VowelLatin.translate("application")),
            () -> assertEquals("qwcvb", VowelLatin.translate("qwcvb")),
            () -> assertEquals("aeioOa", VowelLatin.translate("aeioOa")));
    }
}
