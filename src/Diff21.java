public class Diff21 {

    static int diffResolution(int number) {
        if (number <= 21) {
            return 21 - number;
        }
        return (number - 21)*2;
    }
}
