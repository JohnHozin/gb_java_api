package home_work.home_work_oop_3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.addByIndex(2, "data2-1");
        list.add("data4");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("------");

        list.removeByIndex(2);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
