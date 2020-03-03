import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Duplicate {

    public static void main(String[] args) throws IOException {

        ArrayList array = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //написать что бы при пустой строке заканчивал ввод данных
        while (true) {
            String str = br.readLine();
            if (str.isEmpty()) {
                break;
            }
            array.add(str);
        }



        // каждый раз при повторе необходимо удалять элемент
        int count = 0;
        String str = null;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i).equals(array.get(j))) {
                    count = count + 1;
                    str = String.valueOf(array.get(i));
                }
            }
        }
        System.out.println(count + " " + str);

//    public Duplicate(){

//        ArrayList dub = new ArrayList();


    }


}
