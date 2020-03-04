package Dublicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

            System.out.println(new Dublicate().Dublicate(array));


      }
}
