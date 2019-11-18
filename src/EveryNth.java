public class EveryNth {
    public static String everyNthSolution(String word, int number) {
        String text = "";
        for (int i = 0; i < word.length(); i++) {
            if ((i + 1) % number != 0) {
                text += word.charAt(i);
            }
        }
        return text;
    }
}
