// Date: 09/27/2021
// Weakly coding challenge:
// 1)Java: Write a Java Program to swap two numbers without using the third variable.
import java.util.Scanner;

public class SwappingNumbers {

    public static void swap(int num1, int num2) {
        System.out.println("Before swapping: \nNum1: " + num1+"\nNum2: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: \nNum1: " + num1+"\nNum2: " + num2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close(); //close resource
        swap(num1, num2);
    }
}
