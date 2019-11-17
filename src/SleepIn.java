import java.util.Random;

public class SleepIn {

    static void sleapInInfo() {

        if (DisplayFunc.vacation || !DisplayFunc.weakday) {
            System.out.println("Спишь");
        }
        else
            System.out.println("Работаешь");
    }
}
