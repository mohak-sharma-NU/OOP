
public class UndergraduateCourse extends Course{

    protected String departmentName;

    protected int level;
    
    public void setDepartmentName(String departmentName){this.departmentName = departmentName;}
    
    public String getDepartmentName(){return this.departmentName;}

    public void setLevel(int level){this.level = level;}

    public int getLevel(){return this.level;};
    public void printUgradDetails(){
        printCourseDetails();
        System.out.println("\nU-GRAD Department: "+this.departmentName+"\nU-GRAD Level (Batch): "+this.level+"\n");
    }
}
