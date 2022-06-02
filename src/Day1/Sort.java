package Day1;
// given an array [a, b, c, d, e, f] sort it in the order like [a < b > c < d > e < f ]

import java.util.Arrays;

//logic
//at every iteration check if left < right, when i value is odd else check if left > right, when i value is even
public class Sort {

    public static void main(String[] args) {
        int[] ar = {3, 6, 1, 2, 9, 5, 4, 8};
        System.out.println(Arrays.toString(sort(ar)));
    }

    static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(i % 2 == 0) {
                if(arr[i] > arr[i+1])
                    swap(arr, i, i+1);
            }
            else {
                if(arr[i] < arr[i+1])
                    swap(arr, i, i+1);
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
