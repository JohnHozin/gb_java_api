package home_work.home_work_4;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(revertLinkedList(list));
    }

    private static LinkedList<Integer> revertLinkedList(LinkedList<Integer> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.add(i, linkedList.getLast());
            linkedList.removeLast();
        }
        return linkedList;
    }
}
