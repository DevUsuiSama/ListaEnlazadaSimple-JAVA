package devusuisama.linea;

/**
 * Linea, Nueva Linea Final.
 * ----------------------------------------------------------------
 * Se encarga de agregar una nueva linea ('\n')
 * al final del array.
 */
public class LineaNLF {

    protected static char[] crear(int tamanio, int nuevaLinea) {
        final int MAXIMO_DE_TAMANIO = tamanio + nuevaLinea;
        
        char[] linea = new char[MAXIMO_DE_TAMANIO];

        for (int i = 0; i < MAXIMO_DE_TAMANIO; i++) {
            if (i < 2)
                linea[i] = '>';
            else if (i >= 2 && i < (MAXIMO_DE_TAMANIO - nuevaLinea - 2))
                linea[i] = '-';
            else if (i >= (MAXIMO_DE_TAMANIO - nuevaLinea - 2) && i < (MAXIMO_DE_TAMANIO - nuevaLinea))
                linea[i] = '<';
            else if (i >= (MAXIMO_DE_TAMANIO - nuevaLinea))
                linea[i] = '\n';
        }
        return linea;
    }

}