import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        //Grade Calculation
        // Write a program that calculate and displays the letter grade
        // for a given numerical score(e.g A,B,C,D or F)
        //Based on the following grading scale:

        //A-->90-100
        //B --> 80-89
        //c --> 70-79
        //D --> 60-69
        // F --> 0-59

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        Float num = sc.nextFloat();

        if( num >=90 && num <=100){
            System.out.println("Grade A");
        }
          else if(num>=80 && num<=89){
            System.out.println("Grade B");
        }
         else if(num>=70 && num<=79){
            System.out.println("Grade C");
        }
         else if(num>=60 && num<=69){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade E");
        }

    }
}
