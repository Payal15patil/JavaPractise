package arraylist;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(12,"ashish");
        map.put(24,"Nehal");
        map.put(41,"yogi");
        map.put(60,"moly");
        System.out.println(map);
        System.out.println(map.get(41));
        System.out.println(map.remove(24));
        System.out.println(map.put(33,"harsh"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }
}

