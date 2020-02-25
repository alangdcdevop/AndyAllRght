import org.junit.Test;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    ArrayList<Integer> array1 = new ArrayList<Integer>();

    ArrayList<Integer> array2 = new ArrayList<Integer>();


    Map<Integer, Integer> outerArr = new HashMap<Integer, Integer>();
    Integer counter =0 ;
    int index ;
    @Test
    public  void main(){

        loadDataToArray(array1);
        loadDataToArray(array2);

        System.out.println("Array 1:");
        System.out.println(array1+"\n");
        System.out.println("Array 2:");
        System.out.println(array2+"\n");

        searchForEquals(array1,array2);

        System.out.println("Valores:\n");



        System.out.println("Map :"+outerArr);
        outerArr.forEach((n)-> printValues(n)  );



    }

    private void printValues(Integer n) {
//        System.out.println("Valor : "+n[0]+ ", contador : "+ n[1]);

        // arr1 {1,2,3} arr2 {5,2,4,3,2}
        // Print =
        // 1 No
        // 2 Yes, count 3
        // 3 Yes, count 2
        // 4 No

    }

    private void searchForEquals(ArrayList<Integer> array1, ArrayList<Integer> array2) {

        index = 0;
        array1.forEach((valueFromArray1)-> compareValueToArray(valueFromArray1,array2));

    }

    private void compareValueToArray(Integer valueFromArray1, ArrayList<Integer> array2) {
        counter = 0;
        array2.forEach((valueFromArray2)-> checkEquals(valueFromArray1,valueFromArray2));
    }

    private void checkEquals(Integer valueFromArray1, Integer valueFromArray2) {
        outerArr.put(valueFromArray1,counter);
        if (valueFromArray1==valueFromArray2){
            addToArrayWithEqualValues(valueFromArray1, valueFromArray2);
        }
    }

    private void addToArrayWithEqualValues(Integer valueFromArray1, Integer valueFromArray2) {
       counter++;
        outerArr.put(valueFromArray1,counter);

    }

    private void loadDataToArray(ArrayList<Integer> array) {

        for (int i =0 ; i<6; i++) {
            int random = ThreadLocalRandom.current().nextInt(1 , 6 );
            array.add(random);

        }

    }

}
