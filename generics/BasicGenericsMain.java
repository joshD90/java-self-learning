package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicGenericsMain {
    public static void main(String[] args) {
        Pair<Integer, String> myPair = new Pair<>(1, "Some String");
        System.out.println(myPair.getKey());
        System.out.println(myPair.getValue());

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Double> list2 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<Number> mergedList = ListManipulator.mergeList(list1, list2);

        list1.sort((Integer int1, Integer int2) -> int2 - int1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
