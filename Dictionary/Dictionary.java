package Dictionary;

/*
Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны. Для одного данного слова определите его синоним.

Входные данные
Программа получает на вход количество пар синонимов N. Далее следует N строк, каждая строка содержит ровно два слова-синонима. После этого следует одно слово.

Выходные данные
Программа должна вывести синоним к данному слову.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Dictionary {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap hashMap = new HashMap();

        for (int i = 0; i < n; i++) {
            BufferedReader brStr = new BufferedReader(new InputStreamReader(System.in));
            String key = brStr.readLine();
            String vol = brStr.readLine();

            hashMap.put(key, vol);
        }

        BufferedReader brStr2 = new BufferedReader(new InputStreamReader(System.in));
        String str3 = brStr2.readLine();

        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();

            if (str3.equals(key)) {
                System.out.println(value);

            }
        }
    }
}

