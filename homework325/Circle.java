
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Shape
{
    private int sides;
    private double diameter;
    private double radius;
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Circle
     */
    public Circle(double _radius)
    {
        // initialise instance variables
        sides = Integer.MAX_VALUE;
        radius = _radius;
        diameter = radius * 2.0;
    }
    public Circle()
    {
        // initialise instance variables
        sides = Integer.MAX_VALUE;
        radius = 1.0;
        diameter = radius * 2.0;
    }
    public int numberOfSides(){return Integer.MAX_VALUE;}
    public double getArea(){return Math.pow(radius, 2)*Math.PI;}
    public double getPerimeter(){return Math.PI * diameter;}
}
