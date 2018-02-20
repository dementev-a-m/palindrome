package ru.dementev.palindrome;

/**
 * Created by adementev on 20.02.2018.
 */
public class Palindrome {

    public static int check(int p) {

        if (p < 0)
            throw new RuntimeException();

        int count = 0;
        int[] array = new int[10];
        boolean check = true;

        while (count < 20 && check) {
            int copyP = p;
            int i = 0;

            while (p != 0) {
                array[i] = p % 10;
                p /= 10;
                i++;
            }

            check = checkPalindrome(array, i);

            if (!check) {
                p = sum(array, copyP, i);
                check = true;
                count++;
            } else
                break;
        }

        if (count >= 20)
            throw new RuntimeException();

        return count;
    }

    private static int sum(int[] array, int copyP, int capacity) {
        int rang = 1;
        int mirror = 0;
        for (int j = capacity - 1; j >= 0; j--) {
            mirror += array[j] * rang;
            rang *= 10;
        }
        return mirror + copyP;
    }

    private static boolean checkPalindrome(int[] array, int capacity) {
        for (int i = 0; i < capacity--; i++) {
            if (array[capacity] != array[i])
                return false;
        }
        return true;
    }
}
