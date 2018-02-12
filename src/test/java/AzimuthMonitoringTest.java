import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AzimuthMonitoringTest {

    @Test
    public void testGetAzimuth() {
        assertAll(
            () -> assertEquals(90, AzimuthMonitoring.getAzimuth(new String[]{"RIGHT"})),
            () -> assertEquals(0, AzimuthMonitoring.getAzimuth(new String[]{"LEFT", "LEFT", "TURN AROUND"})),
            () -> assertEquals(20, AzimuthMonitoring.getAzimuth(new String[]{"LEFT 5", "RIGHT 10", "LEFT 15", "RIGHT 20", "LEFT 25", "RIGHT 30", "LEFT 35", "RIGHT 40"})),
            () -> assertEquals(239, AzimuthMonitoring.getAzimuth(new String[]{"RIGHT 59", "RIGHT", "RIGHT", "HALT", "LEFT", "LEFT", "LEFT"})),
            () -> assertEquals(180, AzimuthMonitoring.getAzimuth(new String[]{"TURN AROUND", "HALT", "LEFT 5", "HALT", "LEFT 5", "HALT"})),
            () -> assertEquals(270, AzimuthMonitoring.getAzimuth(new String[]{"LEFT", "LEFT", "LEFT", "LEFT", "LEFT", "HALT"})));
    }
}
