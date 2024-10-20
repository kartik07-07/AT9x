import java.util.Scanner;
//Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
//
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.

public class task004_18oct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        double num1 = sc.nextDouble();

        System.out.println("Enter the number 2");
        double num2 = sc.nextDouble();

        System.out.println("What you want to do - +,-,*,/.... ");
        char c=sc.next().charAt(0);
        double result;

        switch (c){
            case '+':
                result = num1 + num2 ;
                System.out.println(" The addition of two number is " + num1 +"+"  + num2 + "=" +result);
                break;
      case '-':
               result = num1 - num2 ;
                System.out.println(" The addition of two number is " + num1 +"-"  + num2 + "=" +result);
                break;
            case '*':
                result = num1 * num2 ;
                System.out.println(" The addition of two number is " + num1 +"*"  + num2 + "=" +result);
                break;

           case 4:
               result = num1 / num2 ;
               System.out.println(" The addition of two number is " + num1 +"/"  + num2 + "=" +result);
               break;
//            case 5:
//               System.out.println();
//               break;
        }
        System.out.println("End of switch case");
        sc.close();
    }
}
