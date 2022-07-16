package String;

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char forS = s.charAt(i);
            map.put(forS, map.getOrDefault(forS, 0) + 1);
        }
        
        for(int i = 0; i < t.length(); i++){
            char forT = t.charAt(i);
            if(!map.containsKey(forT) || map.get(forT) <= 0){
                return false;
            }
            
            map.put(forT, map.get(forT)-1);
            
        }
        
        return true;
    }
}