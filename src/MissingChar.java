public class MissingChar {
    public static String misingCharResolution(String word, int numbRandThree) {
        String firstPart = word.substring(0, numbRandThree);
        String SecondPart = word.substring(numbRandThree + 1);
        return firstPart + SecondPart;
    }
}
