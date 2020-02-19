package dev.ananda.dsa;

public class Utility {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean greaterthan(int [] arr, int i, int j) {
        return arr[i] > arr[j];
    }

    public static boolean lessthan(int[] arr, int i, int j) {
        return arr[i] < arr[j];
    }

}
