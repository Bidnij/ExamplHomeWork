public class PosNeg {
    public static boolean posNegSolution (int a, int b, boolean negative){
        return (((a<0 && b>0) || (a>0 && b<0)) || ((a<0 && b<0)&& negative));
    }
}
