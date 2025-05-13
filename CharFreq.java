import java.util.HashMap;
import java.util.Map;

public class CharFreq {
    public static void main(String[] args) {
        String s = "T   `omato";
        Freq(s);
    }
    public static void Freq(String st){
        HashMap<Character,Integer> hm = new HashMap<>();
        String s = st.toLowerCase().replaceAll("\\s+", "");
        int count = 1;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!hm.containsKey(ch[i])){
                hm.put(ch[i],1);
            }
            else {
                hm.put(ch[i],hm.get(ch[i])+1);
            }
        }
        for(Map.Entry<Character,Integer> entries: hm.entrySet()){
          System.out.println(entries.getKey() + " → " + entries.getValue());
        }
    }
}
