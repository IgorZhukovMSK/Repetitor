import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Concat_NEW {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        Set<Character> result = new HashSet<>();
        Set<Character> repet = new HashSet<>();

        str.append("dsgl9435klsvxm--");
        str.append("mnefior495dkjfmv--1!");

        Pattern pattern = Pattern.compile("[^a-zA-Z]");

        Matcher strM = pattern.matcher(str);

        str.replace(0, str.length(), strM.replaceAll(""));

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {

                    result.add(str.charAt(i));
                } else {
                    repet.add(str.charAt(i));
                }
            }
        }
        System.out.println("Повторные символы " + repet);
        System.out.println("Символы буз повторов " + result);
    }
}
