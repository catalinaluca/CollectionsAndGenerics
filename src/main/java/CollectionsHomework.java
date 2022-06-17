import java.util.*;
import java.util.regex.Pattern;

public class CollectionsHomework {
    public static void main(String[] args) {
        System.out.println("1st exercise:");
        List<Integer> intList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }
        for (Integer elem : intList) {
            if (elem % 2 == 0) {
                System.out.println(elem);
            }
        }

        System.out.println("2nd exercise:");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello world");
        stringSet.add("Hello world");
        stringSet.add("Hello world");
        for (String elem : stringSet) {
            System.out.println(elem);//the element in only printed once
        }

        System.out.println("3rd exercise:");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Hello", 5);
        stringIntegerMap.put("World", 20);
        for (Map.Entry<String, Integer> stringIntegerEntrySet : stringIntegerMap.entrySet()) {
            if (stringIntegerEntrySet.getValue() > 10) {
                System.out.println(stringIntegerEntrySet.getKey());
            }
        }
        System.out.println("4th exercise:");
        System.out.println("Integer List sorted:");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(5);
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(1);
        Set<Integer> auxSet = new HashSet<>(integerList);
        integerList.clear();
        integerList.addAll(auxSet);
        integerList.sort(Comparator.naturalOrder());
        integerList.forEach(e-> System.out.println(e));
        System.out.println("String set from list:");
        Set<String> stringSetFromIntegerList = new HashSet<>();
        for (Integer i : integerList) {
            stringSetFromIntegerList.add(String.valueOf(i));
        }
        for (String elem : stringSetFromIntegerList) {
            System.out.println(elem);
        }

        Map<String, Integer> mapFromSetAndList = new HashMap<>();
        Iterator stringListIterator = stringSetFromIntegerList.iterator();
        Iterator integerListIterator = integerList.listIterator();
        while (stringListIterator.hasNext() && integerListIterator.hasNext()) {
            mapFromSetAndList.put((String) stringListIterator.next(), (Integer) integerListIterator.next());
        }
        System.out.println("Map:");
        for (Map.Entry<String,Integer>mapEntrySet:mapFromSetAndList.entrySet()) {
            System.out.println(mapEntrySet.getKey()+" "+mapEntrySet.getValue());
        }
    }
}
