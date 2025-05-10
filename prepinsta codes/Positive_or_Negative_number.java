public class Positive_or_Negative_number {

    public static void main(String[] args) {
       int v = 9;
       String r= number(v);
        System.out.println(r);
    }


    public static String number(int n){

        if (n > 0){
            return "positive";
        }
        else if(n == 0){
            return "zero";
        }
        else{
            return "neageative";
        }

    }
}
