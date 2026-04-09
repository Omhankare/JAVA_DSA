
public class Number {

    public static void main(String[] args) {
        //reverse of a number
        int number = 12345;
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println(rev);

        int[] numb = {21, 45, 1, 5, 80};
        int max = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > max) {
                max = numb[i];
            }
        }
        System.out.println(max);

        int a = 10;
        int b = 10;
        if (a == b) {
            System.out.println("Both are Same");
        } else {
            System.out.println("Both are different");
        }
    }

}
