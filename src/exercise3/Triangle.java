package exercise3;

import java.util.Scanner;

 public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      double a= input.nextDouble();
      double b= input.nextDouble();
      double c = input.nextDouble();
      String typ = "";
      do{
        if (a>0 && b>0 && c>0 && a<(c+b) && b<(a+c) && c< (b+a)){
          double s = (a + b + c)/2;
          double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("Area: "+area);
        if(a!=b && b!=c && c!=a){
         typ = "scalene";
          System.out.println("Triangle: " + typ);

        }else if (a==b && b==c){
          typ="equilateral";
          System.out.println("Triangle: " + typ);
        }else if (a==b|| b==c || c==a ){
          typ= "isosceles";
          System.out.println("Triangle: " + typ);
        
        }
        
      }else{ 
        System.out.println("Values are not correct!");
      }
       a= input.nextDouble();
      b= input.nextDouble();
      c = input.nextDouble();
      } while (a>0 && b>0 && c>0);
    }
 }