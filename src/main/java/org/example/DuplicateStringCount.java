package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringCount {
    public static void main(String args[]){
        System.out.println("Inside demo1");
        DuplicateStringCount dem1 = new DuplicateStringCount();
        String[] strs = new String[]{"a", "b", "a", "c", "b","a", "b", "a", "c", "cd"};
        System.out.print(dem1.wordCount(strs));
    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {

            if (!map.containsKey(s)) {  // first time we've seen this string
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }
}
