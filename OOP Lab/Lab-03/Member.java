
public class Member {
    
    private int memberID;
    private String Name;
    private double WeightBefore;
    private double Weight;
    private int WorkoutHours;
    private boolean Progress;

    public Member(){}

    public Member(int memberID, String Name, double weightBefore,double Weight, int WorkoutHours,boolean P){
        this.memberID = memberID;
        this.Name = Name;
        this.WeightBefore = weightBefore;
        this.Weight = Weight;
        this.WorkoutHours = WorkoutHours;
        this.Progress = P;
    }

    public void setMemberID(int mem){
        this.memberID = mem;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setWeightBefore(double w){
        this.WeightBefore = w;
    }
    public void setWeight(double weight){
        this.Weight = weight;
    }
    public void setWorkoutHours(int hours){
        this.WorkoutHours = hours;
    }
    public void setProgress(boolean p){
        this.Progress = p;
    }

    public String getName(){return this.Name;}

    public int getMemberID(){return this.memberID;}

    public double getWeightbefore(){return this.WeightBefore;}
    
    public double getWeight(){return this.Weight;}

    public int getWorkoutHours(){return this.WorkoutHours;}

    public boolean getProgress(){return this.Progress;}

    public static void assessProcess(Member obj){
        if (obj.getWorkoutHours()>=10&&obj.getWeight()<obj.getWeightbefore()) {
            obj.setProgress(true);
        }else{
            obj.setProgress(false);
        }
    }

    public void display(){
        System.out.println("\nMemberID: "+this.getMemberID()+", Member Name: "+this.getName()+", WeightBefore: "+this.getWeightbefore()+", Weight: "+this.getWeight()+", Workout Hours: "+this.getWorkoutHours()+", Progress: "+((this.getProgress()?"Good Progress":"Needs Improvement")));
    }

    public static void main(String[] args) {      

        Member m1 = new Member(1,"John",90.99,78.99,9,false);
        Member m2 = new Member(2,"Ali",85.50,80.00,12,false);
        Member m3 = new Member(3,"Sara",70.00,68.25,15,false);

        m1.setWeight(m1.getWeight()-1);
        m2.setWeight(m2.getWeight()-2);
        m3.setWeight(m3.getWeight()-3);

        m1.setWorkoutHours(m1.getWorkoutHours()-3);
        m2.setWorkoutHours(m2.getWorkoutHours()-1);
        m3.setWorkoutHours(m3.getWorkoutHours()-2);

        Member.assessProcess(m1);
        Member.assessProcess(m2);
        Member.assessProcess(m3);

        m1.display();
        m2.display();
        m3.display();
        
    }
}
