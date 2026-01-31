import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        int lower=0,upper=0;

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter lower limit: ");
        lower = input.nextInt();

        System.out.println("\nEnter upper limit: ");
        upper = input.nextInt();

        int i,j,flag=0;
        for(i = lower; i < upper; i++){
            flag = 0;
            for(j = 2; j < i; j++){
                if (i%j==0){
                    // System.out.println(i+" divisible by "+j);
                    flag = 1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println(i);
            }
        }
    }
}
