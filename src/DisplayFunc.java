import java.util.Random;


public class DisplayFunc {

    public static Random number = new Random();
    public static final int numbRandOne = number.nextInt(100);
    public static final int numbRandTwo = number.nextInt(100);
    public static final int numbRandThree = number.nextInt(5);
    public static final int getNumbRandFour = number.nextInt(4)+1;
    public static Random randomweakday = new Random();
    public static final boolean weakday = randomweakday.nextBoolean();
    public static final boolean vacation = randomweakday.nextBoolean();
    public static final String word = "Helloworld";
    public static final String word2 = "hitext";
    public static final String word3 = "mixtext";


    public static void main(String[] args) {
        System.out.println("Diff 21 = " + Diff21.diffResolution(numbRandOne));
        System.out.println("Near Hundred = " + NearHundred.nearHundredSolution(numbRandOne));
        SleepIn.sleapInInfo();
        MissingChar.misingCharResolution();
        BackAround.backAroundResolution();
        System.out.println("StartHi = " + StartHi.startHiResolution(word2));
        System.out.println("HasTeen = " + HasTeen.hasTeenResolution( numbRandOne, numbRandTwo, numbRandThree));
        System.out.println("MixStart = " + StartHi.startHiResolution(word3));
        System.out.println("Close10 " + Close10.close10(numbRandOne, numbRandThree));
        System.out.println("StringE = " + StringE.stringESolution(word));
        System.out.println("EveryNth = " + EveryNth.everyNthSolution(word, getNumbRandFour));

    }


}
