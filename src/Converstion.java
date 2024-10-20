

import java.util.Scanner;

public class Converstion{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("unit convert Program ");
            System.out.println("Please choice convert option");
            System.out.println("1.Km to m");
            System.out.println("2.Fahrenheit to Celsius");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Enter the Value : ");
                    double km = sc.nextDouble();
                    double miles = km * 1000;
                    System.out.println("this is the value of km to m " + miles);
                    break;

                case 2:
                    System.out.println("Enter the value : ");
                    double fahrenheit = sc.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("This is the value of fahrenheit to celsius " + celsius);
                    break;

                default:
                    System.out.println("Enter the valid option , please select 1 or 2 ");
                    break;

            }
            sc.close();
        
        }
    }
