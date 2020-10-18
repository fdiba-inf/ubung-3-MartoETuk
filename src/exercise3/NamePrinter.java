package exercise3;

import java.util.Scanner;

public class NamePrinter {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter text: ");
    int b = 0;

    for(String text = input.nextLine(); b < text.length(); b++) {
      char a = text.charAt(b);
      System.out.println("* " + a + " *");
    }
  }
}