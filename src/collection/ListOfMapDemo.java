package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Kolhapur");

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Nagpur");
        map1.put(2,"Bangalore");
        map1.put(3,"Chennai");

        List<Map<Integer,String>> mapList = new ArrayList<>();
        mapList.add(map);
        mapList.add(map1);

        mapList.forEach(m->{
            m.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });

    }
}
