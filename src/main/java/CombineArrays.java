
import java.util.Arrays;
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        // make array of proper size
        int[] newArr = new int[arr1.length + arr2.length];

        // and first array elements
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
            newArr[j] = arr2[i];
        }
        return newArr;
    }
}
