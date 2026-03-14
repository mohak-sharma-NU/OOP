public class LabInstructor extends Staff implements Teaching, Research{
        
    public LabInstructor(String Name,int ID,String Department){
        super(Name, ID, Department);
    }

    public void conductLecture(){
        System.out.println("Lab Instructor is Conducting Lecture");
    }

    public void publishPaper(){
        System.out.println("Lab Instructor cannot publish paper");
    }
}
