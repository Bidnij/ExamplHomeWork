import com.sun.deploy.security.SelectableSecurityManager;

public class StartHi {
    public static boolean startHiResolution (String word){
        String subStr = word.substring(0, 2);

        if (subStr.equals("hi")) {
            return true;
        }else
            return false;
    }
}
