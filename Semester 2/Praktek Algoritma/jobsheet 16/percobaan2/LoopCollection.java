package percobaan2;

import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits.toString());

        while (!fruits.isEmpty()) {
            System.out.println(fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.println(fruit);
        }

        System.out.println();
        fruits.stream().forEach((fruit) -> {
            System.out.println(fruit);
        });

        System.out.println();
        fruits.forEach((fruit) -> {
            System.out.println(fruit);
        });

        // Ganti element terakhior dengan "Strawberry"
        System.out.println("Asli: " + fruits.toString());
        fruits.set(fruits.size()-1, "Strawberry");
        System.out.println("Setelah ganti: "+fruits.toString());

        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Lakukan Sorting
        fruits.sort((fruit1, fruit2) -> fruit1.compareTo(fruit2));
        System.out.println("Setelah sorting: "+fruits.toString());
    }
}
