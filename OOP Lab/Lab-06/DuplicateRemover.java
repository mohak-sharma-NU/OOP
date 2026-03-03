import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemover {
    

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(list.get(0)));

        boolean found;
        for (int i = 0; i < list.size(); i++) {

            found = false;

            for (int j = 0; j < result.size(); j++) {
                if((list.get(i).equals(list.get(j)))){
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(list.get(i));                
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,4,2,5));

        System.out.println(list);

        list = removeDuplicates(list);

        System.out.println(list);

    }
}
