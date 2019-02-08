
/**
 * This class gets user input and parses it inot a student list
 * @author Guy
 * @version 1.0
 */
import java.util.*;
public class StudentListRunner extends StudentList
{
    static StudentList list = new StudentList();
    Student[] returnedSortedStudent;
    // instance variables - replace the example below with your own
    public static void main(){
        clearScreen();
        StudentListRunner runner = new StudentListRunner();
        runner.giveList();
        list.addStudent("c, b", 4, 3456);
        list.addStudent("wilks, guy", 4, 1234);
        list.addStudent("b, a", 4, 2345);
    }

    /**
     * this method can be run over and over to increase reusablility
     */
    public void giveList(){
        StudentListRunner runner = new StudentListRunner();
        System.out.println("Pick an option from the list below\n 1 - Add Student \n 2 - Edit Student \n 3 - Delete Student \n 4 - Delete All Students \n 5 - Print one Student  \n 6 - Print All Students \n 7 - sort students \n 8 - seach for student");
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("Pick a number from the options to begin: ");
        try{
            int numPicked = pickFromList.nextInt()-1;
            switch(numPicked){
                case 0:
                runner.addStudentInput();
                break;
                case 1:
                runner.editStudentInput();
                break;
                case 2:
                runner.deleteStudentInput();
                break;
                case 3:
                list.clearList();
                break;
                case 4:
                runner.printStudentInput();
                break;
                case 5:
                runner.printAllInput();
                break;
                case 6:
                runner.sortList();
                break;
                case 7:
                runner.searchStudent();
                break;
                case 8:
                runner.addPre();
                break;
            }
        }catch(InputMismatchException e){
            String picked = pickFromList.nextLine();
            if(picked == "q"){
                System.out.println("goodbye");
                System.exit(0);
            }
        }
    }

    static int binarySearch(Student arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid].getNum() == x) 
                return mid;   
            if (arr[mid].getNum() > x) 
                return binarySearch(arr, l, mid - 1, x);   
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 

    /**
     * This prints every student
     */
    public void searchStudent(){
        StudentListRunner runner = new StudentListRunner();
        runner.sortList();
        clearScreen();
        Student[] stus = returnedSortedStudent;
        int length = stus.length;
        int[] ids = new int[stus.length];
        for(int i = 0; i < stus.length; i++){
            ids[i] = (stus[i].getNum());
        }
        Student[] result = stus;
        runner.giveList();
    }
    public void addPre(){
        StudentListRunner runner = new StudentListRunner();
        list.addStudent("a,b", 4, 798932);
        list.addStudent("a,c", 4, 134543);
        list.addStudent("a,d", 4, 123565);
        list.addStudent("a,b", 4, 897634);
        clearScreen();
        runner.giveList();
    }
    /**
     * This prints every student
     */
    public void printAllInput(){
        StudentListRunner runner = new StudentListRunner();
        clearScreen();
        list.printList();
        runner.giveList();
    }

    /**
     * This will ask for usr input and parse it into a student object in an arraylist 
     */
    public void addStudentInput(){
        ArrayList<Student> currentList = list.mainList;
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the name of the student: ");
        String namePicked = pickFromList.nextLine();
        System.out.print("What is the student number: ");
        int numPicked = pickFromList.nextInt();
        System.out.print("what is the Student gpa: ");
        double gpaPicked = pickFromList.nextDouble();
        list.addStudent(namePicked, gpaPicked, numPicked);
        clearScreen();
        runner.giveList();
    }

    /**
     * This will ask for a student and then a value to replace and will send it to the student list to parse
     */
    public void editStudentInput(){
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the last name or number of the student that you want: ");

        int wantedIndex = -1;
        try{
            String namePicked = pickFromList.nextLine();
            for(int i = 0; i < list.mainList.size(); i++){
                if(list.mainList.get(i).getLastName().contains(namePicked)){
                    wantedIndex = i;
                }
            }
        }catch(InputMismatchException e){
            int studNumberPicked = pickFromList.nextInt();
            for(int i = 0; i < list.mainList.size(); i++){
                if(list.mainList.get(i).getNum() == studNumberPicked){
                    wantedIndex = i;
                }
            }
        }
        if(wantedIndex != -1){
            System.out.println("Name:" + list.mainList.get(wantedIndex).getFullName());
            System.out.println("1 - Gpa \n 2- Name");
            try{
                int numPicked = pickFromList.nextInt() - 1;
                switch(numPicked){
                    case 0:
                    System.out.print("what is the Student gpa: ");
                    double gpaPicked = pickFromList.nextDouble();
                    list.editStudentList(numPicked, gpaPicked);
                    break;
                    case 1:
                    System.out.print("what is the Student name: ");
                    String newName = pickFromList.nextLine();
                    list.editStudentList(numPicked, newName);
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println("not a valid format");
                System.exit(0);
            }
        }else{
            System.out.println("The last name you enetered was not registered");
        }
        clearScreen();
        System.out.println("The info has been inputed");
        runner.giveList();
    }

    /**
     * This will ask for a student then delete it
     */
    public void deleteStudentInput(){
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the last name or number of the student that you want: ");
        list.deleteStudent(pickFromList.nextLine());
    }

    public void sortList(){
        StudentListRunner runner = new StudentListRunner();
        Student[] stus = list.getStuIDs();
        int[] ids = new int[stus.length];
        for(int i = 0; i < stus.length; i++){
            ids[i] = (stus[i].getNum());
        }
        clearScreen();
        mergeSort(stus, stus.length);
        //mergeSortInt(ids, stus.length);
        for(int i = 0; i < stus.length; i++){
            System.out.println(stus[i].getFirstName() + ": "+ stus[i].getNum());
        }
        returnedSortedStudent = stus;
        runner.giveList();
        //TODO 
    }

    /**
     * This will ask for a student and then print the information for it
     */
    public void printStudentInput(){
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the last name or number of the student that you want: ");
        try{
            String name = pickFromList.nextLine();
            list.printStudent(name);
        }catch(InputMismatchException e){
            int name = pickFromList.nextInt();
            list.printStudent(name);
        }
    }

    /**
     * This will clear the screen
     */
    public static void clearScreen() {  
        System.out.print("\u000C");  
    }

    public static void mergeSortInt(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSortInt(l, mid);
        mergeSortInt(r, n - mid);

        mergeInt(a, l, r, mid, n - mid);
    }

    public static void mergeInt(
    int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }}

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {return;} //  Base Case
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = (a[i]);
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = (a[i]);
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getNum() <= r[j].getNum()) {
                a[k++] = (l[i++]);
            }else {
                a[k++]=(r[j++]);
            }
        }
        while (i < left) { a[k++] = (l[i++]);}
        while (j < right) {a[k++] = (r[j++]);}
    }

}
