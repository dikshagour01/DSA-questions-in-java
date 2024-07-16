import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union size: " + set.size());
        System.out.println("Union elements: " + set);

        // Intersection
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                intersectionSet.add(arr2[i]);
            }
        }

        System.out.println("Intersection size: " + intersectionSet.size());
        System.out.println("Intersection elements: " + intersectionSet);
    }
}
