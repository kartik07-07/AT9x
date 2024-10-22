public class lab220ct_Reverse {
    public static void main(String[] args) {


        int  n=12345 ,reverse=0;//

        for(;n!=0;n=n/10){

            int re= n%10;//
            reverse= reverse * 10+re;//
            System.out.println("Reverse the number:" +reverse);
        }

    }
}
