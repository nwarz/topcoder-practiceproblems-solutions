import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AccessChangerTest {

    @Test
    public void testConvert() {
        assertAll(
            () -> assertArrayEquals(
                    new String[]{"Test* t = new Test();", "t.a = 1;", "t.b = 2;", "t.go(); // a=1, b=2 --> a=2, b=3" },
                    AccessChanger.convert(new String[]{"Test* t = new Test();", "t->a = 1;", "t->b = 2;", "t->go(); // a=1, b=2 --> a=2, b=3"})),

            () -> assertArrayEquals(
                    new String[]{"--. // the arrow --->", "---", "> // the parted arrow" },
                    AccessChanger.convert(new String[]{"---> // the arrow --->", "---", "> // the parted arrow"})),

            () -> assertArrayEquals(
                    new String[]{"--. // the arrow --->", "---", "> // the parted arrow" },
                    AccessChanger.convert(new String[]{"---> // the arrow --->", "---", "> // the parted arrow"})));
    }
}
