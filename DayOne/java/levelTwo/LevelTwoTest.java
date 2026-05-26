import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelTwoTest {


    @Test
    public void givenMoveAllZeros_whenInputIsAnArrayOfNumbers_thenReturnArrayWithZerosAtTheEnd() {

    int [] numbers = {0, 5, 17, 0, 54, 8, 0, 26};
    int [] expected = {5, 17, 54, 8, 26, 0, 0, 0};

    assertArrayEquals(expected, LevelTwo.moveAllZeros(numbers));

    }

}
