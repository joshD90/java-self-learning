package generics;

import java.util.ArrayList;

public class BasicGenerics {
    public <T> T findArray(ArrayList<T> myArray, T searchItem) {
        int foundIndex = myArray.indexOf(searchItem);
        if (foundIndex == -1)
            return null;
        return myArray.get(foundIndex);
    }

}
