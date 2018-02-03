import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurretDefenseTest {

    @Test
    public void testFirstMiss() {
        assertAll(
                () -> assertEquals(2,
                    TurretDefense.firstMiss(
                        new int[]{3,5,6},
                        new int[]{7,5,6},
                        new int[]{11,15,16})),

                () -> assertEquals(-1,
                    TurretDefense.firstMiss(
                        new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16},
                        new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16},
                        new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32})),

                () -> assertEquals(15,
                    TurretDefense.firstMiss(
                        new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16},
                        new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16},
                        new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,31})),

                () -> assertEquals(-1,
                    TurretDefense.firstMiss(
                        new int[]{1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0},
                        new int[]{1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0,1000,0},
                        new int[]{2000,4000,6000,8000,10000,12000,14000,16000,18000,20000,22000,24000,26000,28000,30000,32000,34000,36000,38000,40000,42000,44000,46000,48000,50000,52000,54000,56000,58000,60000,62000,64000,66000,68000,70000,72000,74000,76000,78000,80000,82000,84000,86000,88000,90000,92000,94000,96000,98000,100000})),

                () -> assertEquals(0,
                    TurretDefense.firstMiss(
                        new int[]{4,5},
                        new int[]{4,5},
                        new int[]{7,8})),

                () -> assertEquals(4,
                    TurretDefense.firstMiss(
                        new int[]{1,2,3,4,15},
                        new int[]{1,2,3,4,15},
                        new int[]{100,200,300,400,405})));
    }
}
