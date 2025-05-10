public class Number_is_Even_or_Odd {

    public static void main(String[] args) {
        int e = 10;
        String k = integer(e);
        System.out.println(k);
    }


    public static String integer(int n) {

        if (n % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
