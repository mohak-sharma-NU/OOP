import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lenght of integer array: ");
        int n = input.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter Elements of First Array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter Elements of Second Array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

        int temp,i;
        for (i = 0; i < n; i++) {
            temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("Elements in Array 1:");
        for (int num : arr1) {
            System.out.print(num+" ");
        }

        System.out.println("Elements in Array 2:");
        for (int num : arr2) {
            System.out.print(num+" ");
        }

        System.out.println("\nLargest Element in First Swapped Array: ");
        int max = 0,prev=0;
        for (i = 0; i < arr1.length; i++) {
            if (max<arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.print(max);


        System.out.println("\nSecond Largest Element in Second Swapped Array: ");
        max = 0;
        for (i = 0; i < arr1.length; i++) {
            if (max<arr2[i]){
                prev = max;
                max = arr2[i];
            }
        }
        System.out.print(prev);

        System.out.println("\nUnique Element(s) in First Swapped Array: ");
        for (i = 0; i< arr1.length; i++) {
            int count = 0;
            for (int j = 0; j <arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
