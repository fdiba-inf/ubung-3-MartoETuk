package exercise3;

public class NumberSearch {

    public static void main(String[] args) {

      int counter = 0;
      for (int num = 100; num < 1000; num++) {

        if (num % 5 == 0 && num % 6 == 0) {

            counter++;
            if (counter == 10) {
              counter = 0;
              System.out.println(num);
            } else {
              System.out.print(num + " ");
            }
        }
      }
    }
}