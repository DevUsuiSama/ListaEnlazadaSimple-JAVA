package devusuisama.linea;

/**
 * Linea, Nueva Linea Doble.
 * ----------------------------------------------------------------
 * Se encarga de agregar una nueva linea ('\n')
 * tanto al inicio del array como al final.
 */
public class LineaNLD {

    private static boolean esPar(int num)
    {
        return ((num % 2) == 0);
    }

    private static int convertirImparEnPar(int num)
    {
        if (esPar(num))
            return num;
        else
            return convertirImparEnPar(num + 1);
    }
    
    protected static char[] crear(int tamanio, int nuevaLinea) {
        nuevaLinea = convertirImparEnPar(nuevaLinea);

        final int MAXIMO_DE_TAMANIO = tamanio + nuevaLinea;
        
        char[] linea = new char[MAXIMO_DE_TAMANIO];
        
        for (int i = 0; i < MAXIMO_DE_TAMANIO; i++) {
            if (i < (nuevaLinea / 2))
                linea[i] = '\n';
            else if (i >= (nuevaLinea / 2) && i < ((nuevaLinea / 2) + 2))
                linea[i] = '>';
            else if (i >= ((nuevaLinea / 2) + 2) && i < (MAXIMO_DE_TAMANIO - (nuevaLinea / 2)) - 2)
                linea[i] = '-';
            else if (i >= (MAXIMO_DE_TAMANIO - (nuevaLinea / 2) - 2) && i < (MAXIMO_DE_TAMANIO - (nuevaLinea / 2)))
                linea[i] = '<';
            else if (i >= (MAXIMO_DE_TAMANIO - (nuevaLinea / 2)))
                linea[i] = '\n';
        }
        return linea;
    }

}
