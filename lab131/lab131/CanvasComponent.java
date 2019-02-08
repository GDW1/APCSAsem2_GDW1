import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.util.*;
/**
 * Write a description of class CanvasComponent here.
 *
 * @author (Guy Wilks)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    int x;
    int y;
    int width;
    int height;
    int mouseFromX;
    int mouseFromY;
    boolean shapeSelected;
    double animationDeltaX;
    double animationDeltaY;
    int gutterX;
    int gutterY;
    Timer timer;
    double motionSpeed;
    public CanvasComponent(int _height, int _width){
        width = _width;
        motionSpeed = 0;
        height = _height;
        setSize(_width, _height);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX = 40;
        gutterY = 40;
        timer = new Timer(20, this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x,y,width, height);
    }
    public void mouseClicked(MouseEvent e){
   
    }
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX >= x  &&
           mouseFromX <= x + width &&
           mouseFromY >= y  &&
           mouseFromX <= y + height){
              x = mouseFromX - (width/2);
              y = mouseFromY - (height/2);
        }
        repaint();
    }
    public void mouseReleased(MouseEvent e){
    
    }
    public void mouseEntered(MouseEvent e){
    
    }
    public void mouseExited(MouseEvent e){
    
    }
    public void mouseMoved(MouseEvent e){
    
    }
    public void keyTyped(KeyEvent e){
        if(e.getKeyChar() == '+'){
            motionSpeed += 2;
        }else if(e.getKeyChar() == '-'){
            motionSpeed-= 2;
        }
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyPressed(KeyEvent e){
    }
    public void mouseDragged(MouseEvent e){
        int toX = e.getX();
        int toY = e.getY();
        x = (toX - width/2);
        y = toY - (height/2);
        repaint();
    }
    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = this.getSize();
        // x += animationDeltaX;
        // y += animationDeltaY;
        double rand = (Math.random() * 3) - 1;
        double rand2 = (Math.random() * 4) - 1;
        if((x) + width > 400){
            animationDeltaX = -1 + rand - motionSpeed;
            animationDeltaY = -1 + rand2 - motionSpeed;
            x+=animationDeltaX;
            y+=animationDeltaY;
        }
        else if((y) + height > 400){
            animationDeltaX = -1 + rand - motionSpeed;
            animationDeltaY = -1 + rand2 - motionSpeed;
            x+=animationDeltaX;
            y+=animationDeltaY;
        }else if(y < 10){
            animationDeltaX = 1 + rand + motionSpeed;
            animationDeltaY = 1 + rand2 + motionSpeed;
            x+=animationDeltaX;
            y+=animationDeltaY;
        }else if(x < 10){
            animationDeltaX = 1 + rand + motionSpeed;
            animationDeltaY = 1 + rand2 + motionSpeed;
            x+=animationDeltaX;
            y+=animationDeltaY;
        }else{
            x+=animationDeltaX;
            y+=animationDeltaY;
        }
        repaint();
    }
}
