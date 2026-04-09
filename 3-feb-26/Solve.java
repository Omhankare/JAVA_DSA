
import java.util.Scanner;

// 1.	Write a program to print Hello World.
// 2.	Write a program to take your name as input and print it.
// 3.	Write a program to add two numbers.
// 4.	Write a program to find area of circle.     pie * r * square
// 5.	Write a program to swap two numbers using third variable.
// 6.	Write a program to swap two numbers without third variable.
public class Solve {

    public static void main(String[] args) {
        System.out.println("Hello Om");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();

        int q = 5;
        int w = 10;
        System.out.println(q + w);

        double pie = 3.14;
        int r = 5;
        System.out.println(pie * (r * r));

        //swap with 3rd
        int k = 10;
        int p = 20;
        int tem = k;     //tem=10
        k = p;           //k=20
        p = tem;           //p=10
        System.out.println("k:" + k + " " + "p:" + p);

        //swap without 3rd
        int m = 5;
        int n = 6;

        m = m + n;      //m=11
        n = m - n;      //n=5
        m = m - n;

        System.out.println("m:" + m + " " + "n:" + n);

    }
}
