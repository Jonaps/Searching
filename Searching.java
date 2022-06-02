package com.mycompany.searching;

import java.util.Scanner;


public class Searching {
    public static boolean binarySearch(int[] arr, int key, int low, int high) {
        if(low > high) {
            return false;
        }
        else {
            int mid = (low + high) /2;
            if(key == arr[mid]) {
                return true;
            }
            else if(key < arr[mid]) {
                return binarySearch(arr,key,low,mid-1);
            }
            else {
                return binarySearch(arr,key,mid+1,high);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,11};
        int key = 99;
        System.out.println(binarySearch(arr,key,0,6));
        
        
        
        
    }
}
