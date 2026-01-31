
import java.util.Scanner;

public class TaskNine {
 
    private int numberOfStudents;
    private int[] Grades;

    public TaskNine(int NoOfstudents){
        numberOfStudents = NoOfstudents;
        Grades = new int[numberOfStudents];
    }
    public void setNoOfStudents(int n){
        numberOfStudents = n;
    }
    public int getNoOfStudents(){
        return numberOfStudents;
    }

    public void setGrade(int index,int grade){
        Grades[index] = grade;
    }
    public int getGrade(int index){
        return Grades[index];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    

        System.out.println("Enter the number of students: ");

        int n = input.nextInt();

        TaskNine t1 = new TaskNine(n);

        int sum=0;
        System.out.println("Enter grade of each student: ");
        for (int i = 0; i < t1.getNoOfStudents(); i++){
            
            t1.setGrade(i,input.nextInt());
            sum+=t1.getGrade(i);
        }

        float avg = (float) sum/t1.getNoOfStudents();
        System.out.println("Average grades: "+avg);

        int passedStudents=0,failed = 0;

        for (int i = 0; i < t1.getNoOfStudents(); i++) {
            if (t1.getGrade(i)<60) {
                failed++;
            }else{
                passedStudents++;
            }
        }
        
        System.out.println("Passed Students: "+passedStudents+"\nFalied Students: "+failed);

    }
}