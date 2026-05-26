import java.util.Arrays;

public class LevelTwo {

    public static int [] moveAllZeros (int [] numbers) {

        int copyOfElement = 0;
        int count = 0;

        for(int index = 0; index < numbers.length; index++) {

            if(numbers[index] != 0) {

                copyOfElement = numbers[index];
                numbers[index] = numbers[count];
                numbers[count] = copyOfIndex;

                count++;
            }
        }

        return numbers;

    }

}
