package Today;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(3,4, 5, 5, 6, 7, 8, 9, 4, 5);

        System.out.println("Original List: " + originalList);

        List<Integer> modifiedList = eraseRepeats(originalList);

        System.out.println("Modified list: " + modifiedList);
    }
    private static List<Integer> eraseRepeats(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        List<Integer> resultList = new ArrayList<>(set);
        return resultList;
    }
}
