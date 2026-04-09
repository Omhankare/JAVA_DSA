
public class Night {

    public static int findPow(int base, int component) {
        int result = 1;
        for (int i = 0; i < component; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {

        int number = 153;
        int temp = number;

        int count = 0;

        // count digits
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        temp = number;
        int sum = 0;

        // calculate Armstrong
        while (temp > 0) {
            int digit = temp % 10;
            sum += findPow(digit, count);
            temp /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }
    }
}
