public class Employee{

    private int EmployeeID;
    private String Name;
    private double BasicSalary;
    private double totalCompensation;
    
    private static double totalBonusPool=0;
    private static double BonusPercentage=5;
    private static int TotalEmployees;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.EmployeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.BasicSalary = basicSalary;
    }

    public double getTotalCompensation() {
        return totalCompensation;
    }

    public void setTotalCompensation(double totalCompensation) {
        this.totalCompensation = totalCompensation;
    }

    public void SetTotalCompensation() {
        this.totalCompensation = this.BasicSalary+(Employee.totalBonusPool/Employee.TotalEmployees);
    }

    public static double getTotalBonusPool() {
        return totalBonusPool;
    }

    public static void setTotalBonusPool(double totalBonusPool) {
        Employee.totalBonusPool = totalBonusPool;
    }

    public static double getBonusPercentage() {
        return BonusPercentage;
    }

    public static void setBonusPercentage(double bonusPercentage) {
        Employee.BonusPercentage = bonusPercentage;
    }

    public static int getTotalEmployees() {
        return TotalEmployees;
    }

    public static void setTotalEmployees(int totalEmployees) {
        Employee.TotalEmployees = totalEmployees;
    }

    public Employee(int e,String n,double b){
        this.EmployeeID = e;
        this.Name = n;
        this.BasicSalary = b;
        this.SetTotalCompensation();
        Employee.TotalEmployees++;
        Employee.totalBonusPool = Employee.totalBonusPool + (this.BasicSalary*(Employee.BonusPercentage/100));
    }

    public double calculateTotalCompensation(){
        return this.totalCompensation = this.BasicSalary+(Employee.totalBonusPool/Employee.TotalEmployees);
    }

    public static void displayBonusPool(){
        System.out.println("Total Bonus Pool: "+Employee.totalBonusPool);
    }

    public void displayInfo(){
        System.out.println("\nEmployee ID: "+this.getEmployeeID()
        +"\nEmployee name: "+this.getName()
        +"\nBasic Salary: "+this.getBasicSalary()
        +"\nTotal Compensation: "+this.getTotalCompensation()
        +"\n");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", 100000);
        Employee e2 = new Employee(2, "Mark", 15000);
        Employee e3 = new Employee(3, "Jane", 20000);
        Employee e4 = new Employee(4, "Harry", 25000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
        e4.displayInfo();

        Employee.displayBonusPool();
    }
}
