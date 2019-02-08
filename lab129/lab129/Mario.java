
/**
 * Write a description of class Mario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mario extends Character
{
    
    /**
     * Constructor for objects of class Mario
     */
    public Mario(String _catchphrase, int _speed)
    {
        // initialise instance variables
        super(_speed, _catchphrase);
    }

    public void setSpeed(int _speed){
        super.setSpeed(_speed * 2);
    }
}
