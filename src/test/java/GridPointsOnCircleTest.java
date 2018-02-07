import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridPointsOnCircleTest {

    @Test
    public void testCountPoints() {
        assertAll(
            () -> assertEquals(4, GridPointsOnCircle.countPoints(1)),
            () -> assertEquals(12, GridPointsOnCircle.countPoints(25)),
            () -> assertEquals(0, GridPointsOnCircle.countPoints(3)),
            () -> assertEquals(0, GridPointsOnCircle.countPoints(44)),
            () -> assertEquals(12, GridPointsOnCircle.countPoints(50))
        );
    }
}
