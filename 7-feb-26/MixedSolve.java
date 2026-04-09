// ✅ Day 5: Mixed loop practice
// 1.	Check whether a number is prime.
// 2.	Print all primes between 1 to 100.
// 3.	Find HCF/GCD of two numbers.        higest common factor/gretest common divisor
// 4.	Find LCM of two numbers.            least common multipler
// 5.	Find power a^b without using Math.pow().
// 6.	Check if a number is perfect number.

public class MixedSolve {

    public static int findPower(int base, int component) {
        int result = 1;
        for (int i = 0; i < component; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("1-----------------");
        int number = 89;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " Is Prime");
        } else {
            System.out.println(number + " Is not Prime");
        }
        System.out.println("2-----------------");
        boolean isPri = true;
        for (int i = 2; i <= 100; i++) {
            isPri = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPri = false;
                    break;
                }
            }
            if (isPri) {
                System.out.println(i + " is Prime");
            }
        }

        System.out.println("3-----------------");
        int q = 20;
        int w = 28;
        int min = 0;
        min = (q > w) ? w : q;
        for (int i = min; i > 0; i--) {
            if (q % i == 0 && w % i == 0) {
                System.out.println(i + " Is higest common factor/gretest common divisor ");
                break;
            }
        }
        System.out.println("4-----------------");
        int e = 12;
        int r = 15;
        int max = 0;
        if (e > r) {
            max = e;
        } else {
            max = r;
        }
        while (true) {
            if (max % e == 0 && max % r == 0) {
                System.out.println(max + " is LCM");
                break;
            }
            max++;
        }
        System.out.println("5-----------------");
        int power = findPower(2, 3);
        System.out.println("base 2 an power 3 " + power);
        System.out.println("6-----------------");
        System.out.println(Math.pow(2, 3));
    }
}
