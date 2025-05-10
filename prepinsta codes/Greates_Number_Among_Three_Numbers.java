public class Greates_Number_Among_Three_Numbers {
    public static void main(String[] args) {
        int num1= 5;
        int num2 = 10;
        int num3 = 14;
        String h = number(num1, num2, num3);
        System.out.println(h);
    }

    public static String number(int n, int m, int v){
        if (n > m && n > v){
            return "n is bigger";
        }
        else if (m > v && m > n){
            return "m is bigger";
        }
        else{
            return "v is bigger";
        }
    }
}
