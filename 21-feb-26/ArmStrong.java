
public class ArmStrong {

    public static int power(int base, int component) {
        int pow = 1;
        for (int i = 0; i < component; i++) {
            pow = pow * base;
        }
        return pow;
    }

    public static void main(String[] args) {
        int number = 153;

        int temp = number;
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int tem = number;
        int sum = 0;
        while (tem > 0) {
            int digit = tem % 10;
            sum = sum + power(digit, count);
            tem = tem / 10;
        }

        if (number == sum) {
            System.out.println(number + " Number is ArmStrong");
        } else {
            System.out.println(number + " Number is Not ArmStrong");
        }
    }

}
