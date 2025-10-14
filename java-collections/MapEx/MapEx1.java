package TopicWisePrograms.Collections.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map map= new HashMap();
        System.out.println(map);
        map.put(0,"samantha");
        map.put(null,"satish");
        map.put("Person","Satish");

        if(map.containsKey(null)){
            System.out.println(map.get(null));
        }
        //System.out.println(map);
    }
}
