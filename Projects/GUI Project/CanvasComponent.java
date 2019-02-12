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
        motionSpeed = 1;
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
        int lastX = x;
        int lastY = y;
        int slopeX = (mouseFromX - lastX);
        if(mouseFromX >= x  &&
           mouseFromX <= x + width &&
           mouseFromY >= y  &&
           mouseFromX <= y + height){
              x = mouseFromX - (width/2);
              y = mouseFromY - (height/2);
              
        }else{
            int slope = (mouseFromY-y)/(mouseFromX - x);
            if(slope > 0){

                    x =+ (mouseFromX - lastX)/2;
                    y =+ (mouseFromY - lastY)/2;
                    System.out.println(slope);
                    repaint();
                
            }else{
                
                    x += (mouseFromX - lastX)/2;
                    y += (mouseFromY - lastY)/2;
                    System.out.println(slope);
                    repaint();
                
            }
        }

    }
    public void chase(int slope){
        for(int i = 0; i < 1000; i++){
            x+=1;
            y+=slope;
        }
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
            if(motionSpeed > 0){
                motionSpeed -= 0.2;
            }
        }
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyPressed(KeyEvent e){
    }
    public void mouseDragged(MouseEvent e){
        int toX = e.getX();
        int toY = e.getY();
        x = toX ;
        y = toY ;
        repaint();
    }
    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = this.getSize();
        if(x + width > 400){
            animationDeltaX = (0) * motionSpeed;
            animationDeltaY = (1) * motionSpeed;
            x+=-2;
            y+=animationDeltaY;
        }
        else if(y + height > 400){
            animationDeltaX = (-1) * motionSpeed;
            animationDeltaY = (0) * motionSpeed;
            x+=animationDeltaX;
            y+=-2;
        }else if(y < 0){
            animationDeltaX = (1) * motionSpeed;
            animationDeltaY = (0) * motionSpeed;
            x+=animationDeltaX;
            y+=3;
        }else if(x < 0){
            animationDeltaX = (0) * motionSpeed;
            animationDeltaY = (-1) * motionSpeed;
            x+=3;
            y+=animationDeltaY;
        }else{
            x+=animationDeltaX * motionSpeed;
            y+=animationDeltaY *motionSpeed;
        }
        repaint();
    }
}
