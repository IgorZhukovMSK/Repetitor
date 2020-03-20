package Dublicate;

/*
Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */

import java.util.ArrayList;


public class Dublicate {
      public ArrayList Dublicate(ArrayList array) {

            Object[] st = array.toArray();

            for (Object s : st) {
                  if (array.indexOf(s) != array.lastIndexOf(s)) {
                        array.remove(array.lastIndexOf(s));
                  }
            }

            return array;

/*          Не работает

        for (int i = 0; i < array.size(); ++i) {
            for (int j = i + 1; j < array.size(); ++j) {
                if (array.get(i).equals(array.get(j))) {

                    array.remove(i);
                }
            }
        }
        System.out.println(array);
*/
      }
}

