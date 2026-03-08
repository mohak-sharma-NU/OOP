public class Course {

    protected String courseCode;
    protected String courseName;
    protected int courseCredits;

    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public String getCourseCode(){return this.courseCode;}

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){return this.courseName;}

    public void setCourseCredits(int courseCredits){
        this.courseCredits = courseCredits;
    }
    public int getCourseCredits(){return this.courseCredits;}

    public void printCourseDetails(){
        System.out.println("COURSE DETAILS:\nCourse Code: "+this.courseCode+"\nCourse Name: "+this.courseName+"\nCourse Credits: "+this.courseCredits+"\n\n");
    }
}
