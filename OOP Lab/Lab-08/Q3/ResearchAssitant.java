public class ResearchAssitant extends Staff implements Teaching, Research{
    
    public ResearchAssitant(String Name,int ID,String Department){
        super(Name, ID, Department);
    }

    public void conductLecture(){
        System.out.println("Research Assistant cannot conducting Lecture");
    }

    public void publishPaper(){
        System.out.println("Research Assistant is conducting Lecture");
    }
}
