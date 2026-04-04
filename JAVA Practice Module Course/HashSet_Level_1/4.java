/*4.
Given two strings, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.*/

import java.util.*;  
class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        String s = sc.next();  
        String t = sc.next();  
        Map<Character, Character> map = new HashMap<>();  
        Set<Character> set = new HashSet<>();  
        boolean isomorphic = true;  
        for (int i = 0; i < s.length(); i++) {  
            char cs = s.charAt(i), ct = t.charAt(i);  
            if (map.containsKey(cs)) {  
                if (map.get(cs) != ct) {  
                    isomorphic = false;  
                    break;  
                }  
            } else {  
                if (set.contains(ct)) {  
                    isomorphic = false;  
                    break;  
                }  
                map.put(cs, ct);  
                set.add(ct);  
            }  
        }  
        System.out.println(isomorphic);  
    }  
}
