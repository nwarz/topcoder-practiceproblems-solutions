import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AaagmnrsTest {

    @Test
    public void testAnagrams() {
        assertAll(
            () -> assertArrayEquals(
                    new String[]{"Aaagmnrs", "TopCoder"},
                    Aaagmnrs.anagrams(new String[]{"Aaagmnrs", "TopCoder", "anagrams", "Drop Cote"})),

            () -> assertArrayEquals(
                    new String[]{"SnapDragon vs tomek"},
                    Aaagmnrs.anagrams(new String[]{"SnapDragon vs tomek", "savants groped monk", "Adam vents prongs ok"})),

            () -> assertArrayEquals(
                    new String[]{"Radar ghost jilts Kim", "patched hers first"},
                    Aaagmnrs.anagrams(new String[]{"Radar ghost jilts Kim", "patched hers first", "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM"})));
    }
}
