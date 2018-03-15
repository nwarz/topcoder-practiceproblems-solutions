import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckerTest {

    @Test
    public void testCheckData() {
        assertTrue(Checker.checkData(new String[]{
                "D-G LOVES M",
                "M LOVES D-G",
                "T LOVES G",
                "G LOVES D-G"}));
        assertFalse(Checker.checkData(new String[]{
                "D LOVES M",
                "D LOVES C",
                "G LOVES M",
                "M LOVES T",
                "T LOVES D"}));
        assertFalse(Checker.checkData(new String[]{
                "D LOVES M",
                "C LOVES C",
                "G LOVES M",
                "M LOVES T",
                "T LOVES D"}));
        assertFalse(Checker.checkData(new String[]{
                "N LOVES C",
                "C LOVES D",
                "D LOVES M",
                "M LOVES g",
                "g LOVES N"}));
        assertFalse(Checker.checkData(new String[]{
                "A LOVES B",
                "A LOVES C",
                "C LOVES A",
                "B  LOVES A"}));
        assertFalse(Checker.checkData(new String[]{"ME LOVES YOU"}));
        assertFalse(Checker.checkData(new String[]{
                "ME LOVES YOU",
                "ME LOVES YOU"}));
        assertTrue(Checker.checkData(new String[]{"ME LOVES YOU",
                "ME LOVES YOU",
                "YOU LOVES ME"}));
        assertFalse(Checker.checkData(new String[]{
                "I LOVE YOU",
                "YOU LOVE I"}));
    }
}
