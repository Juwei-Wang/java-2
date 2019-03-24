package course.lesson13.case01_linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(6);
        integers.add(7);
        integers.add(3);
        integers.add(8);
        integers.add(4);

        List<Integer> integers1 = Arrays.asList(6, 7, 3, 8, 4);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

        for (int value : integers) {
            System.out.println(value);
        }

        for (Integer integer : integers) {

        }

        int[] arr = {6, 7, 3, 8, 4};
        // iter
        for (int element : arr) {
            System.out.println(element);
        }


        // ctrl + D
        // command + D
    }
}
