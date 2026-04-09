
import java.util.Scanner;

//3-feb-2026
/*
1.	Write a program to print Hello World.
2.	Write a program to take your name as input and print it.
3.	Write a program to add two numbers.
4.	Write a program to find area of circle.     pie * r * square
5.	Write a program to swap two numbers using third variable.
6.	Write a program to swap two numbers without third variable.

 */
public class Print {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = sc.nextLine();
        System.out.println(name);

        int a = 5;
        int b = 10;
        System.out.println(a + b);

        sc.close();

        double pie = 3.14;
        int r = 5;
        System.out.println(pie * (r * r));

        //swap with 3rd
        int x = 2;
        int y = 4;
        int z = x;      //z=2
        x = y;          //x=4
        y = z;

        System.out.println(x + " " + y);

        //swap without 3rd
        int q = 2;
        int w = 3;
        q = q + w;        //q=5
        w = q - w;        //w=2
        q = q - w;        //q=3

        System.out.println(q + " " + w);

    }
}
