import java.util.Arrays;

public class LevelOne {

    public static int [][] splitEvenAndOddArrays (int [] numbers) {

        int count = 0;

        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 == 0) count++;
        }

        int [] evenNumbers = new int [count];
        int position = 0;

         for(int index = 0; index < numbers.length; index++) {

            if(numbers[index] % 2 == 0) {
                evenNumbers[position] = numbers[index];
                position++;
            }
        }

        int [] oddNumbers = new int [numbers.length - count];
        position = 0;

        for(int index = 0; index < numbers.length; index++) {

            if(numbers[index] % 2 != 0) {
                oddNumbers[position] = numbers[index];
                position++;
            }
        }

        int [][] newArray = {evenNumbers, oddNumbers};

        return newArray;
    
    }


    public static boolean isPalindrome (int [] numbers) {
    
        int [] reverse = new int[numbers.length];
        int position = 0;

        for(int index = numbers.length - 1; index >= 0; index--) {
            reverse[position] = numbers[index];
            position++;
        }

        if(Arrays.equals(numbers, reverse)) return true;
        else return false;

    }


    public static int [] getPerfectSquares (int [] numbers) {

        int count = 0;
        int divisor = 0;

        for(int index = 0; index < numbers.length; index++) {
        
            for(divisor = 2; divisor <= numbers[index] / 2; divisor++) {

                if(divisor * divisor == numbers[index]) count++;
            }
        }

        int [] perfectSquares =new int [count];
        int position = 0;

        for(int index = 0; index < numbers.length; index++) {
        
            for(divisor = 2; divisor <= numbers[index] / 2; divisor++) {

                if(divisor * divisor == numbers[index]) {
                    perfectSquares[position] = numbers[index];
                    position++;
                }

            }

        }

        return perfectSquares;

    }


}
