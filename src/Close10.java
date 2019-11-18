public class Close10 {

    public static int close10(int firstNumber, int secondNumber) {
        int aDiff = Math.abs(firstNumber - 10);
        int bDiff = Math.abs(secondNumber - 10);

        if (aDiff < bDiff) {
            return firstNumber;
        }
        if (bDiff < aDiff) {
            return secondNumber;
        }
        return 0;
    }
}
