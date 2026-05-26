import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelOneTest {

    @Test
    public void givenSplitEvenAndOddArrays_whenInputIsAnArrayOfNumbers_thenReturnASplitOfEvenAndOddNumbers() {

    int [] numbers = {24, 15, 63, 6, 100, 77};
    int [][] newArray = {{24, 6, 100}, {15, 63, 77}};

    assertArrayEquals(newArray, LevelOne.splitEvenAndOddArrays(numbers));

    }


    @Test
    public void givenIsPalindrome_whenInputIsTheSameWhenReversed_thenReturnTrue() {

    int [] numbers = {25, 130, 0, 130, 25};

    assertEquals(true, LevelOne.isPalindrome(numbers));

    }


    @Test
    public void givenIsPalindrome_whenInputIsNotTheSameWhenReversed_thenReturnFalse() {

    int [] numbers = {25, 80, 0, 168, 25};

    assertEquals(false, LevelOne.isPalindrome(numbers));

    }

    @Test
    public void givenGetPerfectSquares_whenInputContains25And144_thenReturnAnArrayWithOnly25And144() {

    int [] numbers = {25, 130, 70, 144, 18};
    int [] perfectSquares = {25, 144};

    assertArrayEquals(perfectSquares, LevelOne.getPerfectSquares(numbers));

    }


}
