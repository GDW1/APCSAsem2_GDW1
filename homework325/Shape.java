
/**
 * The shape interface has the basic abstract methods for shapes such as circles or squares.
 *
 * @author Guy Wilks
 * @version 3/26/19
 */


public interface Shape
{
    /**
     * @return returns the number of sides of a shape. If the shape is a circle it will return Integer.MAX_VALUE
     */
    int numberOfSides();
    /**
     * @return returns the area of a shape.
     */
    double getArea();
    /**
     * @return returns the perimeter of a shape.
     */
    double getPerimeter();

}
