//task 07
public class Employee {

    private int EmpID;
    private String Name;
    private double basicSalary;
    private int DaysWorked;

    public void setEmpID(int id){
        this.EmpID = id;
    }
    public int getEmpID(){return this.EmpID;}

    public void setName(String n){
        this.Name = n;
    }
    public String getName(){return this.Name;}

    public void setBasicSalary(double s){
        this.basicSalary = s;
    }
    public double getBasicSalary(){return this.basicSalary;}

    public void setDaysWorked(int d){
        this.DaysWorked = d;
    }
    public int getDaysWorked(){return this.DaysWorked;}

    public Employee(){}

    public Employee(int i,String N,double bS,int Dw){
        this.EmpID = i;
        this.Name = N;
        this.basicSalary = bS;
        this.DaysWorked = Dw;
    }

    public Employee(Employee e){
        this.EmpID = e.getEmpID();
        this.Name = e.getName();
        this.basicSalary = e.getBasicSalary();
        this.DaysWorked = e.getDaysWorked();
    }

    public double  calculateSalary(){
        double result = (this.getBasicSalary()/30)*this.getDaysWorked();
        System.out.println("ID: "+this.getEmpID()+"Salary: "+result);
        return result;
    }

    public void display(){
        System.out.println(
            "ID: "+this.getEmpID()+
        " Name: "+this.getName()+
        " Basic Salary: "+this.getBasicSalary()+
        " Days Worked: "+this.getDaysWorked());
    }

    public void finalize(){
        System.out.println("Destructor called: cleanup code here");
    }
    public static void main(String[] args){

        Employee e1 = new Employee();
        Employee e2 = new Employee(001, "Jake", 10000, 264);
        Employee e3 = new Employee(e2);

        e2.finalize();
        System.gc();

        e1.display();
        e2.display();
        e3.display();

    }
}
