import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayOfNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumTotalOfArrays() {
        int result =SumOfArrayOfNumbers.sumTotalOfArrays(1, 2, 3,4);
        assertEquals(result, 10);
    }
}