import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2,2, 3, 4, 4, 5};
        System.out.println("Array Before: "+Arrays.toString(nums));
        int newLength = removeDuplicates(nums);
        System.out.println("Array After Removing Duplicates: "+Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
