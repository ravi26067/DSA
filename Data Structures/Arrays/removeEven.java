import java.util.*;

class CheckRemoveEven {

    public static int[] removeEven(int[] arr) {

        List<Integer> result = new ArrayList<>();

        for (int ele : arr) {
            if (ele % 2 != 0) {
                result.add(ele);
            }
        }

        // Convert ArrayList to array
        int[] newArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newArray[i] = result.get(i);
        }

        return newArray;

    }
}
