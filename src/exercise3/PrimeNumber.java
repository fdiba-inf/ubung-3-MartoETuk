package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number, bigger than 2: ");
        int num = input.nextInt();
        int del = num-1;
        int p = num%del;

        if (num > 2){

            while (del > 2 && p != 0) {
                del--;
                p = num%del;
            }

            boolean fiki = p != 0;
            System.out.println("Prime number: " + fiki);
        } else {
            System.out.println("Invalid number");
        }
    }
}