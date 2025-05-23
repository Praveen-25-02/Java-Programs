public class GCD{
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int num1 = 15, num2 = 60;
        System.out.println("GCD " + "is: " + gcd(num1, num2));
    }
}
