public class Holiday {
    private String Name;
    private int Day;
    private String Month;

    public Holiday(String n,int d,String m){
        this.Name = n;
        this.Day = d;
        this.Month = m;
    }

    //Copy Contructor
    public Holiday(Holiday h){
        this.Name = h.getName();
        this.Day = h.getDay();
        this.Month = h.getMonth();
    }

    public String getName(){
        return this.Name;
    }
    public int getDay(){
        return this.Day;
    }
    public String getMonth(){
        return this.Month;
    }

    public void setName(String n){
        this.Name = n;
    }
    public void setDay(int d){
        this.Day = d;
    }
    public void setMonth(String m){
        this.Month = m;
    }

    public boolean inSameMonth(Holiday h2){

        if (this.getMonth().equalsIgnoreCase(h2.getMonth())) {
            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        System.out.println("Name :"+this.getName()+" Day: "+this.getDay()+" Month: "+this.getMonth());
    }
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Independence Day", 14, "August");
        Holiday h2 = new Holiday("labour day",1 , "May");
        Holiday h3 = new Holiday("Pakistan Day", 23, "May");
        Holiday h4 = new Holiday(h2);

        h1.display();
        h2.display();
        h3.display();
        h4.display();

        System.out.println("Same month: "+h3.inSameMonth(h2));
    }
}
