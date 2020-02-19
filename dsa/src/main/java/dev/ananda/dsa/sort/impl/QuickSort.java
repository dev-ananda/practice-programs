package dev.ananda.dsa.sort.impl;

import dev.ananda.dsa.Utility;

public class QuickSort {

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int left = low + 1, right = high;

        while (left < right) {
            while (arr[left] <= pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                Utility.swap(arr, left, right);
                left++;
                right--;
            }
        }
        Utility.swap(arr, low, right);
        return right;
    }



    public void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pindex = partition(arr, low, high);
        sort(arr, low, pindex - 1);
        sort(arr, pindex + 1, high);
    }

    public static void main(String[] args) {
        int [] arr =  {143, 63, 6452, 632, 4322, 7421, 922, 65321, 42, 223, 5662, 3234,
                222, 663, 3232, 76543, 22343, 534, 67432, 2246, 7432, 2343, 2356, 8862,
                6742, 7742, 987, 9092, 3244, 21893, 64223, 323255, 754334, 756542, 8223,
                66215, 64223, 9986};

        new QuickSort().sort(arr, 0, arr.length-1);

        for(int e : arr){
            System.out.print(e+",");
        }
    }

}
