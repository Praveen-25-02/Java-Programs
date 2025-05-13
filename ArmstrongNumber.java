public class ArmstrongNumber {
    public static boolean armnum(int n){
    int original = n;
    int result = 0;
    int power = String.valueOf(n).length();
    while(n>0){
        int base = n%10;
        result += (int) Math.pow(base,power);
        n /= 10;
    }
    return original == result;
    }

    public static void main(String[] args) {
        int n = 153;
        int n2 = 135;
        System.out.println(armnum(n));
        System.out.println(armnum(n2));
    }
}
