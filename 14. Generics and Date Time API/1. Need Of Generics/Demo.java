import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        // ✅ Example 1: Using Array (Type Safe)
        String[] names = new String[3];
        names[0] = "Navin";
        names[1] = "Kiran";
        names[2] = "Harsh";
        // names[3] = 10; // ❌ Compile-time error if uncommented (only String allowed)

        String nameFromArray = names[0]; // No casting needed
        System.out.println("From Array: " + nameFromArray);

        // ✅ Example 2: Collection without Generics (Risky)
        ArrayList list = new ArrayList(); // Raw ArrayList (no type safety)
        list.add("Ronit");
        list.add("Romil");
        list.add(10); // ⚠️ Mistakenly added an Integer

        String name1 = (String) list.get(0); // OK
        System.out.println("From Non-Generic List: " + name1);
        // String name2 = (String) list.get(2); // ❌ Runtime Error: ClassCastException if uncommented

        // ✅ Example 3: Collection with Generics (Safe)
        ArrayList<String> genericList = new ArrayList<String>(); // Type-safe ArrayList
        genericList.add("Rakshit");
        genericList.add("Rohit");
        // genericList.add(100); // ❌ Compile-time error if uncommented

        String nameFromGenericList = genericList.get(0); // No casting needed
        System.out.println("From Generic List: " + nameFromGenericList);
    }
}
