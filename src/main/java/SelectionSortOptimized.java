import java.util.Arrays;

public class SelectionSortOptimized {

    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void sortOptimized(Integer[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int min = i;
            int max = arr.length - 1 - i;

            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[arr.length - 1 - j] > arr[max]) {
                    max = arr.length - 1 - j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            // Ставим макс число в конец, если индекс макс числа равен i, то оно будет стоят на индексе min, так как мы поменяли их местами выше
            temp = arr[arr.length - 1 - i];
            if (max == i) {
                arr[arr.length - 1 - i] = arr[min];
                arr[min] = temp;
            } else {
                arr[arr.length - 1 - i] = arr[max];
                arr[max] = temp;
            }
        }
    }

    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;

        Integer[] arr = MyArray.getArray(50_000);
//        System.out.println(Arrays.toString(arr));

        long startTime = System.currentTimeMillis();

//        sort(arr); // -- 2988 -- классический вариант -- 50_000 элементов
        sortOptimized(arr); // -- 2525 -- 50_000 элементов

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

//        System.out.println(Arrays.toString(arr));

    }
}
