package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         int positive = 0;
         int negative = 0;
         double sum = 0;
         System.out.print ("Enter a number: ");
         int num = input.nextInt();

         do {
           if (num > 0){
              positive++;
              sum+=num;
           } else{
              negative++;
              sum+=num;
           }
           System.out.print ("Enter a number: ");
           num = input.nextInt();
         } while (num != 0);

         double avr = sum / (positive+negative+1);

         System.out.println("Positive numbers: " + positive);
         System.out.println("Negative numbers: " + negative);
         System.out.println("Sum: " + sum);
         System.out.println("Average: " + avr);

    }
}