/*
✅ Day 6: Pattern questions (must for interview)
1.	Print this pattern:
*
**
***
****
2.	
****
***
**
*
3.	
1
12
123
1234
4.	
1
22
333
4444
5.	
    *
   **
  ***
 ****
6.	
*****
****
***
**
*

 */
public class Pattern {

    public static void main(String[] args) {
        System.out.println("1------------------");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("2------------------");
        for (int i = 5; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("3------------------");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("4------------------");
        for (int i = 5; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("5------------------");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println("6------------------");
        for (int i = 5; i >= 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println("7------------------");
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");

            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("8------------------");
        for (int i = 5; i > 0; i--) {

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
