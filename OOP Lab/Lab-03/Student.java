
public class Student {
    
    // Scanner input = new Scanner(System.in);

    private int rollNo;
    private String Name;
    private double Marks;

    //Constructor

    public Student(){
        this.rollNo = 1;
        this.Name = "Name";
        this.Marks = 49;
    }

    public Student(int rollno,String Name,double Marks){
        this.rollNo = rollno;
        this.Name = Name;
        this.Marks = Marks;
    }

    //Setters
    public void setRollNo(int roll){
        this.rollNo = roll;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setMarks(double marks){
        this.Marks = marks;
    }
    
    //Getters
    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.Name;
    }
    public double  getMarks(){
        return this.Marks;
    }

    //Method for calculating grade
    public static String calGrade(double marks){

        if (marks>100){
            System.out.print("Invalid Marks(>100)");
            return "";
        }else if(marks>95){
            return "A+";
        }else if(marks>90){
            return "A";
        }else if(marks>80){
            return "B";
        }else if(marks>70){
            return "C";
        }else if(marks>60){
            return "D";
        }else if(marks>50){
            return "D-";
        }else{
            return "F";
        }

    }

    public void Display(){
        System.out.print("Rollno: "+this.rollNo+"\tName: "+this.Name+"\tMarks: "+this.Marks);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student(1,"Khizer",0);
        Student s2 = new Student(2,"Mohak",0);
        Student s3 = new Student(3,"John",0);

        s1.setMarks(86.574);
        s2.setMarks(83.902);
        s3.setMarks(76.909);

        s1.Display();
        System.out.print(" Grade: "+Student.calGrade(s1.getMarks())+"\n");
        s2.Display();
        System.out.print(" Grade: "+Student.calGrade(s2.getMarks())+"\n");
        s3.Display();
        System.out.print(" Grade: "+Student.calGrade(s3.getMarks())+"\n");
    }
}
