public class MulExceptCurr {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 3, 4};
        Mul(nums);
    }
    static void Mul(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) { //left products
            res[i] = res[i-1] * nums[i-1];
        }
        int temp = 1;
        for (int i = n-1; i >= 0; i--) {
            res[i] = temp * res[i];
            temp = temp * nums[i];
        }
        for (int i = 0; i < n; i++) System.out.println(res[i] + " ");
    }
}
