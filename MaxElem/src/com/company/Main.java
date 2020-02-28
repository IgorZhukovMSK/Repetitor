package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 9, -7, 100, 101, 0};
        System.out.println(searchMaxElem(a, a[0], 1));
    }

    private static int searchMaxElem(int[] a, int max, int index)
    {
        // Escape condition
        if (index != a.length)
        {
            if (a[index] > max) {
                max = a[index];
            }
            max = searchMaxElem(a, max, index + 1);
        }

        return max;
    }
}
