public class NearHundred {
    public static boolean nearHundredSolution(int randNumber) {
        return ((100 - randNumber) < 10) || (200 - randNumber) < 10;
    }
}
