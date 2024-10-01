package de.telran.hw_10_09sept_Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainArLists {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.addAll(List.of(15, 27, 18, 49, 15, 4, 15, 3, 2, 7, 1, 6, 78));
        System.out.println("исходный список: " + intList);
        System.out.println();

        //        Найти сумму всех элементов ArrayList.
        int sumArList = 0;
        for (int el : intList) {
            sumArList += el;
        }
        System.out.println("сумма всех элементов ArrayList = " + sumArList);
        System.out.println();

        //                Найти среднее значение элементов ArrayList.
        // так как сумма элементов уже есть, то среднне ззначение легко найти зная колич. элементов
        double average = sumArList / intList.size();
        System.out.println("среднее значение элементов ArrayList=  " + average);
        System.out.println();

        //        Перебрать ArrayList и найти наименьший элемент.
        int minElem = intList.get(0);
        for (int i = 0; i < intList.size(); i++) {
            if (minElem > intList.get(i)) minElem = intList.get(i);
        }
        System.out.println("наименьший элемент ArrayList= " + minElem);
        System.out.println();

        //        Перебрать ArrayList и найти сумму квадратов всех элементов.
        int sumQ = 0;
        for (int el : intList) {
            sumQ += el * el;
        }
        System.out.println("сумма квадратов всех элементов ArrayList=  " + sumQ);
        System.out.println();

        //*Перебрать ArrayList и удалить все четные числа.
        // Потренируюсь сделать это с помощью Итератора
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
            if (el % 2 == 0) iterator.remove();
        }
        System.out.println(" ArrayList после удаления всех четных чисел:  " + intList);
        System.out.println();

        //*Перебрать ArrayList и найти второй по величине элемент (secondMax)
        // Ищем первый и второй по величине элементы, так как без первого не найти второго

        int max = intList.get(0);  // опираемся на первый элемент для начала поиска
        int secondMax = intList.get(0);

        for (int el : intList) {
            if (el > max) {
                secondMax = max; // аккумулируем значение предыдущего максимума
                max = el;
            } else if (el > secondMax && el != max) {
                secondMax = el;
            }
        }
        System.out.println("второй по величине элемент=  " + secondMax);


    }
}
