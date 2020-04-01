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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shop {


    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, Integer>> userData = new TreeMap<>();

        try {
            userData = readData(userData);
        }
        catch (IOException ex) {
            System.out.println("Wrong data " + ex.getMessage());
        }

        List<String> result = countResult(userData);
        print(result);
    }

    public static TreeMap<String, TreeMap<String, Integer>> readData(TreeMap<String, TreeMap<String, Integer>> userData) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        while (!str.equals("exit")) {

            String[] parts = str.split(" ");

            String name = parts[0];
            String goods = parts[1];
            Integer amount = Integer.parseInt(parts[2]);

            if (!userData.containsKey(name))
                userData.put(name, new TreeMap<>());

            TreeMap<String, Integer> temp = userData.get(name);

            if (!temp.containsKey(goods))
                temp.put(goods, 0);

            Integer tempAmount = temp.get(goods);

            temp.put(goods, tempAmount + amount);

            str = br.readLine();
        }

        return userData;
    }

    public static List<String> countResult(TreeMap<String, TreeMap<String, Integer>> userData) {
        List<String> commonResult = new ArrayList<>();

        for (Map.Entry<String, TreeMap<String, Integer>> entry : userData.entrySet()) {

            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();

            StringBuilder result = new StringBuilder(key + ": ");

            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyGoods = product.getKey();
                Integer valueAmont = product.getValue();

                result.append(String.format("%s %d\n", keyGoods, valueAmont));
            }

            commonResult.add(result.toString());
        }

        return commonResult;
    }

    public static void print(List<String> result) {
                   System.out.println(result);
        }
    }
//}


