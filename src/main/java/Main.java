import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cotut");
        stringList.add("Ionut");
        stringList.add("Andrei");
        stringList.add("Catalina");
        Iterator<String> it = stringList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        for (String s : stringList) {
//
//        }
        List<Integer> intList = new ArrayList<>();
        intList.add(33);
        intList.add(4);
        intList.add(1);
        Iterator intIter = intList.iterator();
        while (intIter.hasNext()) {
            int num = (Integer) intIter.next();
            if (num > 20) intIter.remove();
        }
        for (Integer integer : intList) {
            System.out.println(integer);
        }
        Set<String> stringSet = new HashSet<>();
        for (Integer i : intList) {
            stringSet.add(String.valueOf(i));
        }
        Iterator<String> iterator = stringSet.iterator();
        System.out.println("\nStringSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
      /*  stringSet.forEach(System.out::println);
        System.out.println("\n");
        for (String s : stringSet) {
            System.out.println(s);
        }
*/
        Map<String,String> stringMap=new HashMap<>();
        stringMap.put("Ionut","Scrie");
        stringMap.put("Cotut","Priveste");
        System.out.println("\nEntrySet");
        for (Map.Entry<String, String> stringStringEntry : stringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey()+" "+stringStringEntry.getValue());
        }
        System.out.println("\nKeySet:");
        for (String s : stringMap.keySet()) {
            System.out.println(s);
        }
        System.out.println("\nValues:");
        for (String s : stringMap.values()) {
            System.out.println(s);
        }

    }
}
