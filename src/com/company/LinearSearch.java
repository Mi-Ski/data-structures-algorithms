package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {3,5,1,5,7,8,12,6,1,2,9};

        int index = linearSearch(array, 12);
        System.out.println(index);
    }

    public static int linearSearch(int[] arr, int val){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
