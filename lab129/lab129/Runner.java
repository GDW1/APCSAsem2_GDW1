
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
