package exercise3;

import java.util.Scanner;

public class AngleCalculation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double angle = input.nextInt();
    char einheit = input.next().charAt(0);

    do {

      if (einheit == 'r') {
        char einh = 'd';
        double result = angle * 180 / Math.PI;
        System.out.println("Angle: " + result + einh);
      } else {
        char einh = 'r';
        double result = angle * Math.PI / 180;
        System.out.println("Angle: " + result + einh);
      }

      angle = input.nextInt();
      einheit = input.next().charAt(0);
    } while (einheit == 'r' || einheit == 'd');
  }
}
