package dm.positivethinking.fr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UtilsTest {

    List<Integer> numbers;

    @BeforeAll
    public void setUp() throws Exception {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }

    @Test
    public void shouldThrowException() {
        int length = -2;
        assertThrows(NegativeArraySizeException.class,
                () -> Utils.partition(numbers,length),
                "ERR_NS_20288");
    }

    @Test
    public void shouldReturnOneSubList() {
        int length = 10;
        int outputLength = 1;
        assertTrue(Utils.partition(numbers, length).size() == outputLength);
    }

    @Test
    public void shouldReturnThreeSubList() {
        int length = 3;
        int outputLength = 3;
        assertTrue(Utils.partition(numbers, length).size() == outputLength);
    }
}
