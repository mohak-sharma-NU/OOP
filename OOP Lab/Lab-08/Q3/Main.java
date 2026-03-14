public class Main {
    
    public static void main(String[] args) {

        Professor p = new Professor("Ahmed", 1, "Computer Science");
        LabInstructor l = new LabInstructor("Ali", 2, "Software Engineering");
        ResearchAssitant r = new ResearchAssitant("Alita: Battle Angle", 3, "Robotics Design");

        p.conductLecture();
        p.publishPaper();

        l.conductLecture();
        l.publishPaper();

        r.conductLecture();
        r.publishPaper();
        
    }
}
