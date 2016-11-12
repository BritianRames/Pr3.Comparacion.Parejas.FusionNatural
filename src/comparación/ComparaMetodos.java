package comparación;

/**
 * Christian Brito Ramos
 * Daniel Jesús Cerdeña López
 * 
 **/
 
import java.util.Scanner; 
public class ComparaMetodos {
    
    public static void main(String[] args) {
        DatosEstadisticos de = new DatosEstadisticos();
        DatosEstadisticos de2 = new DatosEstadisticos();
        Ordenar1Vector ov = new Ordenar1Vector();
        Ordenar2Vector o2v = new Ordenar2Vector();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca tamaño del vector: ");
        int tam = reader.nextInt();
        
        int [] v = GeneraCaso.generaVector(tam, true);
        
        ov.ordena(v, de);
        o2v.ordena(v, de2);
        
        System.out.print("El tiempo de ejecución del algoritmo \'"
                +ov.nombreMetodo()+"\' en Java para "+tam+" numeros es de "
                +de.dameTiempo()+" segundos, con " + de.dameComparaciones() + 
                " comparaciones y " + de.dameMovimientos() + " movimientos.\n");
                
        System.out.print("El tiempo de ejecución del algoritmo \'"
                +o2v.nombreMetodo()+"\' en Java para "+tam+" numeros es de "
                +de2.dameTiempo()+" segundos, con " + de2.dameComparaciones() + 
                " comparaciones y " + de2.dameMovimientos() + " movimientos.\n");
        
        DatosEstadisticos deP = new DatosEstadisticos();
        DatosEstadisticos de2P = new DatosEstadisticos();
        Ordenar1Vector ovP = new Ordenar1Vector();
        Ordenar2Vector o2vP = new Ordenar2Vector();
        
        Scanner readerP = new Scanner(System.in);
        System.out.println("Introduzca tamaño del vector: ");
        int tamP = readerP.nextInt();
        
        int [] vP = GeneraCaso.generaVector(tamP, false);
        
        ov.ordena(vP, deP);
        o2v.ordena(vP, de2P);
        
        System.out.print("El tiempo de ejecución del algoritmo \'"
                +ovP.nombreMetodo()+"\' en Java para "+tamP+" numeros es de "
                +deP.dameTiempo()+" segundos, con " + deP.dameComparaciones() + 
                " comparaciones y " + deP.dameMovimientos() + " movimientos.\n");
                
        System.out.print("El tiempo de ejecución del algoritmo \'"
                +o2vP.nombreMetodo()+"\' en Java para "+tamP+" numeros es de "
                +de2P.dameTiempo()+" segundos, con " + de2P.dameComparaciones() + 
                " comparaciones y " + de2P.dameMovimientos() + " movimientos.\n");
    }    

}
