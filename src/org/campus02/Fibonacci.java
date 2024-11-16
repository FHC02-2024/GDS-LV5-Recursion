package org.campus02;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(12));
    }

    /**
     * der wert der n-ten fibonacci stelle retourniert werden
     * zB: fib(10) = 55
     * Abbruch: wenn n == 1 oder n == 2 => dann 1
     * sonst: fib(...) + fib(...)
     *
     * @param n Stelle der Fibonacci
     * @return Wert der n-ten Stelle
     */
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
