package devusuisama.linea;

/**
 * Linea, Nueva Linea Inicio.
 * ----------------------------------------------------------------
 * Se encarga de agregar una nueva linea ('\n')
 * al inicio del array.
 */
public class LineaNLI {
    
    protected static char[] crear(int tamanio, int nuevaLinea) {
        final int MAXIMO_DE_TAMANIO = tamanio + nuevaLinea;
        
        char[] linea = new char[MAXIMO_DE_TAMANIO];

        for (int i = 0; i < MAXIMO_DE_TAMANIO; i++) {
            if (i < nuevaLinea)
                linea[i] = '\n';
            else if (i >= nuevaLinea && i < (nuevaLinea + 2))
                linea[i] = '>';
            else if (i >= (nuevaLinea + 2) && i < (MAXIMO_DE_TAMANIO - 2))
                linea[i] = '-';
            else if (i >= (MAXIMO_DE_TAMANIO - 2))
                linea[i] = '<';
        }
        return linea;
    }

}
