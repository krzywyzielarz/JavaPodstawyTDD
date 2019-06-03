package pl.grak.java.podsawy.other;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChcekHowToCreateTestTest {

    @Test
    void sampleAdding() {
        ChcekHowToCreateTest chcekHowToCreateTest = new ChcekHowToCreateTest();
        int expected = 30;
        int actual = chcekHowToCreateTest.sampleAdding(10, 20);
        assertEquals(expected, actual);

    }
}