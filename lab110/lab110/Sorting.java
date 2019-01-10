
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Sorting
{
    public static void main(String[] args){
        int[] unsortedArray = new int[10];
        for(int i = 0; i < unsortedArray.length; i++){
            unsortedArray[i] = (int)(Math.random()*10); 
            System.out.println(unsortedArray[i]);
        }
        System.out.println("__________");
        int[] sortedArray = selectionSort(unsortedArray);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }

    public static int[] bubbleSort(int[] unsortedArray){
        for(int i = unsortedArray.length; i > 0; i--){
            for(int a = 0; a < i - 1; a++){
                if(unsortedArray[a] > unsortedArray[a+1]){
                    int tempOne = unsortedArray[a];
                    unsortedArray[a] = unsortedArray[a+1];
                    unsortedArray[a+1] = tempOne;
                    
                }else{
                    if(a == (i-2)){
                        i--;
                    }
                }
            }
        }
        return unsortedArray;
    }

    public static int[] selectionSort(int[] unsortedArray){
        for(int i = 0; i < unsortedArray.length; i++){
            for(int a = i; a < unsortedArray.length; a++){
                if(unsortedArray[i] > unsortedArray[a]){
                    int tempOne = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[a];
                    unsortedArray[a] = tempOne;
                }
            }
        }
        return unsortedArray;
    }

    public static int[] mySort(int[] unsortedArray){
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

    public static int[] mySortRecursive(int[] unsortedArray){
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
            unsortedArray = mySortRecursive(unsortedArray);
        }
        return unsortedArray;
    }
}
