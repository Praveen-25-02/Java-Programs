public class CountOfChar {
    public static void main(String[] args) {
        String s1 = "aaabbbccc";
        System.out.println(compress(s1));
    }
    static String compress(String s){
        if(s.isEmpty() || s == null) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) count++;
            else {
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
    sb.append(s.charAt(s.length()-1)).append(count);
        return sb.toString();
    }
}
