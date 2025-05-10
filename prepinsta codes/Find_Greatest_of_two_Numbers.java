public class Find_Greatest_of_two_Numbers {
    public static void main(String[] args) {
        int num1= 5;
        int num2 = 10;
        String h = number(num1, num2);
        System.out.println(h);
    }


    public static String number(int n, int m){
        if (n > m){
            return "n is bigger";
        }
        else{
            return "m is bigger";
        }
    }
}
