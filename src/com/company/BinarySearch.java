package com.company;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Random rand = new Random();
        int random = rand.nextInt(1000000);

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int index = BinarySearch(arr, random);

        if(index == -1) {
            System.out.println("Index not found");
        }
        else{
            System.out.println("Item found at index: " + index);
        }
    }

    private static int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleValue = arr[middleIndex];
            System.out.println("middle index: " + middleIndex);

            if (middleValue < target) {
                low = middleIndex + 1;
            } else if (middleValue > target) {
               high = middleIndex - 1;
            } else return  middleIndex;
//            else return  middleIndex = middleValue == target
        }
        return -1;
//        target not found
    }
}
