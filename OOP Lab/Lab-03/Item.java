
import java.util.Scanner;

public class Item {

    private double price;
    private double stock;

    public String ItemName;
    public int ItemID;

    public Item(String itemName,int itemID){
        this.ItemName = itemName;
        this.ItemName = itemName;
    }

    public Item(String itemName,int itemID,double p,double s){
        this.ItemName = itemName;
        this.ItemName = itemName;
        this.price = p;
        this.stock = s;
    }

    public void setPrice(double p){
        this.price = p;
    }
    public void setStock(double s){
        this.stock = s;
    }

    public double getPrice(){
        return this.price;
    }
    public double getStock(){
        return this.stock;
    }

    public void beginShopping(){
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Item i1 = new Item("Chips",1296);
        Item i2 = new Item("Juice",1909);

        i1.setPrice(1.99);
        i1.setStock(10);

        i2.setPrice(2.99);
        i2.setStock(15);

        int choice,quant=0;
        double total=0;

        while (true){

            System.out.println("\n1.Chips\n2.Juice\n3.Exit\nEnter the item you want to buy: ");
            choice = input.nextInt();

            if(choice==1){
                System.out.println("Item: "+i1.ItemName+"\nPrice: (per unit)"+i1.price);
                System.out.println("Enter the quantity: ");
                quant = input.nextInt();
                if (quant>0&&quant<i1.getStock()) {
                    i1.setStock(i1.getStock()-quant);
                    total+=i1.getPrice()*quant;
                }else{
                    System.out.println("Invalid quantity");
                }
            }else if (choice==2){
                System.out.println("Item: "+i2.ItemName+"\nPrice: (per unit)"+i2.price);
                System.out.println("Enter the quantity: ");
                quant = input.nextInt();
                if (quant>0&&quant<i2.getStock()) {
                    i2.setStock(i2.getStock()-quant);
                    total+=i2.getPrice()*quant;
                }else{
                    System.out.println("Invalid quantity");
                }
            }else if(choice==3){
                System.out.println("\nExiting and calculating total\n");
                break;
            }
            else{
                System.out.println("\nInvalid choice\n");
            }
        }
        System.out.println("Total: "+total);
    }
}
