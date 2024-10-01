package de.telran.hw_10_09sept_Lists;

import java.util.*;

public class MainLinkList {
    public static void main(String[] args) {

        List<Integer> listLlist = new LinkedList<>();
        listLlist.add(5);
        listLlist.add(12);
        listLlist.add(-15);
        listLlist.add(14);
        listLlist.add(3);
        listLlist.add(7);
        listLlist.add(8);
        listLlist.add(5);
        listLlist.add(18);
        listLlist.add(12);
        listLlist.add(-2);
        listLlist.add(12);
        listLlist.add(78);
        listLlist.add(12);
        listLlist.add(45);
        listLlist.add(37); // спец побольше дублей, для одной из задач

        System.out.println("исходный LinkedList:   " + listLlist);

        // реализуем все задания отдельными методами
        //      1.  Перебрать LinkedList и найти наибольший элемент.
        System.out.println("Наибольший элемент: " + findMax(listLlist));
        System.out.println();

        //        Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
        replaceEl(listLlist);
        System.out.print(" лист после замены всех элементов, кратных 3, на нули:  ");
        System.out.println(listLlist);
        System.out.println();

        //  Перебрать LinkedList и вычислить произведение всех элементов.
        // создадим LinkedList без нулевых элементов
        List<Integer> listL_2 = new LinkedList<>();
        listL_2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("LinkedList для которого посчитаем произвед. эл-тов:  " + listL_2);
        System.out.println("произведение всех элементов=  " + multiL(listL_2));

        //*Перебрать LinkedList и вывести все элементы в обратном порядке.
        // Для этого проще всего воспользоваться ЛистИтератором

        ListIterator<Integer> iterator = listL_2.listIterator(listL_2.size());
        System.out.print("Элементы в обратном порядке: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
        System.out.println();


        //  *Перебрать LinkedList и удалить все дубликаты элементов.
        // Для этого проще всего использовать св-во Сета, что в нем нельзя сохранить дубликат
        System.out.println("LinkedList до удаления дубликатов: " + listLlist);
        HashSet<Integer> seen = new HashSet<>();
        listLlist.removeIf(element -> !seen.add(element));
        System.out.println("LinkedList после удаления дубликатов: " + listLlist);


    }

    //      1.  Перебрать LinkedList и найти наибольший элемент
    public static Integer findMax(List<Integer> list) {
        Integer maxLlist = list.get(0);
        for (Integer el : list) {
            if (el > maxLlist) maxLlist = el;
        }
        return maxLlist;
    }

    //       2.  Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
    public static void replaceEl(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                list.set(i, 0);

        }
    }

    //3. Перебрать LinkedList и вычислить произведение всех элементов.
    public static Integer multiL(List<Integer> list) {
        Integer multi = 1;
        for (Integer el : list) {
            multi = multi * el;
        }
        return multi;
    }

}
