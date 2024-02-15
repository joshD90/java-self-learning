package generics;

import java.util.ArrayList;

//push up to the super class
public class ListManipulator {
    public static <T> ArrayList<T> mergeList(ArrayList<? extends T> list1, ArrayList<? extends T> list2) {
        ArrayList<T> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}
