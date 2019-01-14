
/**
 * Write a description of class stopWatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class stopWatch
{
    // instance variables - replace the example below with your own
    private long start;

    /**
     * Constructor for objects of class stopWatch
     */
    public stopWatch()
    {
        start = System.nanoTime();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public long timeEllapsed()
    {
        long end = System.nanoTime();
        return end - start;
    }
}
