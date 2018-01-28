package map;

import java.util.*;

/**
 * Created by zhouyang
 * Date 2017/12/6.
 */
public class HashMapTest {

    public static void main(String[] args) {
            HashMap map = new HashMap();

            map.put("a","aaaa");
            map.put("b","bbbb");
            map.put("c","cccc");
            map.put("c","cccdc");

        Set set = map.keySet();

        for(Iterator iter = set.iterator(); iter.hasNext();)
        {
            String key = (String)iter.next();
            String value = (String)map.get(key);
            System.out.println(key+"===="+value);
        }

        List<String> list = new ArrayList<String>();
        list.add("AAAA");
        list.add("AAAA");
        list.add("AAAA");
        list.add("BBBB");
        list.add("BBBB");
        list.add("BBBB");
        list.add("CCCC");
        list.add("CCCC");
        list.add("CCCC");
        list.add("DDDD");

        new HashMapTest().removeDuplicate1(list);
    }
    public static void removeDuplicate1(List list) {
        HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
        System.out.println(list);
    }

}
