
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class main
{
    ArrayList<cimbInfo> climbList = new ArrayList<>();
    public void addClimb(String peakName, int climbTime){
	climbList.add(new cimbInfo(peakName, climbTime));
}



public static void sortStringBubble( String  x [ ] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      } 

public void addClimbB(String peakName, int climbTime){
	climbList = new ArrayList<cimbInfo>(Array.asList(sortStringBubble(climbList.add(new cimbInfo(peakName, climbTime)).toArray())));
} 
}
