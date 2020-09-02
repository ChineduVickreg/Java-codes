package Com.vickreg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalsOfNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumTotalOfArrays() {
        int result = TotalsOfNumbers.sumTotalOfArrays(2,4,6,10);
        assertEquals(result,22);
    }
}