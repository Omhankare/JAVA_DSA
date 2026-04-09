/* 
✅ WEEK 2 (Number Logic Most Asked)
✅ Day 8
1.	Reverse a number.
2.	Check palindrome number.
3.	Count digits.
4.	Sum of digits.
5.	Check Armstrong number.
6.	Print Armstrong numbers between 1 to 500.

 */
public class Logic {

    public static void main(String[] args) {

        int number = 4682;
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        System.out.println(rev);

        System.out.println("-----------");
        int numb = 2002;
        int temp = numb;
        int check = 0;
        while (temp > 0) {
            int digit = temp % 10;
            check = check * 10 + digit;
            temp /= 10;
        }
        if (numb == check) {
            System.out.println(numb + " Number is Palindrome");
        } else {
            System.out.println(numb + " Number is not Palindrome");
        }
        System.out.println("-----------");
        int num = 23981;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        num = 23981;
        System.out.println(num + " number of digit " + count);

        System.out.println("-----------");
        int a = 1234567890;
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a /= 10;
        }
        a = 1234567890;
        System.out.println(a + " sum of digit " + sum);
        System.out.println("----ArmStrong-------");
        int arm = 153;
        int compare = arm;

        int counter = 0;
        while (compare > 0) {
            compare /= 10;
            counter++;
        }
        compare = arm;
        double sume = 0;
        while (compare > 0) {
            int digit = compare % 10;
            sume = sume + Math.pow(digit, counter);
            compare /= 10;
        }
        if (sume == arm) {
            System.out.println(arm + " is ArmStrong Number");
        } else {
            System.out.println(arm + " is not ArmStrong Number");
        }

        System.out.println("Print Armstrong numbers between 1 to 500");
        for (int i = 1; i <= 500; i++) {
            int counte = 0;
            int nu = i;
            while (nu > 0) {
                nu /= 10;
                counte++;
            }
            nu = i;
            double checks = 0;
            while (nu > 0) {
                int digit = nu % 10;
                checks = checks + Math.pow(digit, counte);
                nu /= 10;
            }
            if (i == checks) {
                System.out.println(i);
            }
        }
    }
}
