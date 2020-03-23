package Str;

    /*
    Задание:
     Вам дана произвольная строка. Создать метод, который для любого слова будет выводить частоту его встречаемости в этой строке.

         2 ую версию программы, которая для решения будет использовать коллекцию HashMap.
         Тогда вам потребуется сначала заполнить ее парами ключ-значение, а затем создать метод,
         который в качестве параметров будет получать HashMap и искомое слово и возвращать частоту встречаемости искомого слова.


    текст для проверки
    Еще с раннего утра всё небо обложили дождевые тучи; было тихо, не жарко и скучно, как бывает в серые пасмурные дни, когда над полем давно уже нависли тучи,
     */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader brText = new BufferedReader(new InputStreamReader(System.in));
        String strText = brText.readLine();
        BufferedReader brWord = new BufferedReader(new InputStreamReader(System.in));
        String strWord = brWord.readLine();


        String tempText = strText.replaceAll("(?u)[^\\pL ]", "").toLowerCase();

        String[] parts = tempText.split(" ");

        HashMap<String, Integer> hashMapStr = new HashMap<>();


        for (int i = 0; i < parts.length; i++) {
            int count = 0;
            for (int j = 0; j < parts.length; j++) {

                if (parts[i].equals(parts[j])) {
                    count++;
                    hashMapStr.put(parts[i], count);
                }
            }
        }

        
        for (Map.Entry<String, Integer> pair : hashMapStr.entrySet()) {

        if (strWord.equals(pair.getKey()))

            System.out.println(pair.getKey() + " " + pair.getValue());
        }
//        System.out.print("Слово " +  " встречается " + count + " раз"); //strWord +
    }
}





