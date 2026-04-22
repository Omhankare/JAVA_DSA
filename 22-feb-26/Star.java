
public class Star {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("--------------");

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        /*
        1.	Reverse number
        2.	Sum of digits
        3.	Prime number
        4.	Factorial
        5.	Fibonacci
        6.	One pattern of your choice
         */
        System.out.println("--------------");

        int number = 723;
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println(rev);
        System.out.println("--------------");
        int a = 235;
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println(sum);
        System.out.println("--------------");

        int num = 83;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num + " Number is Prime");
        } else {
            System.out.println(num + " Number is not Prime");
        }

        System.out.println("--------------");
        int numb = 5;
        int fact = 1;
        for (int i = 1; i <= numb; i++) {
            fact = fact * i;
        }
        System.out.println(fact + " Facotial of number " + numb);

        System.out.println("--------------");
        int how = 10;
        int m = 0;
        int l = 1;
        for (int i = 0; i < how; i++) {
            System.out.println(m);
            int next = m + l;
            m = l;
            l = next;
        }

    }

}
