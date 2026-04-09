// ✅ Day 3: for loop
// 1.	Print numbers 1 to N.
// 2.	Print numbers N to 1.
// 3.	Print all even numbers between 1 to N.
// 4.	Find sum of numbers 1 to N.
// 5.	Find factorial of a number.
// 6.	Print multiplication table of a number.

public class ForSolve {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("------------");
        int m = 20;
        for (int i = 1; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("------------");
        int ni = 5;
        int factorial = 1;
        for (int i = 1; i <= ni; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        System.out.println("------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("20 * " + i + " = " + m * i);
        }
    }

}
