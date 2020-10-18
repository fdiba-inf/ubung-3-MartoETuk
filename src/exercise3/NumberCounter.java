package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        double sum = 0;
        int num = input.nextInt();

        while (num != 0) {

            if (num > 0) {
                positive++;
            } else {
                negative++;
            }

            sum+=num;
            num = input.nextInt();
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Sum: " + sum);
        double avr = 1.0*sum/(positive+negative);
        System.out.println("Average: " + avr);
    } 
}