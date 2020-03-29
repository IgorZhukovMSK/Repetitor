import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PolishCalculator {

    public static void main(String[] args) throws IOException {

        BufferedReader numBR = new BufferedReader(new InputStreamReader(System.in));

        String str = numBR.readLine();

        String[] strings = str.split(" "); // массив строк

        Stack<Double> stack = new Stack<Double>();
        
//        addStack (stack);
//
//        public void addStack (Stack<Double> stack){    // не могу понять как сделать метод (((((
//        }

        for (int i = 0; i < strings.length; i++) {

            if (IsNum.isNum(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            } else {

                double temp = stack.pop();
                double temp2 = stack.pop();

                switch (strings[i]) {
                    case "+":
                        stack.push(temp + temp2);
                        break;
                    case "-":
                        stack.push(temp2 - temp);
                        break;
                    case "*":
                        stack.push(temp * temp2);
                        break;
                    case "/":
                        stack.push(temp2 / temp);
                        break;
                }
            }
        }
        if (!stack.empty()) {

            System.out.println(stack.pop());
        } else {
            System.out.println("Ошибка");
        }
    }

    // перенс в отдельный класс
//    private static boolean isNum(String string) {
//        try {
//            Double.parseDouble(string);
//
//            return true;
//        } catch (NumberFormatException ex) {
//            return false;
//        }
//    }
}
