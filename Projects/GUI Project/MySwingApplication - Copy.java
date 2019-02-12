import javax.swing.*;
/**
 * Write a description of class MySwingApplication here.
 *
 * @author (Guy Wilks)
 * @version (a version number or a date)
 */
public class MySwingApplication implements Runnable
{
    JFrame frame;
    public void run(){
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        CanvasComponent canvasComponent = new CanvasComponent(200,200);
        frame.add(canvasComponent);
        frame.addKeyListener(canvasComponent);
    }
    public static void main(){
        MySwingApplication swingApp = new MySwingApplication();
        SwingUtilities.invokeLater(swingApp);
    }
}
