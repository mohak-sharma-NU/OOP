import java.util.ArrayList;
import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter five integers: ");

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        boolean hasPrime = false;

        for (int i = 0; i < 5; i++) {
            if (isPrime(list.get(i))) {
                hasPrime = true;
                System.out.println("Prime found: " + list.get(i));
                break;
            }
        }

        int sum = 0;

        if (hasPrime) {
            for (int i = 0; i < 5; i++) {
                if (i % 2 == 0)
                    sum += list.get(i);
            }
        } else {
            for (int i = 0; i < 5; i++) {
                if (i % 2 != 0)
                    sum += list.get(i);
            }
        }

        System.out.println("Sum: " + sum);
        in.close();
    }
}