package TEST;

public class Recur {

    public static void main(String[] args) {

        // реализовать рекурсивный алгоритм поиска максимального элемента в неотсортированном массиве

        int[] num = new int[]{123456987, 5000000, 9999999, 3212312, 88888888, 555555, 333333, 11111, 9999999, 5555, 55555, 0, 777777};


        int numMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            if (numMax < num[i]) {
                numMax = num[i];
                num[i] = num[i];
                num[i] = numMax;

            }

        }
// Не могу поянять почему не работает ((( не ищет максимальное значени, что то делаю не так
//        for (int i = 0; i < num.length; i++) {
//
//            max = Math.max(num[i], num[i]);
//        }


        System.out.println("Максимальное число " + numMax);
       // System.out.println("второй вариант " + max);
    }

}

