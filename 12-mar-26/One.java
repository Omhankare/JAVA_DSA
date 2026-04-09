
import java.util.ArrayList;
import java.util.Arrays;

public class One {

    public static void main(String[] args) {
        /*String name = "computer";
        String reve = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reve = reve + name.charAt(i);
        }
        System.out.println(reve); */


 /*
        You are given an integer array arr[]. The task is to find the sum of it.
        Examples:
        Input: arr[] = [1, 2, 3, 4]
        Output: 10
        Explanation: 1 + 2 + 3 + 4 = 10. 
         */
        int arr[] = {1, 2, 3, 4};
        int sum = 0;
        // System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println("--------------------");

        /*
        Given an array arr[]. The task is to find the largest element and return it.
        Examples:
        Input: arr[] = [1, 8, 7, 56, 90]
        Output: 90
        Explanation: The largest element of the given array is 90.
         */
        int arr1[] = {1, 8, 7, 56, 90};
        int largest = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (largest < arr1[i]) {
                largest = arr1[i];
            }
        }
        System.out.println(largest);
        System.out.println("--------------------");

        /*
        Given an unsorted array arr[], the task is to find the mean of the array. 
        Note: Return the floor value of the mean.
        Examples:
        Input: arr[] = [1, 3, 4, 2, 6, 5, 8, 7]
        Output: 4
        Explanation: Sum of the elements is 1 + 3 + 4 + 2 + 6 + 5 + 8 + 7 = 36, Mean = 36/8 = 4 
         */
        //int arr2[] = {1, 3, 4, 2, 6, 5, 8, 7};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 3, 4, 2, 6, 5, 8, 7));
        // System.out.println(arr2.length);
        // System.out.println(al.size() + " ArrayList");
        int sum1 = 0;
        // al.add(10);
        // System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            sum1 = sum1 + al.get(i);
        }
        int mean = 0;
        int n = al.size();
        mean = sum1 / n;
        System.out.println(mean);
        System.out.println("--------------------");

        /* 
        You are given an array of integers arr[]. You have to reverse the given array.
        Note: Modify the array in place.
        Examples:
        Input: arr = [1, 4, 3, 2, 6, 5]
        Output: [5, 6, 2, 3, 4, 1]
         */
        int[] arr3 = {1, 4, 3, 8, 2, 6, 5};
        int left = 0;
        int right = arr3.length - 1;
        while (left < right) {
            int temp = arr3[left];
            arr3[left] = arr3[right];
            arr3[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("--------------------");

        /*
        Given an array of positive integers arr[], 
        return the second largest element from the array. 
        If the second largest element doesn't exist then return -1.
        Note: The second largest element should not be equal to the largest element.
        Examples:
        Input: arr[] = [12, 35, 1, 10, 34, 1]
        Output: 34
         */
        int[] arr5 = {12, 35, 1, 10, 34, 1};
        int larg = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr5.length; i++) {
            if (larg < arr5[i]) {
                secondLarge = larg;
                larg = arr5[i];
            } else if (arr5[i] > secondLarge && larg != arr5[i]) {

                secondLarge = arr5[i];
            }
        }
        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondLarge);
        }
        System.out.println("--------------------");


        /*
        You are given a sorted array arr[] containing positive integers. 
        Your task is to remove all duplicate elements from this array such 
        that each element appears only once. Return an array containing these 
        distinct elements in the same order as they appeared.
        Examples :
        Input: arr[] = [2, 2, 2, 2, 2]
        Output: [2]
         */
        int[] arr4 = {2, 2, 2, 2, 2};
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 0; i < arr4.length; i++) {
            if (i == 0) {
                al1.add(arr4[i]);
            } else if (arr4[i] != arr4[i - 1]) {
                al1.add(arr4[i]);
            }
        }
        System.out.println(al1);
        System.out.println("--------------------");

        /*
        Given an array arr[], check whether it is sorted in non-decreasing order. 
        Return true if it is sorted otherwise false.
        Examples:
        Input: arr[] = [10, 20, 30, 40, 50]
        Output: true
         */
        int[] arr6 = {10, 20, 30, 25, 50};
        boolean isSorted = true;
        for (int i = 0; i < arr6.length - 1; i++) {
            if (arr6[i] > arr6[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
        System.out.println("--------------------");

        /*
        Given an array arr[] consisting of only 0’s and 1’s, return count of the 
        maximum number of consecutive 1’s or 0’s present in the array. 
        Examples:
        Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
        Output: 4
         */
        int[] arr7 = {0, 0, 0, 1, 0, 0, 1};
        int maxCount = 0;
        int count = 1;
        for (int i = 0; i < arr7.length - 1; i++) {
            if (arr7[i] == arr7[i + 1]) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 1;
            }

        }
        maxCount = Math.max(count, maxCount);
        System.out.println(maxCount);
        System.out.println("--------------------");

        /*
        Given an array, arr[] of integers, your task is to return the smallest and 
        second smallest element in the array. If the smallest and second smallest do not exist, return -1.
        Examples:
        Input: arr[] = [2, 4, 3, 5, 6]
        Output: [2, 3] 
         */
        int[] arr8 = {1, 1, 1};
        int minimum = Integer.MAX_VALUE;
        int secondMini = Integer.MAX_VALUE;
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < arr8.length; i++) {
            if (minimum > arr8[i]) {
                secondMini = minimum;
                minimum = arr8[i];
            } else if (arr8[i] < secondMini && arr8[i] != minimum) {
                secondMini = arr8[i];
            }
        }
        if (secondMini == Integer.MAX_VALUE) {
            al2.add(-1);
            System.out.println(al2);
        } else {
            al2.add(minimum);
            al2.add(secondMini);
            System.out.println(al2);
        }

    }

}
