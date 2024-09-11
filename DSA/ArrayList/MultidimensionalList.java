import java.util.ArrayList;

public class MultidimensionalList {
    public static void main(String[] args) {
        // Create a multidimensional list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        // Create two sub-lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        // Add elements to the sub-lists
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        
        // Add the sub-lists to the main list
        mainList.add(list1);
        mainList.add(list2);
        
        // Iterate through the main list
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) { // changed <= to <
                System.out.println(currList.get(j));
            }
        }
    }
}
