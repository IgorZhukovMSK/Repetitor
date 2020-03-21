package Str;

    /*
    В методе маин у нас вводится текст и вводиться слово

    текст для проверки
    Еще с раннего утра всё небо обложили дождевые тучи; было тихо, не жарко и скучно, как бывает в серые пасмурные дни, когда над полем давно уже нависли тучи,
     */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader brText = new BufferedReader(new InputStreamReader(System.in));
        String strText = brText.readLine();

        BufferedReader brWord = new BufferedReader(new InputStreamReader(System.in));
        String strWord = brWord.readLine();

        List<String> arrText = new ArrayList<>();

        String tempText = strText.replaceAll("(?u)[^\\pL ]", "").toLowerCase();

        String[] parts = tempText.split(" ");

        for (int i = 0; i < parts.length; i++) {

            arrText.add(parts[i]);
        }

          int count = 0;

            for (String text : arrText) {

                if (strWord.toLowerCase().equals(text)) {
                    count++;

                }
            }
            System.out.print("Слово " + strWord + " встречается " + count + " раз");
        }
    }

