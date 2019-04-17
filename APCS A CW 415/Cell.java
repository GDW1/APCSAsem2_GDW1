
/**
 * Write a description of class Cell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Cell
{
    // instance variables - replace the example below with your own
    boolean occupied;
    int id;
    ArrayList<Cell> neighbors = new ArrayList<Cell>();
    int row;
    int col;
    /**
     * Constructor for objects of class Cell
     */
    public Cell(boolean _occupied, int _id, int _row, int _col)
    {
        // initialise instance variables
        occupied = false;
        row = _row;
        col = _col;
        id = _id;
    }
    public void loadNeighbors(){
        //neighbors = GridTester.findNeighbors(row, col);
    }
}
