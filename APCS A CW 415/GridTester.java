
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridTester
{
    // instance variables - replace the example below with your own
    Cell[][] grid;

    /**
     * Constructor for objects of class GridTester
     */
    public GridTester(int rows, int cols)
    {
        // initialise instance variables
        grid = new Cell[rows][cols];
    }
    public void loadOccupied(){
        int id =0;
        for(int i = 0; i < grid.length; i++){
            for(int a = 0; a < grid[0].length; a++){
                    grid[i][a] = new Cell((int)(Math.random()*3) + 1 == 3,id,i,a );
                    id++;
              
            }
        }
    }
    private static ArrayList<Cell> getNeighborsOfPoint(int i, int j) {
        ArrayList<Point> neighbors = new ArrayList<Point>();
        if (CONSIDER_CORNERS) {
            if (i < rows && j < cols && i >= 1 && j >= 1 && array[i][j] != 0) {
                neighbors.add(new Point(i-1, j-1));
            }
            if (i < rows && j < cols-1 && i >= 1 && j >= 0 && array[i][j] != 0) {
                neighbors.add(new Point(i-1, j+1));
            }
            if (i < rows-1 && j < cols && i >= 0 && j >= 1 && array[i][j] != 0) {
                neighbors.add(new Point(i+1, j-1));
            }
            if (i < rows-1 && j < cols-1 && i >= 0 && j >= 0 && array[i][j] != 0) {
                neighbors.add(new Point(i+1, j+1));
            }
        }

        if (i < rows && j < cols && i >= 1 && j >= 0 && array[i][j] != 0) {
            neighbors.add(new Point(i-1, j));
        }

        if (i < rows && j < cols && i >= 0 && j >= 1 && array[i][j] != 0) {
            neighbors.add(new Point(i, j-1));
        }
        if (i < rows && j < cols-1 && i >= 0 && j >= 0 && array[i][j] != 0) {
            neighbors.add(new Point(i, j+1));
        }

        if (i < rows-1 && j < cols && i >= 0 && j >= 0 && array[i][j] != 0) {
            neighbors.add(new Point(i+1, j));
        }

        return neighbors;
    }

}
