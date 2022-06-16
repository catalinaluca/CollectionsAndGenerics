public class Generics {
    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 4, 5};
        Character[] charArray = {'a', 'g', 't'};
        Double[] doubleArray = {3.2, 3.45, 6.42};
        printArray(intArray);
        printArray(charArray);
        printArray(doubleArray);
    }

    public static void printArrayInteger(Integer[] arrayInteger) {
        for (Integer elem : arrayInteger) {
            System.out.println(elem);
        }
    }

    public static void printCharArray(char[] charArray) {
        for (char elem : charArray) {
            System.out.println(elem);
        }
    }

    public static void printDoubleArray(double[] doubleArray) {
        for (double elem : doubleArray) {
            System.out.println(elem);
        }
    }
    public static <E> void printArray(E[] array){
        for(E element:array){
            System.out.println(element);
        }
    }
}
