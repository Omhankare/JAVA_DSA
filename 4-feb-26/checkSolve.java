
// 2.	Check if number is positive, negative, or zero.
// 3.	Find largest of 2 numbers.
// 4.	Find largest of 3 numbers.
// 5.	Check if a year is a leap year.
// 6.	Check if a character is vowel or consonant.
public class checkSolve {

    public static void main(String[] args) {
        int q = 23;
        if (q % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        int w = 0;
        if (w < 0) {
            System.out.println("Number is negative");
        } else if (w == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is Positive");
        }

        int e = 6;
        int r = 4;
        if (e > r) {
            System.out.println("E is greater than R");
        } else {
            System.out.println("R is greater than E");
        }

        int t = 21;
        int y = 22;
        int u = 21;
        if (t > y) {
            System.out.println("T is Greater than Y and U");
        } else if (y > u) {
            System.out.println("Y is Greater than U and T");
        } else {
            System.out.println("U is Greater than Y and T");
        }

        int year = 2020;
        if ((year % 400 == 0 || year % 100 != 0) && year % 4 == 0) {
            System.out.println("Year is Leap");
        } else {
            System.out.println("Year is not leap");
        }

        char i = 'A';
        i = Character.toUpperCase(i);
        if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
            System.out.println("Character is vowel");
        } else {
            System.out.println("Character is consonant");
        }
    }

}
