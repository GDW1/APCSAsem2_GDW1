
/**
 * Write a description of class homeworkRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class homeworkRunner
{
    public static void main(String[] args){
        // the array to be given
        int[] unsortedArray = {3, 2, 4, 2, 3, 5};
        //call the function
        int[] sortedArray = new int[unsortedArray.length];
        sortedArray = bubbleSortRecursive(unsortedArray);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }

    public static int[] bubbleSort(int[] unsortedArray){
        boolean alreadySorted = false;
        while(!alreadySorted){
            alreadySorted = true;
            for(int i = 0; i < (unsortedArray.length - 1); i++){
                if(unsortedArray[i] > unsortedArray[i+1]){
                    int tempOne = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = tempOne;
                    alreadySorted=false;
                }
            }
        }
        return unsortedArray;
    }

    public static int[] bubbleSortRecursive(int[] unsortedArray){
        boolean alreadySorted = true;
        for(int i = 0; i < (unsortedArray.length - 1); i++){
            if(unsortedArray[i] > unsortedArray[i+1]){
                int tempOne = unsortedArray[i];
                unsortedArray[i] = unsortedArray[i+1];
                unsortedArray[i+1] = tempOne;
                alreadySorted=false;
            }
        }
        if(!alreadySorted){
            unsortedArray = bubbleSortRecursive(unsortedArray);
        }
        return unsortedArray;
    }
}
