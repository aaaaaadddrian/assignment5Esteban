import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {


    public static String[] radix(String[] A){
        int max = 0;
        for(String s : A){
            if(s.length() > max){
                max = s.length();
            }
        }

        for(int i = max - 1; i >= 0; i--){
            sort(A, i);
        }

        return A;
    }

    public static void sort(String[] A, int ind){
        int numLetters = 52;
        char currChar;
        char key;

        HashMap<Character, List<String>> map = new HashMap<>();

        for(int i = 0; i < numLetters; i++){
            if(i < 26){
                currChar = (char) ('a' + i);
            }else{
                currChar = (char) ('A' + i - 26);
            }
            map.put(currChar, new LinkedList<>());
        }
        
        for(String s : A){
            if(s.length() > ind){
                key = s.charAt(ind);
            }else{
                key = 'a';
            }
            map.get(key).add(s);
        }
        
        int i = 0;
        for(char c = 'A'; c <= 'Z'; c++){
            List<String> list = map.get(c);
            for(String s: list){
                A[i++] = s;
            }
        }

        for(char c = 'a'; c < 'z'; c++){
            List<String> list = map.get(c);
            for(String s : list){
                A[i++] = s;
            }
        }
    }



}
