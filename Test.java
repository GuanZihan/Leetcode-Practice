import java.util.HashMap;

public class Test {
    public String longestCommonPrefix(String[] strs) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < strs.length; i ++) {
            for(int j = 0; j < strs[i].length(); j ++) {
                if(count.get(strs[i].charAt(j)) != null) {
                    count.put(strs[i].charAt(j), count.get(strs[i].charAt(j)) + 1);
                } else {
                    count.put(strs[i].charAt(j), 1);
                }
            }
        }
        String output = "";
        for(Character c: count.keySet()) {
            if(count.get(c) == strs.length) {
                output += c;
            } else {
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] sts = new String[]{"flower","flow","flight"};
        String p = new Test().longestCommonPrefix(sts);
        System.out.println(p);
    }
}