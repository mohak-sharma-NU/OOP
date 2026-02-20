
import java.util.Scanner;

public class College {

    Scanner in = new Scanner(System.in);

    private String collegeName;
    private String cityName;
    private Studentss studentss[];

    public College(String college,String city,Studentss[] s){
        this.collegeName = college;
        this.cityName = city;
        this.studentss = s;
        // studentss = new Studentss[numberOfstudents];
    }

    public void displayCollegeDetails(){
        System.out.println("College Name: "+this.collegeName+"\nCollege City: "+this.cityName+"\nSTUDENTS: ");
            
        int sum= 0,passed = 0,failed = 0 ;

        for (Studentss studentss : this.studentss) {
            studentss.displayStudentdetails();
            sum+=studentss.getMarks();
            
            if (studentss.isPassed()) {
                passed++;
            }else{
                failed++;
            }
        }

        double average = sum/studentss.length;

        System.out.println("====STATISTICS====");
        System.out.println("Total Students: "+studentss.length+
            "\nPassed "+passed+
            "\nFailed "+failed+
            "\nAverage "+average
        );
    }

    public static void main(String[] args) {

        Studentss[] l = new Studentss[5];

        l[0] = new Studentss(1, "Khizer", 99);
        l[1] = new Studentss(2, "Mohak", 98);
        l[2] = new Studentss(3, "John", 78);
        l[3] = new Studentss(4, "Josh", 39);
        l[4] = new Studentss(5, "Emily", 35);

        College c = new College("FAST NU", "Karachi", l);

        c.displayCollegeDetails();
    }
}
