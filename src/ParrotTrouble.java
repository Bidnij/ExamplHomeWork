public class ParrotTrouble {
    public static boolean parrotTroubleResolution (boolean talking, int hour){
        return (talking && (hour < 7 || hour >20));
    }
}
