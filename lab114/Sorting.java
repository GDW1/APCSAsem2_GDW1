
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Sorting
{
    public static void main(String[] args){
        ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++){
            unsortedArray.add((int)(Math.random()*10));
            //System.out.println(unsortedArray.get(i));
        }
        System.out.println("__________");
        stopWatch watch = new stopWatch();
        ArrayList<Integer> sortedArray = insertSort(unsortedArray);
        System.out.println("TIME FOR INSERT: " + watch.timeEllapsed());
        // for(int i = 0; i < sortedArray.size(); i++){
            // System.out.println(sortedArray.get(i));
        // }
        for(int i = 0; i < 1000; i++){
            unsortedArray.set(i, (int)(Math.random()*10));
            //System.out.println(unsortedArray.get(i));
        }
        stopWatch watch2 = new stopWatch();
        ArrayList<Integer> sortedSelectArray = selectionSort(unsortedArray);
        System.out.println("TIME FOR Select: " + watch2.timeEllapsed());
        for(int i = 0; i < sortedSelectArray.size(); i++){
         //   System.out.println(unsortedArray.get(i));
        }
        for(int i = 0; i < 1000; i++){
            unsortedArray.set(i, (int)(Math.random()*10));
            //System.out.println(unsortedArray.get(i));
        }
        stopWatch watch3 = new stopWatch();
        ArrayList<Integer> sortedMyArray = mySort(unsortedArray);
        System.out.println("TIME FOR MySort:     " + watch3.timeEllapsed());
        // for(int i = 0; i < sortedArray.size(); i++){
            // System.out.println(sortedMyArray.get(i));
        // }
        for(int i = 0; i < 1000; i++){
            unsortedArray.set(i, (int)(Math.random()*10));
            //System.out.println(unsortedArray.get(i));
        }
        stopWatch watch4 = new stopWatch();
        ArrayList<Integer> sortedBubbleArray = bubbleSort(unsortedArray);
        System.out.println("TIME FOR Bubblesort: " + watch4.timeEllapsed());
        for(int i = 0; i < sortedArray.size(); i++){
           // System.out.println(sortedArray.get(i));
        }

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> unsortedArray){
        int swaps = 0;
        for(int i = unsortedArray.size(); i > 0; i--){
            for(int a = 0; a < i - 1; a++){
                if(unsortedArray.get(a) > unsortedArray.get(a + 1)){
                    int tempOne = unsortedArray.get(a);
                    unsortedArray.set(unsortedArray.get(a+1),a);
                    unsortedArray.set(a+1,tempOne);
                    swaps++;
                }else{
                    // if(a == (i-2)){
                        // i--;
                    // }
                }
            }
        }
        System.out.println(swaps + " SWAPS FOR BUBBLESORT");
        return unsortedArray;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray){
        int swaps = 0;
        for(int i = 0; i < unsortedArray.size(); i++){
            for(int a = i; a < unsortedArray.size(); a++){
                if(unsortedArray.get(i) > unsortedArray.get(a)){
                    int tempOne = unsortedArray.get(i);
                    unsortedArray.set(unsortedArray.get(a), i);
                    unsortedArray.set(a,tempOne);
                    swaps++;
                }
            }
        }
        System.out.println(swaps + " SWAPS FOR SELECTIONSORT");
        return unsortedArray;
    }

    public static ArrayList<Integer> mySort(ArrayList<Integer> unsortedArray){
        int swaps = 0 ;
        boolean alreadySorted = false;
        while(!alreadySorted){
            alreadySorted = true;
            for(int i = 0; i < (unsortedArray.size() - 1); i++){
                if(unsortedArray.get(i) > unsortedArray.get(i+1)){
                    int tempOne = unsortedArray.get(i);
                    unsortedArray.set(unsortedArray.get(i+1), i);
                    unsortedArray.set(i + 1,tempOne);
                    swaps++;
                    alreadySorted=false;
                }
            }
        }
        System.out.println(swaps + " SWAPS FOR MYSORT");
        return unsortedArray;
    }
    public static ArrayList<Integer> insertSort(ArrayList<Integer> unsortedArray){
        int swaps = 0;
        for(int i = 0; i < unsortedArray.size(); i++){
            int backNum = 0;
            for(int j = i; j < 0; j++){
                if(unsortedArray.get(i) < unsortedArray.get(j)){
                    backNum++;
                }
            }
           unsortedArray.set(i-backNum, i);
           swaps++;
        }
        System.out.println(swaps + " SWAPS FOR INSERTSORT");
        return unsortedArray;
    }
}
