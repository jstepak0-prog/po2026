package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public boolean doubleX(String str) {

        int i = str.indexOf("x");

        if (i == -1) return false;

        if (i+1 >= str.length()) return false;

        return str.substring(i+1, i+2).equals("x");
    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {

            if (map.get("a").equals(map.get("b"))) {

                map.remove("a");
                map.remove("b");
            }
        }

        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {

            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);

            } else {
                map.put(s, 1);

            }
        }
        return map;


    }



    public static void main(String[] args) {
        CodingBat program = new CodingBat();

        System.out.println(program.doubleX("axxbb"));

        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "ccc");

        program.mapAB2(map);

        System.out.println(map);

        String[] words = {"a", "b", "c", "a"};
        Map<String, Integer> result = program.wordCount(words);

        System.out.println(result);

    }





}
