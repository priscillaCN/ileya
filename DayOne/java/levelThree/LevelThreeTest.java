import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelThreeTest {


    @Test
    public void givenGetMergedArrays_whenInputIsTwoArrays_thenReturnAMergeOfBothArrays() {

        int [] firstArray = {3, 6, 9};
        int [] secondArray = {2, 4, 8};
        int [] expected = {2, 3, 4, 6, 8, 9};

        assertArrayEquals(expected, LevelThree.getMergedArrays(firstArray, secondArray));
    }


    @Test
    public void givenGetFlattenedArray_whenInputIsATwoDimensionalArray_thenReturnAOneDimensionalArrayContainingAllElements() {

        int [][] numbers = {{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};
        int [] expected = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};

        assertArrayEquals(expected, LevelThree.getFlattenedArray(numbers));
    }


}
