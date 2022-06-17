import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsHomework {
    static <T>  void swapElements(T[] array,int index1, int index2){
        T auxElem=array[index1];
        array[index1]=array[index2];
        array[index2]=auxElem;
    }
    static <T> int countPrimeElements(List<T> list){
        int countOfPrimes=0;
        for (Object o :list) {
                if(o instanceof Integer){
                    BigInteger elem=new BigInteger(o.toString());
                    if(elem.isProbablePrime(1))countOfPrimes++;
            }
        }
        return countOfPrimes;
    }
    public static void main(String[] args) {
        Integer[]integerArray={1,2,3,4,5,6,7};
        swapElements(integerArray,2,3);
        for (Integer i:integerArray) {
            System.out.println(i);
        }
        System.out.println(countPrimeElements(Arrays.stream(integerArray).toList()));
    }
}
