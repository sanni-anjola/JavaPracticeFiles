package airline;

import java.util.HashMap;
import java.util.Map;

public abstract class Item {

    protected int id;
    private static int count = 0;
    private static final Map<String, Integer> idMap = new HashMap<>(Map.of("Commercial", 0, "Industrial", 0, "Person", 0, "Cargo", 0));


    public Item() {
        String className = this.getClass().getSimpleName();
        Map<String, Integer> classesValue = new HashMap<>(Map.of("Commercial", 1, "Industrial", 2, "Person", 3, "Cargo", 4));
        id = Integer.parseInt(classesValue.get(className) + String.format("%08d", idMap.get(className)));
        idMap.put(className, idMap.get(className) + 1);
        count += 1;
    }

    public static int getTotalNumberOfItems(){
        return count;
    }
    public int getId() {
        return id;
    }
}
