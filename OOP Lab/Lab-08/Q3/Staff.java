public class Staff {

    private String Name;
    private int ID;
    private String Department;

    public Staff(){}

    public Staff(String Name,int ID,String Department){
        this.Name = Name;
        this.ID = ID;
        this.Department = Department;
    }

    public void displayInfo(){
        System.out.println("Name: "+this.Name
        +"\nID: "+this.ID
        +"\nDepartment: "+this.Department);
    }
}