import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NonPrimeNumbers(n);
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n % i)==0) return false;
        }
    return true;
    }
    public static void NonPrimeNumbers(int n){
        if(n<=1) {
            System.out.println(n);
        return;
        }
        for(int i=1;i<n;i++){
            if(isPrime(i)) continue;
            else System.out.println(i);;
        }
    }
}
