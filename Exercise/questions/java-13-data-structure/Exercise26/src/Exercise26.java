import java.util.HashMap;
import java.util.Map;

/**
 * In this exercise, try to create an enum Fruit, with two fields, name (String) and price (int).
 * Revise foodTable to HashMap<Integer, Fruit>.
 * 
 * Expected Output: 
 * Before change: 
 * 1 = Apple 
 * 3 = Strawberry
 * 
 * After change: 
 * 1 = APPLE, price = 20 
 * 3 = STRAWBERRY, price = 70
 */

 enum Fruit{
    APPLE("Apple", 1), //
    STRAWBERRY("Strawberry", 3),
    ;
    private String name;

    private int price;
    private Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
 }
class Exercise26 {
    // finite number of instances
    enum Fruit {
        // code here
        APPLE("Apple", 20), //
        STRAWBERRY("Strawberry", 50),
        ;
        private String name;
    
        private int price;
        private Fruit(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }
        // @Override
        // public String toString() {
        //     return this.name + 
        //         ", price = " + this.price;
        // }
    }
    
    public static void main(String[] args) {
        // initialize a HashMap
        HashMap<Integer, String> foodTable = new HashMap<>();

        // Add elements using put method
        foodTable.put(1, "Apple");
        foodTable.put(3, "Strawberry");
        foodTable.put(2, "Orange");

        // Remove elements 2
        foodTable.remove(2);

        // Iterate the map using
        // for-each loop
        // Iterating HashMap through for loop
        for (Map.Entry<Integer, String> set : foodTable.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }

        HashMap<Integer, Fruit> hm = new HashMap<>();
        hm.put(1, Fruit.APPLE);
        hm.put(3, Fruit.STRAWBERRY);
        for (Map.Entry<Integer, Fruit> set : hm.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue() + ", price = " + set.getValue().getPrice());
        }
    }
}
