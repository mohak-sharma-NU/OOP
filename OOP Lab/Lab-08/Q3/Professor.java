public class Professor extends Staff implements Teaching, Research{
    
    public Professor(String Name,int ID,String Department){
        super(Name, ID, Department);
    }

    public void conductLecture(){
        System.out.println("Professor is Conducting Lecture");
    }

    public void publishPaper(){
        System.out.println("Professor can publish paper");
    }
}
