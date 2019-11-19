public class MissingChar {
    public static void misingCharResolution() {
        String firstPart = DisplayFunc.word.substring(0, DisplayFunc.numbRandThree);
        String SecondPart = DisplayFunc.word.substring(DisplayFunc.numbRandThree + 1);
        System.out.println("Text with missing simbol " + firstPart + SecondPart);
    }
}
