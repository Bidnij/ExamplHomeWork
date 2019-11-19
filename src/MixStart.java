public class MixStart {
    public static boolean mixStartResolution(String word){
        String subStr = word.substring(1, 3);

        if (subStr.equals("ix")) {
            return true;
        }else
            return false;
    }
}
