package PRACTICE;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String  a = sc.nextLine();
        boolean isPalindrome= true;
        int n = a.length();
        for(int i=0;i<n/2;i++){
            if(a.charAt(i)!=a.charAt(n-i-1)){
                isPalindrome=false;
        }


        }

        if(isPalindrome){
            System.out.println(a+ "is palindrome");
        }
        else{
            System.out.println(a+ "is not palindrome");
        }

    }


}