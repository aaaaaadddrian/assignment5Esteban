import java.util.HashMap;
import java.util.HashSet;

public class PatternThing {
    // I couldnt figure out how to make it any delimeter, I am close but at least a space works;

    public static void main(String[] args) {
        String p = "abba";
        char d = ' ';
        String s = "cat dog dog cat";
        System.out.println(patternFinder(p, d, s));
    }

    public static boolean patternFinder(String p, char d, String s){

        String[] words = s.split(String.valueOf(d));
        if(p.length() != words.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < p.length(); i++){
            char c = p.charAt(i);
            String w = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(w)){
                    return false;
                }else if(seen.contains(w)){
                    return false;
                }
                map.put(c, w);
                seen.add(w);
            }
        }

        return true;


    }


}
