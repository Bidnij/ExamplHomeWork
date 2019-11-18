public class StringE {
    public static boolean stringESolution(String word) {
        int count = 0;
        char simbol = 'e';
        int length = word.length();
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == simbol) {
                count = count + 1;
            }
        }
        return (count >= 1 && count <= 3);
    }
}

