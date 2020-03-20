package Shop;

/*
Дана последовательность строк, содержащих данные о продажах некоторого интернет-магазина.
Каждая строка представляет собой запись вида: Покупатель товар количество, где Покупатель —
имя покупателя (строка без пробелов), товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара.

Создайте список всех покупателей, а для каждого покупателя подсчитайте количество приобретенных им единиц каждого вида товаров.

Входные данные
Вводятся сведения о покупках в указанном формате.

Выходные данные
Выведите список всех покупателей в лексикографическом порядке, после имени каждого покупателя выведите двоеточие,
затем выведите список названий всех приобретенных данным покупателем товаров в лексикографическом порядке, после
названия каждого товара выведите количество единиц товара, приобретенных данным покупателем.
Информация о каждом товаре выводится в отдельной строке.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Shop {

   public static void main(String[] args) throws IOException {

       TreeMap<String, TreeMap<String, Integer>> buyer = new TreeMap<String, TreeMap<String, Integer>>();

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (; ; ) {

            String str = br.readLine();

            if (str.equals("exit")) {

                break;
            }

            String[] parts = str.split(" ");

            String name = parts[0];
            String goods = parts[1];
            Integer amount = Integer.parseInt(parts[2]);

            if (!buyer.containsKey(name))
                buyer.put(name, new TreeMap<String, Integer>());

                TreeMap<String, Integer> temp = buyer.get(name);

                if (!temp.containsKey(goods))
                    temp.put(goods, 0);

                Integer tempAmount = temp.get(goods);

                temp.put(goods, tempAmount + amount);
            }

            for (Map.Entry<String, TreeMap<String, Integer>> entry : buyer.entrySet()) {

                String key = entry.getKey();
                TreeMap<String, Integer> value = entry.getValue();

                System.out.println(key + ":");

                for (Map.Entry<String, Integer> product : value.entrySet()) {
                    String keyGoods = product.getKey();
                    Integer valueAmont = product.getValue();

                    System.out.println(keyGoods + " " + valueAmont);
                }
            }
        }
    }



