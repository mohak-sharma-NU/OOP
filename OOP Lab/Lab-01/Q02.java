import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        char a ;

        System.out.println("Enter number of Rows: ");
        int n = input.nextInt();

        int i,j,k;

        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for ( k = 0; k < 2*i-1; k++) {
                a = (char) ('A'+k);
                System.out.print(a);
            }
            System.out.println();
        }
        for ( i = n-2; i >= 1; i--) {
            for ( j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for ( k = 0; k < 2*i-1; k++) {
                a = (char) ('A'+k);
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
