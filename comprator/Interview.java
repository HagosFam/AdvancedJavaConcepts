package comprator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hagos");
        stringList.add("Hagos");
        stringList.add("Deepti");
        stringList.add("Gadbail");

        // printing the apreance count of the name
        // string and its count

       Map<String, Long> stringCounts = stringList.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));

       stringCounts.forEach((k,v)->System.out.println("String" + k + "Count" + v));



        Map<String,Integer> stringMap = new HashMap<>();
        for (String str:stringList){
            int count = 0;
            if(stringMap.get("String")!=null){
                // I have to get the value
                stringMap.put(str, count);
            }
        }
















    }






}
