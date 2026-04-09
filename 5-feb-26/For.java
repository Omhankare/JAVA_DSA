// ✅ Day 3: for loop
// 1.	Print numbers 1 to N.
// 2.	Print numbers N to 1.
// 3.	Print all even numbers between 1 to N.
// 4.	Find sum of numbers 1 to N.
// 5.	Find factorial of a number.
// 6.	Print multiplication table of a number.

public class For {

    public static void main(String[] args) {
        int n = 21;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        for (int i = n; i > 0; i--) {
            System.out.println(i + "new");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("All even Numbers: " + i);
            }
        }

        int m = 5;
        int sum = 0;

        for (int i = 0; i <= m; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //5*4*3*2*1
        int fact = 1;
        for (int i = 1; i <= m; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);

        int cal = 1;
        for (int i = 1; i <= 10; i++) {
            cal = m * i;
            System.out.println("5 * " + i + " = " + cal);

        }

    }
}
