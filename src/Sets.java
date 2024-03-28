
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void hashSet() {
        System.err.println("Hash Set");

        java.util.Set<String> names = new HashSet<>();
        names.add("Alisa");
        names.add("Andri");
        names.add("Tata");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
    }

    public static void LinkedHashSet() {
        System.out.println("Linked Hash Set");

        Set<String> names = new java.util.LinkedHashSet<>();
        names.add("Alisa");
        names.add("Andri");
        names.add("Tata");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
    }
}
