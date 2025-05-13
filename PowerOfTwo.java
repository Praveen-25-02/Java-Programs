import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isPowerOfTwo(n)) System.out.println("Power Of 2");
    else System.out.println("Not a Power Of 2");
    }
    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        while(n%2 == 0){
            n = n/2;
        }
        return n==1;
    }
}
