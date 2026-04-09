// ✅ Day 2: If-Else
// 1.	Check if a number is even or odd.
// 2.	Check if number is positive, negative, or zero.
// 3.	Find largest of 2 numbers.
// 4.	Find largest of 3 numbers.
// 5.	Check if a year is a leap year.
// 6.	Check if a character is vowel or consonant.

public class Check {

    public static void main(String[] args) {

        int v = 10;
        if (v % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }

        int m = 20;
        if (m < 0) {
            System.out.println("Number is Negative less than 0");
        } else if (m == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is Positive");
        }

        int p = 45;
        int q = 20;
        if (p > q) {
            System.out.println("P is Greater");
        } else {
            System.out.println("Q is Greater than P");
        }

        int l = 90;
        int k = 10;
        int j = 23;
        if (l > k && l > j) {
            System.out.println("l is greater than k and j");
        } else if (k > j && k > l) {
            System.out.println("k is greater than J and l ");
        } else {
            System.out.println("j is greater than k and l");
        }

        int year = 2026;
        if ((year % 400 == 0 || year % 100 != 0) && year % 4 == 0) {
            System.out.println(year + " is Leap Year ");
        } else {
            System.out.println(year + " is Not Leap Year ");
        }

        char vowel = 'm';
        vowel = Character.toUpperCase(vowel);
        if (vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
            System.out.println("Character is vowel");
        } else {
            System.out.println("Character is consonant ");
        }
    }
}
