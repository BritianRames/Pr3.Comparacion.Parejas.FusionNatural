package comparación;

public class Ordenar1Vector implements OrdenarVector{
    
    
    @Override 
    public String nombreMetodo (){
        return "Ordenación por Intercambio de Parejas";
    }
    
    @Override
    public void ordena (int[] v, DatosEstadisticos de){
        int vi;
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime();
        
        for (int j = 1; j < v.length; j++) {
            boolean cambio = false;
            
            for (int i = ((j+1)%2); i < v.length-1; i++) {
                if(v[i]>v[i+1]){
                   vi = v[i];
                   v[i]=v[i+1]; 
                   v[i+1]= vi;
                   cambio = true;
                }
            }
            if(cambio == false && j>1){
                TFin = System.nanoTime();
                tiempo = TFin - TInicio;
                de.estableceTiempo((double)(tiempo/1000000000));
                return;
            }
        }
        TFin = System.nanoTime();
        tiempo = TFin - TInicio;
        de.estableceTiempo((double)(tiempo/1000000000));
        return;

    }
    
    
}