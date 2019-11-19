public class FrontBack {
    public static String frontBackSolution(String str) {
        if (str.length() > 1) {
            String first = str.substring(0, 1);
            String quater = str.substring(1, str.length() - 1);
            String last = str.substring(str.length() - 1);
            return last + quater + first;
        } else
            return str;
    }
}
