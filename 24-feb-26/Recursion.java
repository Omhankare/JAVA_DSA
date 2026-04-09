/*
✅ Day 9
1.	Find factorial using recursion.
2.	Find fibonacci using recursion.
3.	Check if number is strong number.
4.	Check if number is perfect number.
5.	Find sum of first N odd numbers.
6.	Find sum of first N even numbers.

 */

public class Recursion {

    public static int fact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * fact(number - 1);
    }

    public static int fibo(int n) {

        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // recursive case
        return fibo(n - 1) + fibo(n - 2);

    }

    public static void main(String[] args) {
        String name = "lol";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        if (name.equals(reverse)) {
            System.out.println("Original and reverse String match");
        } else {
            System.out.println("Original and reverse String not match");
        }
        System.out.println("-------------");
        System.out.println(fact(5));

        System.out.println("-------------");
        int n = 10;
        System.out.print(fibo(n));

        System.out.println("-------------");
        int numbe = 371;
        int sum = 0;
        while (numbe > 0) {
            int digit = numbe % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            numbe = numbe / 10;
        }
        numbe = 371;
        if (numbe == sum) {
            System.out.println(numbe + " is Strong number");
        } else {
            System.out.println(numbe + " is not Strong number");
        }
        System.out.println("-------------");

        int odd = 5;
        int add = 0;
        int count = 0;
        int currentNumber = 1;
        while (count < odd) {
            if (currentNumber % 2 != 0) {
                add = add + currentNumber;
                count++;
            }
            currentNumber++;

        }
        System.out.println("sum of first " + odd + " odd numbers." + add);

        System.out.println("-------------");

        int even = 5;
        int addi = 0;
        int counter = 0;
        int currentNumbers = 1;
        while (counter < even) {
            if (currentNumbers % 2 == 0) {
                addi = addi + currentNumbers;
                counter++;
            }
            currentNumbers++;

        }
        System.out.println("sum of first " + even + " even numbers." + addi);

    }

}
