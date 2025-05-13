public class CountOfSubarray{
    public static void main(String[] args) {
        int[] res = new int[]{1,1,1,1};
        int k = 2;
        System.out.println(Counting(res,k));
    }
    static int Counting(int[] nums,int k){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) count++;
            }
        }
    return count;
    }
}
