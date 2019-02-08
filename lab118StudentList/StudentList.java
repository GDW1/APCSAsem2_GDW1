
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class StudentList
{
    ArrayList<Student> mainList;
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList()
    {
        // initialise instance variables
        mainList = new ArrayList<Student>();
    }
    /**
     * this will make a student
     */
    public void addStudent(String name, double gpa, int stuNumber){
        mainList.add(new Student(name, stuNumber, gpa));
    }
    /**
     * This will delete a student
     */
    public void deleteStudent(String lastName){
        String tempLastName = lastName;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getLastName()){
                mainList.remove(i);
            }
        }
    }
    /**
     * this will edit a student
     */
    public void editStudentList(int number, String editedVar){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                mainList.get(i).setName(editedVar);
            }
        }
    }
    /**
     * Gets all student ids in the list
     */
    public Student[] getStuIDs(){
        Student[] ids = new Student[mainList.size()];
        for(int i = 0; i < mainList.size(); i++){
            ids[i] = mainList.get(i);
        }
        return ids;
    }
    /**
     * this will also edit the student
     */
    public void editStudentList(String name, String editedVar){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                mainList.get(i).setName(editedVar);
            }
        }
    }
    /**
     * this will also edit the student
     */
    public void editStudentList(int number, int editedVar){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                mainList.get(i).setNum(editedVar);
            }
        }
    }
    /**
     * this will also edit the student
     */
    public void editStudentList(String name, int editedVar){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                mainList.get(i).setNum(editedVar);
            }
        }
    }
    public void editStudentList(int number, double editedVar){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                mainList.get(i).setGpa(editedVar);
            }
        }
    }
    /**
     * this will also edit the student
     */
    public void editStudentList(String name, double editedVar){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                mainList.get(i).setGpa(editedVar);
            }
        }
    }
    /**
     * this will delete all the student
     */
    public void clearList(){
        mainList.clear();
    }
    /**
     * this will print the student
     */
    public void printList(){
        for(int i = 0; i < mainList.size(); i++){
            System.out.println(mainList.get(i).getFirstName());
        }
    }
    /**
     * this will print the student
     */
    public void printStudent(String name){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                System.out.println("Student Name:" + mainList.get(i).getFullName());
            }
        }
    }
    /**
     * this will print all the student
     */
    public void printStudent(int number){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                System.out.println("Student Num:" + mainList.get(i).getNum());
            }
        }
    }
   
}
