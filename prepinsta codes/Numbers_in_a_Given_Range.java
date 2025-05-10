public class Numbers_in_a_Given_Range {
    public static void main(String[] args) {
        int n = 10;
        int v = number(n);
        System.out.println(v);

    }

    public static int number(int n){
        int sum = 0;
        for(int i = 5; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
