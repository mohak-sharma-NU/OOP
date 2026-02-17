
import java.util.Scanner;



public class Laptop {
    
    Scanner input = new Scanner(System.in);

    private String Brand;
    private String Model;
    private double Price;
    private int Stock;

    public void setBrand(String b){
        this.Brand = b;
    }
    public String getBrand(){return this.Brand;}

    public void setModel(String m){
        this.Model = m;
    }
    public String getModel(){return this.Model;}

    public void setPrice(double p){
        this.Price = p;
    }
    public double getPrice(){return this.Price;}

    public void setStock(int s){
        this.Stock = s;
    }
    public int getStock(){return this.Stock;}


    public Laptop(){}

    public Laptop(String b,String m,double p,int s){
        this.Brand = b;
        this.Model = m;
        this.Price = p;
        this.Stock = s;
    }

    public Laptop(Laptop l){
        this.Brand = l.Brand;
        this.Model = l.Model;
        this.Price = l.Price;
        this.Stock = l.Stock;
    }

    public void finalize(){
        System.out.println("Object Destroyed");
    }

    public void display(){
        System.out.println("Brand: "+this.getBrand()+" Model: "+this.getModel()+" Price: "+this.getPrice()+" Stock: "+this.getStock());
    }
    public static void main(String[] args){

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Hewlett packard", "EliteBook", 1300, 100);
        Laptop l3 = new Laptop(l2);

        l3.finalize();
        System.gc();

        l1.display();
        l2.display();
        l3.display();
    }
}
