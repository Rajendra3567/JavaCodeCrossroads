package Miscellanous;

import java.util.ArrayList;
import java.util.List;

public class M8_GenericTypeDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);

        List newList = new ArrayList();
        newList.add(123);
        newList.add(12.12);
        newList.add("raj");
        newList.add(true);

        System.out.println("List : " + list);
        System.out.println("New List : " + newList);
    }
}
