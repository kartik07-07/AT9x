import java.util.Scanner;

// Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
//Input  - 12
//Out - Dec.


public class lab007switch_state {
    public static void main(String[] args) {

      //switch condition
      //user - Enter int number from 1 to 7
      // which day it is
      //1--> mon,4 -->thrusday , 7--> sun. 8.9.10
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Month");
      int Mon = sc.nextInt();
      switch (Mon) {

          case 1:
              System.out.println("January");
              break;
          case 2:
              System.out.println("Febuary");
              break;
          case 3:
              System.out.println("March");
              break;

          case 4:
              System.out.println("April");
              break;

          case 5:
              System.out.println("May");
              break;

          case 6:
              System.out.println("June");
              break;
          case 7:
              System.out.println("July");
              break;
          case 8:
              System.out.println("August");
              break;
          case 9:
              System.out.println("September");
              break;
          case 10:
              System.out.println("Octomber");
              break;
          case 11:
              System.out.println("November");
              break;

          case 12:
              System.out.println("December");
              break;

          default:
              System.out.println("No idea what day it is");
              break;
      }
  System.out.println("End of the loop");
      sc.close();
    }
}
