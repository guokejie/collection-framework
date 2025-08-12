package org.kejie;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author guokejie
 * @description TODO
 * @Date 2025/8/12 15:12
 */
public class MyHashMapTest {

    @Test
    void testPrint() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        for (MyHashMap<String, Integer>.Node<String, Integer> e : map.entrySet()) {
            System.out.println(e.key + "->" + e.value);
        }
    }

    @Test
    void testApi() {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        int count = 100000;
        for (int i = 0; i < count; i++) {
            myHashMap.put(String.valueOf(i), String.valueOf(i));
        }

        assertEquals(count, myHashMap.size());

        for (int i = 0; i < count; i++) {
            assertEquals(String.valueOf(i), myHashMap.get(String.valueOf(i)));
        }

        myHashMap.remove("8");
        assertNull(myHashMap.get("8"));

        assertEquals(count - 1, myHashMap.size());
    }
}
