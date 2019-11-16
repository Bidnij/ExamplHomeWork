import java.util.Random;

public class SleepIn {

    static void sleapInInfo() {

        if (DisplayFunc.vacation == true || DisplayFunc.weakday == false) {
            System.out.println("Спишь");
        }
        else
            System.out.println("Работаешь");
    }
}
