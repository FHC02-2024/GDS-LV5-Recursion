package org.campus02;

import java.util.ArrayList;
import java.util.Collections;

public class SumUp {

    public static void main(String[] args) {
//        System.out.println(sumUpIterative(3));
        System.out.println("Summe der Rekursion: " + sumUpRecursive(3));
        System.out.println("Summe der Rekursion mit Acc: " + sumUpRecursive(3, 0));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // hier aufruf der iterativen Methode: summiere alle Werte der Liste
        System.out.println(sumUpListIterative(numbers));
        System.out.println("Liste vor der Rekursion:");
        System.out.println(numbers);
        System.out.println(sumListRecursive(new ArrayList<>(numbers)));
        System.out.println(numbers);

        System.out.println("List vor der Rekursion mit Index");
        System.out.println(numbers);
        System.out.println(sumListRecursive(numbers, 0));
        System.out.println(numbers);
    }

    /**
     * addiere alle zahlen von 0 - n (iterativ)
     * @param n
     * @return summe
     */
    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Basis fall: sumUpRecursive(0)
     * n + sumUpRecursive(...)
     * @param n
     * @return
     */
    public static int sumUpRecursive(int n) {
        // Abbruchsbestimmung
        if (n <= 0) {
            return n;
        }
        // summieren und aufrufen
        return n + sumUpRecursive(n - 1);
        // 3 + sumUpRecursive(2)
        // 3 + 2 + sumUpRecursive(1)
        // 3 + 2 + 1 + sumUpRecurive(0)
        // 3 + 2 + 1 + 0
        // => 6
    }

    public static int sumUpRecursive(int n, int acc) {
        if (n <= 0) {
            return acc;
        }
        acc = acc + n;
        return sumUpRecursive(n - 1, acc);
    }

    public static int sumUpListIterative(ArrayList<Integer> values) {
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }

    public static int sumListRecursive(ArrayList<Integer> values) {
        // Abbruchsbestimmung
        if (values.size() <= 0) {
            return 0;
        }
        Integer value = values.remove(0);
        return value + sumListRecursive(values);
    }

    public static int sumListRecursive(ArrayList<Integer> values, int index) {
        if (values.size() <= index) {
            return 0;
        }
//        int value = values.get(index);
        return values.get(index) + sumListRecursive(values, index + 1);
    }
}
