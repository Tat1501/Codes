public class N_Natural_Numbers {

    public static void main(String[] args) {
        int n = 15;
        int v = number(n);
        System.out.println(v);
    }

    public static int number(int n){

        int sum = 0;
        for(int i = 0; i <= n; i++){

            String ansEven = even(i);
            if(ansEven == "yes"){
                sum = sum + i;
            }

        }
        return sum;
    }

    public static String even(int n){

        if(n % 2 == 0){
            return "yes";
        }
        else{
            return "no";
        }


    }
}
