public class Prime_Number {
    public static void main(String[] args) {
        int num = 2;
        

    }

    public static String number(int n){
        if(n % 1 == 0 && n % n == 0){
            return "prime number";
        }
        else{
            return "not prime";
        }
    }
}
