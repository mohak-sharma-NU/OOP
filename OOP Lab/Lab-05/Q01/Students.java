public class Students{

    private static int StudentsCount=0;
    private int StudentsID;
    private String Name;

    public Students(int i,String n){
        Students.StudentsCount++;
        this.StudentsID = i;
        this.Name = n;
    }

    public static int displayTotalStudentss(){
        System.out.println("Total Number of Studentss: "+Students.StudentsCount);
        return Students.StudentsCount;
    }

    public int getStudentsID(){return this.StudentsID;}
    
    public String getStudentsName(){return this.Name;}
    
    public void displayInfo(){
        System.out.println("Students ID: "+this.getStudentsID()+" Students Name: "+this.getStudentsName());
    }

    public static void main(String[] args) {
        Students s1 = new Students(1,"Khizer");
        Students s2 = new Students(2,"Mohak");
        Students s3 = new Students(56,"Shaheer");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Students.displayTotalStudentss();
    }
}
