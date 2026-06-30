import java.util.Arrays;
public class setmismatch {
    public static int[] FindDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // arr[index] → duplicate, index+1 → missing
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 4, 5};
        int[] ans = FindDuplicate(arr);
        System.out.println(Arrays.toString(ans)); // ✅ Proper output
    }
}
