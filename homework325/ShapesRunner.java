
/**
 * Write a description of class ShapesRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ShapesRunner
{
    public static void main(){
        ArrayList<Shape> shapes = new ArrayList();
        for(int i = 0; i < 15; i++){
            if(i%2==0){
                shapes.add(new Square((int)(Math.random()*10) + 1));
            }else{
                shapes.add(new Circle((int)(Math.random()*10) + 1));
            }
        }
        shapes = sortArea(shapes);
        for(int i = 0; i < 15; i++){
            if(shapes.get(i) instanceof Circle){
                 System.out.println("Type of shape: Circle; Area (sorted Perameter): " + shapes.get(i).getArea() + "; Perimeter: " + shapes.get(i).getPerimeter());
            }else{
                 System.out.println("Type of shape: Square; Area (sorted Perameter): " + shapes.get(i).getArea() + "; Perimeter: " + shapes.get(i).getPerimeter());
            }
        }
    }
    public static ArrayList<Shape> sortArea(ArrayList<Shape> arr){
        int n = arr.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr.get(j).getArea() > arr.get(j+1).getArea()) 
                { 
                    // swap arr[j+1] and arr[i] 
                    Shape temp = arr.get(j); 
                    arr.set(j, arr.get(j+1)); 
                    arr.set(j+1,temp); 
                } 
        return arr;
    }
}
