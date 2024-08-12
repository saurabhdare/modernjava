public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {34, 7, 0, 22, 11, 3};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (var i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
