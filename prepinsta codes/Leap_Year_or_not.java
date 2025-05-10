public class Leap_Year_or_not {
    public static void main(String[] args) {
        int num1 = 2022;
        String year = number(num1);
        System.out.println(year);
    }

    public static String number(int n){
        if (n % 4 == 0){
            return "leap year";
        }
        else{
            return "not leap year";
        }
    }
}
