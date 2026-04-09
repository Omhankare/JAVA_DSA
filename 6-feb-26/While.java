// ✅ Day 4: while loop
// 1.	Count number of digits in a number.
// 2.	Find sum of digits of a number.
// 3.	Find product of digits of a number.
// 4.	Reverse a number.
// 5.	Print first N natural numbers using while loop.
// 6.	Print Fibonacci series up to N terms

public class While {

    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
        System.out.println("--------------");
        int digi = 0;
        int sum = 0;
        int num = 12345;
        while (num > 0) {
            digi = num % 10;
            sum = sum + digi;
            num = num / 10;
        }
        System.out.println(sum);
        System.out.println("--------------");
        int mul = 1;
        int digit = 1;
        int nums = 1223;
        while (nums > 0) {
            digit = nums % 10;
            mul = mul * digit;
            nums = nums / 10;
        }
        System.out.println(mul);
        System.out.println("--------------");
        int numbs = 123;
        int dig = 0;
        int rev = 0;
        while (numbs > 0) {
            dig = numbs % 10;
            rev = rev * 10 + dig;
            numbs = numbs / 10;
        }
        System.out.println(rev);

        System.out.println("--------------");
        int n = 10;
        int l = 1;
        while (l <= n) {
            System.out.println(l);
            l++;

        }
        System.out.println("--------------");
        //0, 1, 1, 2, 3, 5, 8, 13
        int nu = 10;
        int a = 0;
        int b = 1;
        int coun = 1;
        while (coun <= nu) {
            System.out.print(a);
            int next = a + b;
            a = b;
            b = next;
            coun++;
        }

    }

}
