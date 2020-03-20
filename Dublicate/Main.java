package Dublicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

      public static void main(String[] args) throws IOException {
            ArrayList array = new ArrayList();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                  String str = br.readLine();
                  if (str.isEmpty()) {
                        break;
                  } else {
                        array.add(str);
                  }
            }


            Set set = new HashSet();
            set.addAll(array);

             System.out.println(set);



      }
}
