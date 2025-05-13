import java.util.*;
public class CombinationSum{
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            current.add(nums[i]);
            backtrack(nums, target - nums[i], i, current, result); // not i + 1 because we can reuse the same number
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = solution.combinationSum(nums, target);
        System.out.println(result);
    }
}
