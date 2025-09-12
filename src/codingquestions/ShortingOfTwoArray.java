package codingquestions;

import java.util.ArrayList;
import java.util.List;

public class ShortingOfTwoArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        List<Integer> list2 = new ArrayList<>();
        list2.add(-2);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        List<Integer> sortedList = sort(list,list2);
        System.out.println(sortedList);
    }

    private static List<Integer> sort(List<Integer> list, List<Integer> list2) {
        int i = 0;
        int j = 0;
        int list1Size = list.size();
        int list2Size = list2.size();


        while (i < list1Size && j < list2Size){
            int value1 = list.get(i);
            int value2 = list2.get(j);

            if (value1 < value2){
                i++;
            }else {
                list.add(i, value2);
                j++;
                i++;
                list1Size++;
            }
        }

        while (j < list2Size){
            list.add(list2.get(j));
            j++;
            list1Size++;
        }

        return list;
    }
}


