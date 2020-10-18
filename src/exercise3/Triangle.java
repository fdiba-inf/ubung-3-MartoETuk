package exercise3;

import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    do {
      
      if (a>0 && b>0 && c>0 && a<(b+c) && b<(a+c) && c<(b+a)) {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        String type;

        if (a == b && b == c) {
          type = "equilateral";
        } else if (a != b && b != c && c != a) {
          type = "scalene";
        } else {
          type = "isosceles";
        }

        System.out.println("Area: " + area);
        System.out.println("Triangle: " + type);
      } else {
        System.out.println("Values are not correct!");
      } 

      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();
    } while (a <= 0 || b <= 0 || c <= 0);
  }
}