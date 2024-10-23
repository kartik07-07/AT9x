import java.util.Scanner;

public class oct23_function{
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number1");
        int a= sc.nextInt();
        System.out.println("Enter the number2");
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d%n", a,b,sum(a,b));
        System.out.printf("%d - %d = %d%n", a,b,sub(a,b));
        System.out.printf("%d * %d = %d%n", a,b,mul(a,b));
        System.out.printf("%d / %d = %d%n", a,b,div(a,b));

        sc.close();

    }
    static int sum(int a,int b){
        return (a+b);
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
}
