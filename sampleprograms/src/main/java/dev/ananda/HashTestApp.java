package dev.ananda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTestApp {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(null);
        set.add(null);

        Map map = new HashMap();

        map.put(1, null);
        map.put(2, null);
        map.put(2, null);
        map.put(null, 1);
        map.put(null, 2);

        System.out.println();

    }

}
