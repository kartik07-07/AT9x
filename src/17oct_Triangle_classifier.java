import java.util.Scanner;
public class Question2{ //17th oct task
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 value:");
        double side1 = sc.nextDouble();
        System.out.println("Enter side 2 value:");
        double side2 = sc.nextDouble();
        System.out.println("Enter side 3 value:");
        double side3 = sc.nextDouble();
        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("Invalid Input: Side length must be positive.");
        }
        else if (side1==side2 && side2==side3 && side1==side3) {
            System.out.println("Triangle is Equilateral");
        } else if (side1==side2 || side1 == side3 ||side2 == side3) {
            System.out.println("Triangle is Isosceles");
        }
        else{
            System.out.println("Triangle is Scalene");
        }


    }
    }
