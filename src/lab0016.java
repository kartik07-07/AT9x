public class lab0016 {
    public static void main(String[] args) {
        Scanner lab0016 = new Scanner(System.in);
        System.out.println("Enter_num1");
        int num1= lab0016.nextInt();
        System.out.println("Enter_num2");
        int num2= lab0016.nextInt();
        int maximum_num= (num1>num2 ? num1 : num2);
        System.out.println("The Maximum num is->"+ maximum_num);
    }
}
