package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void doubleX() {
        assertEquals(true, codingBat.doubleX("axxbb"));
    }

    @org.junit.Test
    public void test_map() {

        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "ccc");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("c", "ccc");


        Map<String, String> result = codingBat.mapAB2(map);

        assertEquals(map2, result);

    }

    @org.junit.Test
    public void test2_map() {

        String[] words = {"a", "b", "c", "a"};
        Map<String, Integer> map = codingBat.wordCount(words);

        Map<String, Integer> result = new HashMap<String, Integer>();
        result.put("a", 2);
        result.put("b", 1);
        result.put("c", 1);

        assertEquals(map, result);

    }
}
