import java.util.*;

public class distinct_element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 1, 2, 3, 2, 3, 7, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Set size: " + set.size());
        System.out.println("Set elements: " + set);
    }
}
