import java.util.Random;


public class DisplayFunc {

    public static Random number = new Random();
    public static final int numbRandOne = number.nextInt(100);
    public static final int numbRandTwo = number.nextInt(100);
    public static final int numbRandThree = number.nextInt(5);
    public static Random randomweakday = new Random();
    public static final boolean weakday = randomweakday.nextBoolean();
    public static final boolean vacation = randomweakday.nextBoolean();
    public static final String word = "Helloworld";

    public static void main(String[] args) {
        System.out.println("Результат сложения " + Diff21.diffResolution(numbRandOne));
        System.out.println("Near Hundred " + NearHundred.nearHundredSolution(numbRandOne));
        SleepIn.sleapInInfo();
        MissingChar.misingCharResolution();
        BackAround.backAroundResolution();

    }


}
