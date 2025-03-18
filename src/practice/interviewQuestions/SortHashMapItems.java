package practice.interviewQuestions;

import java.util.*;

/*
* Try sorting values in a hash map using tree-map.
* */
public class SortHashMapItems {
    public static void sortHashmapByKeys(){
        Map<Integer, Character> map= new HashMap<>();
        map.putIfAbsent(1, 'a');
        map.putIfAbsent(4, 'b');
        map.putIfAbsent(3, 'c');

        java.util.TreeMap<Integer, Character> treeMap = new java.util.TreeMap<>(map);
        System.out.println(treeMap);
    }

    public static void sortHashmapByValues(){
        Map<Integer, Character> map = new HashMap<>();
        map.putIfAbsent(1, 'a');
        map.putIfAbsent(4, 'b');
        map.putIfAbsent(3, 'c');
        List<Map.Entry<Integer, Character>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        LinkedHashMap<Integer, Character> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Character> entry: list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedHashMap);
    }

    public static void main(String[] args){
        sortHashmapByKeys();
        sortHashmapByValues();
    }
}
