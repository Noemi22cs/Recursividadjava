package recursividad;

/**
 *
 * @author Noemi
 */
public class aplicar {
    public void Imprimir (int i){
        if (i<=15){
            System.out.print(i + " ,");
            Imprimir(i +1);
        }
    }
}
