public class Studentss {
    private int StudentID;
    private String Name;
    private int Marks;

    public void setStudentID(int i){
        this.StudentID = i;
    }
    public int getStudentID(){return this.StudentID;}

    public void setStudentName(String n){
        this.Name = n;
    }
    public String getStudentName(){return this.Name;}
    
    public void setMarks(int m){
        this.Marks = m;
    }
    public int getMarks(){return this.Marks;}
    
    public Studentss(int i,String name,int m){
        this.StudentID = i;
        this.Name = name;
        this.Marks = m;
    }

    public boolean isPassed(){
        return this.Marks>40;
    }

    public void displayStudentdetails(){
        System.out.println("Student ID: "+this.StudentID+"\nStudent Name: "+this.Name+"\nMarks: "+this.Marks+"\nPassed: "+this.isPassed()+"\n=");
    }
}
