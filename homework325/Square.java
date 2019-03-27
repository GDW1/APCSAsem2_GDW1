
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square implements Shape
{
    // instance variables - replace the example below with your own
    private double sideLength;
    private int sides;
    private double perimeter;
    private double area;
    /**
     * Constructor for objects of class Square
     */
    public Square()
    {
        // initialise instance variables
        sides = 4;
        sideLength = 1.0;
    }
    public Square(double _sideLength)
    {
        // initialise instance variables
        sides = 4;
        sideLength = _sideLength;
    }
    public int numberOfSides(){return 4;}
    public double getArea(){return Math.pow(sideLength, 2);}
    public double getPerimeter(){return sideLength * 4.0;}
}
