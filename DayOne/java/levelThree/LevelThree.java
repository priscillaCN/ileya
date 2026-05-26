public class LevelThree {

    public static int [] getMergedArrays (int [] firstArray, int [] secondArray) {
 
        int [] mergedArray = new int[firstArray.length + secondArray.length];
        
        for(int index = 0; index < firstArray.length; index++) {
            mergedArray[index] = firstArray[index];
        }

        for(int index = 0; index < secondArray.length; index++) {
            mergedArray[firstArray.length + index] = secondArray[index];
        }

        int copyOfElement = 0;

        for(int index = 0; index < mergedArray.length; index++) {

            for(int nextIndex = 0; nextIndex < mergedArray.length; nextIndex++) {

                if(mergedArray[index] < mergedArray[nextIndex]) {
                    copyOfElement = mergedArray[index];
                    mergedArray[index] = mergedArray[nextIndex];
                    mergedArray[nextIndex] = copyOfElement;
                }

            }

        }

        return mergedArray;

    }

    
    public static int [] getFlattenedArray (int [][] numbers) {

        int numberOfElements = 0;

        for(int [] row : numbers) numberOfElements += row.length;

        int [] flattenedArray = new int [numberOfElements];
        int index = 0;

        for(int [] row : numbers) {

            for(int element : row){
                flattenedArray[index] = element;
                index++;
            }

        }

        return flattenedArray;

    }

}
