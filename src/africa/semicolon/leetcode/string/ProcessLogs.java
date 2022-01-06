package africa.semicolon.leetcode.string;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessLogs {
    public static void main(String[] args) {

    }

    public String[] process(String[] logs, int maxSpan){
        Map<String, Integer> map = new HashMap<>();
        for(String s : logs){
            String[] s1 = s.split(" ");
            if(!map.containsKey(s1[0]))
                map.put(s1[0], Integer.parseInt(s1[1]));
            else
            map.put(s1[0], map.get(s1[0]) - Integer.parseInt(s1[1]));
        }

        List<String> collect = map.entrySet().stream().filter(e -> e.getValue() <= maxSpan).map(e -> e.getKey().toString()).toList();
        collect.sort(Comparator.comparingInt(Integer::valueOf));
        collect = List.of();
        return collect.toArray(new String[0]);
    }
}
