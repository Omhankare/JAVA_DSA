/*
10.54 start
11.06 end
5 hours total
Hour 1 - Java coding warm-up
Write these from scratch (no copy):
Reverse array
Find max element
Count frequency of number
Palindrome number
Sum of array
 */
import java.util.HashMap;

public class Prep {

    public static void main(String[] args) {
        int[] numbers = {9, 4, 5, 6, 17, 8};
        int reverse = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse = reverse * 10 + numbers[i];
        }
        System.out.println(reverse);

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);

        int numb = 155317;
        int count = 0;
        while (numb > 0) {
            numb = numb / 10;
            count++;
        }
        System.out.println(count);

        int n = 121;
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

        //second largest element in a array start 11.08 end 11.14 again 11.20
        int[] arr = {9, 4, 5, 6, 17, 8};
        int secondLargest = arr[1];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);

        System.out.println("----------------");
        //start at 12.21 end 12.26
        /*
        time complixity = O(n)
        space complixity = O(n)
         */
        int[] nums = {10, 20, 50, 5, 30};
        int target = 15;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Indexces:" + map.get(complement) + " " + i);
                break;
            }

            map.put(nums[i], i);
        }
        System.out.println("----------------");
        //time comeplixity = O(n^2) space complixity = O(1)
        int[] findArray = {13, 5, 2, 26, 4};
        int find = 9;
        for (int i = 0; i < findArray.length; i++) {
            for (int j = 0; j < findArray.length; j++) {
                if (findArray[i] + findArray[j] == find) {
                    System.out.println("Indexes: " + i + " " + j);
                }
            }
        }

        System.out.println("----------------");
        /* 
        time complixty= O(n)
        space complixty = O(1)
         */
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;

                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println("Profit is:" + maxProfit);

        /*
        Write Java code for: Find the contiguous subarray with the largest sum.
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Constraints:
        O(n) time
        O(1) space
        No nested loops
        Write it clean.
         */
        System.out.println("----------------");
        int[] numbs = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = numbs[0];
        int currentSum = 0;
        for (int num : numbs) {
            currentSum = currentSum + num;
            System.out.println(currentSum);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);

    }

}
