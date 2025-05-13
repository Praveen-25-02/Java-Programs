import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = Sum(n);
    System.out.println(res);
    }
    public static int Sum(int n){
        while(n>=10){
            int sum = 0;
            while(n>0){
                sum = sum + n % 10;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}
