import java.util.*;

public class PhoneNumberCombination {
    private static final String[] MAPPING = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        backtrack(result, digits, 0, new StringBuilder());
        return result;
    }
    private void backtrack(List<String> result, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = MAPPING[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
    public static void main(String[] args) {
        PhoneNumberCombination solution = new PhoneNumberCombination();
        String digits = "23";
        List<String> result = solution.letterCombinations(digits);

        System.out.println(result);
    }
}
