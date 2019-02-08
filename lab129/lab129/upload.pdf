
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String [] args){
        Character mario = new Mario("it's me Mario", 100);

        System.out.println(mario.getCatchphrase());

        System.out.println(mario.getSpeed());
    }
}

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
