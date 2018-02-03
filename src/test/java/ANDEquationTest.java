import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ANDEquationTest {

    @Test
    public void testRestoreY() {
        assertAll(
            () -> assertEquals(1, ANDEquation.restoreY(new int[]{1,3,5})),
            () -> assertEquals(-1, ANDEquation.restoreY(new int[]{31,7})),
            () -> assertEquals(7, ANDEquation.restoreY(new int[]{31,7,7})),
            () -> assertEquals(0, ANDEquation.restoreY(new int[]{1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1})),
            () -> assertEquals(191411, ANDEquation.restoreY(new int[]{191411,256951,191411,191411,191411,256951,195507,191411,192435,191411,191411,195511,191419,191411,256947,191415,191475,195579,191415,191411,191483,191411,191419,191475,256947,191411,191411,191411,191419,256947,191411,191411,191411})),
            () -> assertEquals(-1, ANDEquation.restoreY(new int[]{1362,1066,1659,2010,1912,1720,1851,1593,1799,1805,1139,1493,1141,1163,1211})),
            () -> assertEquals(-1, ANDEquation.restoreY(new int[]{2, 3, 7, 19})));
    }

}
