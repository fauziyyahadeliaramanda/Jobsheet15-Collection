import java.util.Iterator;
import java.util.Stack;

public class LoopCollection10 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push ("Banana");
        fruits.add("0range");
        fruits.add("Watermelon");
        fruits.add ("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
        System.out.printf ("%s " , fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf ("%s ", fruits.pop());
        }


        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");

        fruits.pop();
        fruits.push("Strawberry");

        // Add new fruits (Mango, Guava, Avocado)
        fruits.addAll(java.util.Arrays.asList("Mango", "Guava", "Avocado"));

        // Sort the fruits (ascending order)
        fruits.sort(java.util.Comparator.naturalOrder()); 

        for(Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf ("%s " , fruit);
        }

        System.out.println("");
        fruits. stream().forEach(e -> {
            System.out.printf("%s " , e);
        });

        System.out.println("");
        for (int i=0; i < fruits.size(); i++) {
            System.out.printf("%s " , fruits.get(i));
        }
    }
}