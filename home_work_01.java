// 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
// Пример:
// 1 -> 2->3->4
// Вывод:
// 4->3->2->1

import java.util.LinkedList;
import java.util.ListIterator;

public class home_work_01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        reversePrint(list);
    }

    private static void reversePrint(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()) {
                System.out.print("->");
            }
        }
    }
}
