// ✅ Day 5: Mixed loop practice
// 1.	Check whether a number is prime.
// 2.	Print all primes between 1 to 100.
// 3.	Find HCF/GCD of two numbers.        higest common factor/gretest common divisor
// 4.	Find LCM of two numbers.
// 5.	Find power a^b without using Math.pow().
// 6.	Check if a number is perfect number.

public class Mixed {

    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        //small number can divide big , but big dont completely
        int n = 29;
        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("number is Prime: " + isPrime);
        System.out.println("-------------");
        for (int i = 2; i <= 100; i++) {
            boolean isPri = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPri = false;
                    break;
                }
            }
            if (isPri) {
                System.out.println(i + " Is Prime");
            }
        }
        System.out.println("-------------");
        int l = 20;
        int o = 28;
        int min = 0;
        if (l > o) {
            min = o;
        } else {
            min = l;
        }
        for (int i = min; i >= 1; i--) {
            if (l % i == 0 && o % i == 0) {
                System.out.println(" 100 and 50 GCD or HCF is: " + i);
                break;
            }
        }
        System.out.println("-------------");

        //LCM should not less than max number   least common multipler
        int p = 12;
        int q = 18;
        int max = 0;
        if (p > q) {
            max = p;
        } else {
            max = q;
        }
        while (true) {
            if (max % p == 0 && max % q == 0) {
                System.out.println(" 12 and 18 LCM is: " + max);
                break;
            }
            max++;
        }

        System.out.println("-------------");

        String name = "Om Hankare";
        String reverse = new StringBuilder(name).reverse().toString();

        System.out.println("Original: " + name);
        System.out.println("Reverse: " + reverse);
        System.out.println("-------------");

        String myName = "Computer";
        String rev = "";
        for (int i = myName.length() - 1; i >= 0; i--) {
            rev = rev + myName.charAt(i);
        }
        if (myName.equals(rev)) {
            System.out.println("String reverse Match " + myName + " " + rev);
        } else {
            System.out.println("String reverse not Match " + myName + " " + rev);
        }
        System.out.println("-------------");
        int power = calculatePower(3, 4);
        System.out.println("3^4 is: " + power);

        System.out.println("-------------");
        //A perfect number is a positive integer that is equal to the sum of its proper divisors
        int perfect = 496;
        int check = 0;
        for (int i = 1; i < perfect; i++) {
            if (perfect % i == 0) {
                check = check + i;
            }

        }
        if (check == perfect) {
            System.out.println(perfect + " Number is Perfect");
        } else {
            System.out.println(perfect + " Number is not Perfect");
        }

    }
}
