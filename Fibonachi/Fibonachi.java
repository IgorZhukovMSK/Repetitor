package Fibonachi;

public class Fibonachi {

    //функция возвращающая n-число фибоначчи.

    public static int fibonachi(int n) {

         if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonachi(n - 1) + fibonachi(n - 2);
            }
        }

    }



// функция возвращающаая все числа до n-числа.
//          public static int fibonachi(int n) {

//        int num = 0;
//        int numNext = 1;
//        int index = 0;




//        for (int i = 0; i < n; i++) {
//
//            int temp = numNext;
//
//            numNext = num + numNext;
//
//            num = temp;
//
//           System.out.println(num);

//               }
//
//    return num;
//
//    }
//}
