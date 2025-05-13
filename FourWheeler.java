import java.util.Scanner;

public class FourWheeler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total vehciles: ");
        int tv = sc.nextInt();
        System.out.print("Enter Total WHeels: ");
        int tw = sc.nextInt();
        FindCount(tv,tw);
    }
    public static void FindCount(int tv,int tw){
        int FW = (tw - 2*tv)/2;
        int TW = (tv - FW);
        System.out.println("Number of FOUR wheeler is " + FW);
        System.out.println("Number of Two wheeler is " + TW);
    }
}
