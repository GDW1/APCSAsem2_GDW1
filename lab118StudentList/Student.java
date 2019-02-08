
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    String firstName = "";
    String lastName = "";
    String middleName = "";
    String fullname = "";
    double gpa;
    int stuNumber;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int number, double newgpa)
    {
        // initialise instance variables
        fullname = name;
        stuNumber = number;
        gpa = newgpa;
        parseName(name.trim());
    }
    public void parseName(String name){
        if(name.contains(",")){
            lastName = name.substring(0, name.indexOf(","));
            firstName = name.substring(name.indexOf(", ") + 1);
         
        }else{
            if(name.contains(" ")){
                int firstSpace =  name.indexOf(" ");
                firstName = name.substring(0, firstSpace);
                int secondSpace = name.indexOf(" ", firstSpace + 1);
                middleName = name.substring(firstSpace + 1, secondSpace);
                lastName = name.substring(secondSpace + 1);
            }
        }
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setName(String name){
        parseName(name);
    }
    public String getFullName(){
        return fullname;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double newgpa){
        gpa = newgpa;
    }
    public void setNum(int num){
        stuNumber = num;
    }
    public int getNum(){
        return stuNumber;
    }
}
