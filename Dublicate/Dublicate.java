package Dublicate;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Dublicate {
    public Dublicate() {
    }

    public static void main(String[] args) throws IOException {
        ArrayList array = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count;
        for(count = 0; count < 5; ++count) {
            array.add(br.readLine());
        }

        count = 0;
        String str = null;

        for(int i = 0; i < array.size(); ++i) {
            for(int j = i + 1; j < array.size(); ++j) {
                if (array.get(i).equals(array.get(j))) {
                    ++count;
                    str = String.valueOf(array.get(i));
                }
            }
        }

        System.out.println(count + " " + str);
    }
}
