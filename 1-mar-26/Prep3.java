/*
Longest substring without repeating characters (Sliding Window)
Subarray sum equals K (Prefix + HashMap)
Merge intervals (Greedy)
Binary Search basic template
Level order traversal (Tree BFS)
Valid Parentheses (Stack) 
1️⃣ Two Pointers (Opposite Direction)
2️⃣ Two Pointers (Same Direction)
3️⃣ Sliding Window
4️⃣ HashMap / HashSet
5️⃣ Prefix Sum
6️⃣ Greedy
7️⃣ Stack
8️⃣ Binary Search
 */

import java.util.HashSet;

public class Prep3 {

    /*
    1️⃣ Two Pointers (Opposite Direction)
    🟢 Problem: Two Sum II (Sorted Array)
    Given sorted array:
    nums = [2,7,11,15]
    target = 9
    Return indices (1-based) of two numbers that sum to target.
    🧠 Why Two Pointers?
    Array is sorted
    ✅ Solution
     */
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    //2️⃣ Two Pointers (Same Direction)
    //Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /*
    1️⃣ Longest Substring Without Repeating Characters
    (VERY common Amazon problem)
    🟠 Problem
    Given a string s, return the length of the longest substring without repeating characters.
    Example:
    Input: "abcabcbb"
    Output: 3
    Explanation: "abc"
     */
    //Variable sliding window pattern
    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /* 
    Maximum Average Subarray I
    Given an integer array nums and an integer k,
    return the maximum average value of any contiguous subarray of length k.
    Example:
    Input:
    nums = [1,12,-5,-6,50,3]
    k = 4
     */
    //Fixed sliding window pattern
    public static double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide window
        for (int right = k; right < nums.length; right++) {

            windowSum += nums[right];        // add new element
            windowSum -= nums[right - k];   // remove old element

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println("--------------");
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println("--------------");
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println("--------------");
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));

    }
}
