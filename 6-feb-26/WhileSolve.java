// ✅ Day 4: while loop
// 1.	Count number of digits in a number.
// 2.	Find sum of digits of a number.
// 3.	Find product of digits of a number.
// 4.	Reverse a number.
// 5.	Print first N natural numbers using while loop.
// 6.	Print Fibonacci series up to N terms

public class WhileSolve {

    public static void main(String[] args) {
        int n = 15354;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
        System.out.println("------------------");
        int nu = 1234;
        int d = 0;
        int sum = 0;
        while (nu > 0) {
            d = nu % 10;
            sum = sum + d;
            nu = nu / 10;
        }
        System.out.println(sum);
        System.out.println("------------------");
        int num = 1234;
        int di = 0;
        int pro = 1;
        while (num > 0) {
            di = num % 10;
            pro = pro * di;
            num = num / 10;
        }
        System.out.println(pro);
        System.out.println("------------------");
        int numb = 1351;
        int dig = 0;
        int rev = 0;
        while (numb > 0) {
            dig = numb % 10;
            rev = rev * 10 + dig;
            numb = numb / 10;
        }
        System.out.println(rev);
        System.out.println("------------------");
        int numbe = 10;
        int i = 1;
        while (i <= numbe) {
            System.out.println(i);
            i++;
        }

        int number = 10;
        int a = 0;
        int b = 1;
        int in = 1;
        while (in <= number) {
            System.out.print(a);
            int next = a + b;
            a = b;
            b = next;
            in++;
        }

    }
}
