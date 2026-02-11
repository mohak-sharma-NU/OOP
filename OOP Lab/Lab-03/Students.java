

public class Students {

    private int rollno;
    private String Name;
    private double marks;
    private int attendance;

    private boolean status;

    public Students(int rollNo,String N,double M,int attendance){
        this.rollno = rollNo;
        this.Name = N;
        this.marks = M;
        this.attendance = attendance;
    }

    public void setRollNo(int roll){
        this.rollno = roll;
    }
    public void setName(String N){
        this.Name = N;
    }
    public void setMarks(double M){
        this.marks = M;
    }
    public void setAttendance(int att){
        this.attendance = att;
    }
    public void setStatus(boolean stat){
        this.status = stat;
    }

    public int getRollNo(){return this.rollno;}

    public String getName(){return this.Name;}

    public double getMarks(){return this.marks;}
    
    public int getAttendance(){return this.attendance;}

    public boolean getStatus(){return this.status;}

    public static void calculateResult(Students obj){
        if(obj.getAttendance()>=75&&obj.getMarks()>=40){
            System.out.println("Pass");
            obj.setStatus(true);
        }else{
            System.out.println("Fail");
            obj.setStatus(false);
        }
    }

    public void display(){
        System.out.println("Rollno: "+this.getRollNo()+", Name: "+this.getName()+", Marks: "+this.getMarks()+", Attendance: "+this.getAttendance()+", Status: " + ((this.getStatus()) ? "Pass" : "Fail"));
    }

    public static void main(String[] args){   

        Students s1 = new Students(1,"John",74,67); 
        Students s2 = new Students(2,"Mark",90,80); 
        Students s3 = new Students(3,"Asadullah",100,90); 

        s1.setMarks(s1.getMarks()-2);
        s2.setMarks(s2.getMarks()-2);
        s3.setMarks(s3.getMarks()-2);

        s1.setAttendance(s1.getAttendance()-2);
        s2.setAttendance(s2.getAttendance()-1);
        s3.setAttendance(s3.getAttendance()-4);

        Students.calculateResult(s1);
        Students.calculateResult(s2);
        Students.calculateResult(s3);

        s1.display();
        s2.display();
        s3.display();

    }
}
