// import java.util.HashMap;

/*
Frequency / Hashing 
Two Pointer 
Sliding Window 
Prefix Sum 
Binary Search 
Basic DP 
Greedy 
Stack 
 */
import java.util.HashMap;
import java.util.HashSet;

public class Prep2 {

    public static void main(String[] args) {
        //Find the Majority Element in an array
        int[] num = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;

        for (int i = 0; i < num.length; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);

            if (map.get(num[i]) > n / 2) {
                System.out.println(num[i]);
                break;
            }
        }

        System.out.println("------------------");
        int[] nums = {0, 0, 1, 1, 2, 3, 4};
        if (nums.length == 0) {
            System.out.println(0);
        }

        int q = 0;  // last unique index

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[q]) {
                q++;
                nums[q] = nums[j];
            }
            /*
            0 0
            1 0 y
            i = 1
            
             */
        }
        System.out.println(q + 1);

        System.out.println("------------------");
        String haystack = "leetcode";
        String needle = "code";
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                System.out.println(j + "-");
            }

            if (j == needle.length()) {
                System.out.println(i);
            }
        }

        System.out.println("------------------");
        HashSet<Integer> set = new HashSet<>();

        int[] numbers = {5, 1, 4, 8, 4};
        for (int i = 0; i < numbers.length; i++) {

            if (set.contains(numbers[i])) {
                System.out.println(numbers[i]);
            }
            set.add(numbers[i]);
        }

    }
}
