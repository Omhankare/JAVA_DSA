
public class interview {

    public static void main(String[] args) {
        //print factorial of a number
        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        //AEIOU vowels count number of vowels
        String vowels = "Initialize";
        String cap = vowels.toUpperCase();
        int count = 0;
        for (int i = 0; i < cap.length(); i++) {
            if (cap.charAt(i) == 'A' || cap.charAt(i) == 'E' || cap.charAt(i) == 'I' || cap.charAt(i) == 'O' || cap.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println(count);

        String greet = "hello";
        String rev = "";
        for (int i = greet.length() - 1; i >= 0; i--) {
            rev = rev + greet.charAt(i);
        }
        System.out.println(rev);
    }

}
