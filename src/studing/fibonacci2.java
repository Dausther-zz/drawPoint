package studing;

/**
 * Created by dausther on 09/05/16.
 */
public class fibonacci2 {

    /** Imprimir a sequencia de Fibonacci para valores < 50 */
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;

        System.out.println(lo);
        while (hi < 50){
            System.out.println(hi);
            hi = lo + hi;       //  novo hi
            lo = hi - lo;       /*  novo lo e (soma - lo anterior)
                                    isto e, o antigo hi */
        }
    }
}
