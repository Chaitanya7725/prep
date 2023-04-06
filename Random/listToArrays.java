package Random;

import java.util.ArrayList;
import java.util.List;

/**
 * listToArrays
 */
public class listToArrays {

    public int[] convert() {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        int[] intArray = new int[intList.size()];
        for (int i = 0; i < intArray.length; i++)
            intArray[i] = intList.get(i);
        return intArray;
    }

    public static void main(String[] args) {
        listToArrays l = new listToArrays();
        l.convert();
    }

}