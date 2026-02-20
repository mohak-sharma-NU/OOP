public class Student {
    
    private Laptop laptop;
    private int StudentsID;
    private String Name;

    public Student(int i,String N,Laptop l){
        this.StudentsID = i;
        this.Name = N;
        this.laptop = l;
    }

    public Student(int i,String N,String B,int r,int b,double bb){
        this.StudentsID = i;
        this.Name = N;
        this.laptop = new Laptop(B,r,b,bb);
    }

    
    public int getStudentID(){return this.StudentsID;}
    
    public String getStudentName(){return this.Name;}

    public void displayInfo(){
        System.out.println("\nSTUDENT DETAILS: \nStudent ID: "+this.getStudentID()+" \nStudent name: "+this.getStudentName()+"\nLAPTOP DETAILS: \nLaptop Brand: "+
        this.laptop.getBrand()+" \nLaptop Ram: "+this.laptop.getRam()+" \nLaptop Battery: "+this.laptop.getBatteryCap()+" \nLaptop Backup Battery: "+this.laptop.calculateBatteryBackup());
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP",128,100,0);
        Student s1 = new Student(1,"Khizer",l1);

        Student s2 = new Student(2,"Mohak","DELL",256,150,00);
        
        s1.displayInfo();
        s2.displayInfo();
    }
}
