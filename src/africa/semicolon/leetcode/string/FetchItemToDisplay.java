package africa.semicolon.leetcode.string;

import java.util.List;
import java.util.stream.Collectors;

public class FetchItemToDisplay {

//    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int X) {
//
//        return items.stream().reduce((a, b) -> {
//            if (sortParameter == 0 && sortOrder == 0) {
//                if (a.get(0).compareTo(b.get(0)) < 0){
//                    return a;
//                }
//            } else if (sortParameter == 0 && sortOrder == 1) {
//                if (a.get(0).compareTo(b.get(0)) > 0){
//                    return b;
//                }
//
//            } else if (sortOrder == 0) {
//                if (Integer.parseInt(a.get(sortParameter)) > Integer.parseInt(b.get(sortParameter))) {
//                    return b;
//                }
//            }
//
//            return b;
//        }).stream().limit(X).map(item -> item.get(0)).collect(Collectors.toList());
//
//    }

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int X) {

        return items.stream().sorted((a, b) -> {
            if (sortParameter == 0 && sortOrder == 0) {
                return a.get(0).compareTo(b.get(0));

            } else if (sortParameter == 0 && sortOrder == 1) {
                return b.get(0).compareTo(a.get(0));

            } else if (sortOrder == 0) {
//                return Integer.parseInt(a.get(sortParameter)) > Integer.parseInt(b.get(sortParameter));
                return -1;

            }

            return 1;
        }).limit(X).map(item -> item.get(0)).collect(Collectors.toList());

    }

    public static void main(String[] args) {

        System.out.println(fetchItemsToDisplay(List.of(List.of("p1", "1", "2"), List.of("p2", "2", "1"), List.of("p3", "3", "4")), 0, 0, 2));
    }
}
