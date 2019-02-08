
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    // instance variables - replace the example below with your own
    public int speed;
    public String catchphrase;
    /**
     * Constructor for objects of class Character
     */
    public Character(int _speed, String _catchphrase)
    {
        // initialise instance variables
        speed = _speed;
        catchphrase = _catchphrase;
    }
    public void setSpeed(int _speed){
        speed = _speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setCatchphrase(String _catchphrase){
        catchphrase = _catchphrase;
    }
    public String getCatchphrase(){
        return catchphrase;
    }
}
