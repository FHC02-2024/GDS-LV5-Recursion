package org.campus02;

public class GGT {

    public static void main(String[] args) {
        System.out.println(ggtRecursive(11, 7));
        System.out.println(ggtRecursive(8, 4));
        System.out.println(ggtRecursive(6, 2));
    }

    /**
     * Ermittle den größten gemeinsamen Teiler
     * @param a Input 1
     * @param b Input 2
     * @return ggt
     */
    public static int ggtRecursive(int a, int b) {
        // Abbruchsbestimmung
        // if b == 0 -> return a
        if (b == 0) {
            return a;
        }
        // ansonsten
        // rufe ggtRecursive(b, rest von a/b)
//        int rest = a % b;
//        return ggtRecursive(b, rest);
        return ggtRecursive(b, a % b);
    }
}
