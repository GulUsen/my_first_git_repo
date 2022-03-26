package my_hithub_package01;

import java.util.Scanner;

public class mu_git_class {

    public static void main(String[] args) {



    //Type a program like;
    //Ask user to enter two integer values, the first will be greater than the second.
    //The remainder when you divide the first by the second will be the width,
    //and the sum of the two numbers will be the length of a rectangle.
    //Then calculate the area and the perimeter of the rectangle, and print them
    //on the console.
    Scanner scan = new Scanner(System.in);
    //the user 72
        System.out.println("Enter two iteger number");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    int num =num1/num2;
        System.out.println("Remiander number" + " " + num);

    int sum = num1 + num2;
        System.out.println("The sum  number" + " " + sum);

    int area = num * sum;
        System.out.println("Area of the rectangle" + " " +area);

    area = (num + sum)*2;
        System.out.println("Perimeter of the rectangle" + " " +area);
}

}

