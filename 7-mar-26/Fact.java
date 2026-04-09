
public class Fact {

    public static void main(String[] args) {
        int n = 125;
        int result = 0;
        int i = 5;
        while (i <= n) {
            result = result + n / i;
            i = i * 5;
        }
        System.out.println(result);
    }
}
