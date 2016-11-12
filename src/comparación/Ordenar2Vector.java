package comparación;
import static java.lang.System.currentTimeMillis;


public class Ordenar2Vector implements OrdenarVector {
    
    @Override
    public String nombreMetodo(){
        return "Fusión natural";
    }
    
    @Override
    public void ordena(int[] v, DatosEstadisticos de){
        double t_inicio = currentTimeMillis();
        boolean cambio = true;
        int lder, otral, lizq, lsal, movlizq, movlsal, aux;
        int[] auxvec;
        do {
            cambio = false;
            lder = v.length; 
            otral = v.length;
            lizq = 0;
            lsal = 0;
            movlizq = 1;
            movlsal = 1;
            auxvec = new int[v.length];
            while (lizq != lder) {
                if(v[lizq] >= v[lder]) {
                    aux = lizq;
                    lizq = lder;
                    lder = aux;
                    movlizq -= 1;
                }
                de.añadeComparacion();
                auxvec[lsal] = v[lizq];
                de.añadeMovimiento();
                lsal = lsal+movlsal;
                lizq = lizq+movlizq;
                if(v[lizq-movlizq] > v[lizq]) {
                    do {
                        auxvec[lsal] = v[lder];
                        de.añadeMovimiento();
                        lsal = lsal+movlsal;
                        lder = lder-movlizq;
                        de.añadeComparacion();
                    } while (v[lder+movlizq] <= v[lder]);
                    de.estableceComparaciones(-1);
                    cambio = true;
                    movlsal -= 1;
                    aux = lsal;
                    lsal = otral;
                    otral = aux;
                }
                de.añadeComparacion();
            }
            auxvec[lsal] = v[lizq];
            for(int i=1;i<v.length;i++) {
                v[i] = auxvec[i];
                de.añadeMovimiento();
            }
            
        } while(cambio != false);
        double t_fin = currentTimeMillis();
        de.estableceTiempo((t_fin - t_inicio) / 1000);
        return;
    } 
    @Override
    public void imprimeVector(int[] v){
        for(int x=0;x<v.length;x++) {
            System.out.printf(v[x] + ",");
        }
        System.out.printf("\n");
    }  
}