import java.util.Scanner;

public class TaskSeven {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char a = 'N';
        String item_name;
        double total=0,price,discountPer=10,discountAm=0,BeforeTax,salestax = 5,invoiceTotal;

        do{ 
            
            total = 0;
            discountAm = 0;
            BeforeTax = 0;
            invoiceTotal = 0;
            System.out.println("Enter item name then price (Without Space): ");

            for (int i = 0; i < 5; i++) {
                item_name = input.next();
                price = input.nextDouble();
                input.nextLine();
                total+=price;
            }
            // while(a=='N'){
            //     item_name = input.next();
            //     if (item_name.equals("Y")){
            //         a='Y';
            //         break;
            //     }
            //     price = input.nextDouble();
            //     total+=price;
            // }

            System.out.println("Subtotal: "+total);
            System.out.println("Discount percentage: "+discountPer);
            
            discountAm = total*(discountPer/100);
            System.out.println("Discount Amount: "+discountAm);
            
            BeforeTax = total - discountAm;
            System.out.println("Total before Tax: "+BeforeTax);

            System.out.println("sales tax: "+salestax);

            invoiceTotal = BeforeTax+(BeforeTax*(salestax/100));
            System.out.println("Invoice total: "+invoiceTotal);

            System.out.println("Terminate: (y/n)? ");
            a = input.next().charAt(0);
        }while (a=='N');
    }
}
