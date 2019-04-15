
/**
 * Write a description of class someClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class someClass
{
    // instance variables - replace the example below with your own
    private ArrayList<String> x;

    /**
     * Constructor for objects of class someClass
     */
    public someClass()
    {
        // initialise instance variables
        x = new ArrayList<String>();
    }

    public void sortStrings(){
        int n = x.size(); 

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (x.get(j).compareTo(x.get(min_idx)) > 0) 
                    min_idx = j; 

            // Swap the found minimum element with the first 
            // element 
            String temp = x.get(min_idx); 
            x.set(min_idx, x.get(i)); 
            x.set(i, temp); 
        } 
    }

    public void shuffleString(){
        Random rgen = new Random(); // Random number generator
        for (int i=0; i<x.size(); i++) {
            int randomPosition = rgen.nextInt(x.size());
            String temp = x.get(i);
            x.set(i, x.get(randomPosition));
            x.set(randomPosition, temp);
        }
    }
    
    public void insertString(String word){
        x.add(word);
        sortStrings();
    }

}
