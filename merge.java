import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70, 80};

        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] mergedArray = new int[len1 + len2];

        System.arraycopy(arr1, 0, mergedArray, 0, len1);

        System.arraycopy(arr2, 0, mergedArray, len1, len2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
