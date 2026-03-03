
/*

    THIS EPISODE IS ALL ABOUT ARRAYS
    - 1D array
    - 2D ARRAYS
    - ArrayList
    - Iterator methods
    - Collections


*/

import java.util.ArrayList;
import java.util.Arrays;



public class Demo{

    // public void printArrayList(ArrayList<Object>){

    // }
    
    public static void main(String[] args){

        int[] arr1 = {};
        int[] arr2 = new int[5];
    
        ArrayList<String> list = new ArrayList<String>();    
        
        list.add("Mang");
        list.add("Orange");
        list.add("Grapes");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,50));//converting arrays as array list

        list2.add(2000);
        list2.add(1,20000);
        list2.get(3);
        



    }
}