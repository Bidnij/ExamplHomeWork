public class EveryNth {
    public static String everyNthSolution(String word, int number) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if ((i + 1) % number != 0) {
                text.append(word.charAt(i));
            }
        }
        return text.toString();
    }
}
