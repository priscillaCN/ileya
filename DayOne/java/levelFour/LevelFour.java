public class LevelFour {

    public static int [] getIndiciesOfElementsThatAddUpToTarget (int target, int [] numbers) {

        int [] indicies = new int [2];

        for(int index = 0; index < numbers.length; index++) {

            for(int nextIndex = index + 1; nextIndex < numbers.length; nextIndex++) {

                if(numbers[index] + numbers[nextIndex] == target) 
                   indicies = new int []{index, nextIndex};

            }

        }

        return indicies;

    }


}
