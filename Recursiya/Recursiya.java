package Recursiya;

public class Recursiya {

    private int[] num;

    public Recursiya(int[] num) {


        // реализовать рекурсивный алгоритм поиска максимального элемента в неотсортированном массиве

        this.num = num;

        int numMax = Integer.MIN_VALUE;
        int maxTemp = 0;
        int maxRecur = 0;

        for (int i = 0; i < num.length; i++) {

            if (numMax < num[i]) {
                numMax = num[i];
                num[i] = num[i];
                num[i] = numMax;
            }
        }
// Второй вариант решения (с использованием Math)

        for (int i = 0; i < num.length; i++) {
            maxTemp = Math.max(maxTemp, num[i]);
        }

        // Рекурсия

        for (int i = 0; i < num.length; i++) {
            if (maxRecur == num[i]){
                return;
            }
        }

        System.out.println("Максимальное числов массиве: " + numMax);
        System.out.println("Максимальное числов массиве (второй вариант): " + maxTemp);
        System.out.println(maxRecur);
    }







//        public int[] getNum(){       // нужен ли get вместе с set??
//                return num;
//        }
//        public void setNum (int[] num){
//                this.num = num;
//        }
}





