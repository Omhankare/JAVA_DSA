
import java.util.Arrays;

public class Late {

    public static int findFrequency(int[] number, int target) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // arrays- highest number of array, 
        int[] arr = {6, 8, 4, 2, 6, 4};
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (highest < arr[i]) {
                highest = arr[i];
            }
        }
        System.out.println(highest);
        System.out.println("--------------");

        // reverse an array,
        int[] arra = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int left = 0;
        int right = arra.length - 1;

        while (left < right) {
            int temp = arra[left];
            arra[left] = arra[right];
            arra[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arra));
        System.out.println("--------------");

        // remove duplicates, 
        int[] dupli = {1, 15, 5, 8, 9, 9, 4, 2, 3, 8, 7};
        int n = dupli.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dupli[i] == dupli[j]) {
                    dupli[j] = -1;
                }
            }
        }
        for (int num : dupli) {
            if (num != -1) {
                System.out.print(num + " ");
            }
        }
        System.out.print("--------------");
        //Fibonacci 0 1 1 2 3 5 8
        int m = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i < m; i++) {
            System.out.println(a + " ");
            int newi = a + b;
            a = b;
            b = newi;

        }
        System.out.println("--------------");
        // find second largest, 
        int[] number = {2, 9, 8, 7, 1};
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (large < number[i]) {
                secondLarge = large;
                large = number[i];
            } else if (secondLarge < number[i] && number[i] != large) {
                secondLarge = number[i];
            }
        }
        System.out.println("2nd largest: " + secondLarge);
        System.out.println("--------------");

        // find frequency of element in array
        int[] ar = {5, 4, 6, 4, 5, 6};
        System.out.println(findFrequency(ar, 4));

    }

}
