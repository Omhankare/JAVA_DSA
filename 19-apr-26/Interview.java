
public class Interview {

    /*
    DP = Dyanamic programming
    Dynamic Programming is a method of solving problems by storing results 
    of smaller subproblems and reusing them to improve efficiency

    Always use .length() method for String
    always use .length property for Array

    to check values from both primitive type data members side used == operator
    to check values from both secondary/reference type data members used .equals() method 
     */
    public static void main(String[] args) {
        //find number of character from string
        String character = "selection";
        int count = 0;
        for (int i = 0; i < character.length(); i++) {
            count++;
        }
        System.out.println(count);
        System.out.println("--------------------");

        //find number of integer from array
        int[] numbers = {5, 6, 7, 8, 9, 2};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter++;
        }
        System.out.println(counter);
        System.out.println("--------------------");

        //find largest , 2nd largest , smallest , 2nd smallest integer from array
        int[] find = {5, 4, 6, 6, 7, 6, 7, 8, 1};
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < find.length; i++) {
            if (largest < find[i]) {
                secondLarge = largest;
                largest = find[i];
            } else if (secondLarge < find[i] && find[i] != largest) {
                secondLarge = find[i];
            }
            if (smallest > find[i]) {
                secondSmall = smallest;
                smallest = find[i];
            } else if (secondSmall < find[i] && find[i] != smallest) {
                secondSmall = find[i];
            }
        }
        System.out.println("largest: " + largest);
        System.out.println("secondLarge: " + secondLarge);
        System.out.println("smallest: " + smallest);
        System.out.println("secondSmall: " + secondSmall);
        System.out.println("--------------------");

        //find target character from string and print index
        String name = "terminal";
        char target = 'i';
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                System.out.println(i);
            }

        }
        System.out.println("--------------------");
        //find number of times target character occurs in string
        String times = "explorer";
        char targeted = 'e';
        int counti = 0;
        for (int i = 0; i < times.length(); i++) {
            if (targeted == times.charAt(i)) {
                counti++;
            }

        }
        System.out.println(counti);
        System.out.println("--------------------");
    }
}
