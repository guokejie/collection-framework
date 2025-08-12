package org.kejie;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guokejie
 * @description TODO
 * @Date 2025/8/12 14:34
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");

        list.remove(2);

        for (String s : list) {
            System.out.println(s);
        }
    }
}