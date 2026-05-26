import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelFourTest {

    @Test
    public void givenGetIndiciesOfElementsThatAddUpToTarget_whenInputIsAnArrayAndTargetNumber6_thenReturnIndex1and3() {

    int target = 6;
    int [] numbers = {7, 5, 9, 1, 2};
    int [] expected = {1, 3};

    assertArrayEquals(expected, LevelFour.getIndiciesOfElementsThatAddUpToTarget(target, numbers));

    }

}

