public class IsNum {

    public static boolean isNum(String string) {
        try {
            Double.parseDouble(string);

            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
