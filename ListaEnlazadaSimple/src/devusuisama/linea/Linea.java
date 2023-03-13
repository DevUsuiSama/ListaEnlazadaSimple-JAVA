package devusuisama.linea;

public class Linea {

    /**
     * INICIO   -> [\n][>][>][-][-][<][<]
     * DOBLE    -> [>][>][-][-][<][<][\n]
     * FINAL    -> [\n][>][>][-][-][<][<][\n]
     */
    public enum Opcion {
        INICIO, DOBLE, FINAL
    }

    public static char[] crear(int tamanio) throws Exception {
        if (tamanio < 4 && tamanio > 50)
            throw new Exception("La distancia no puede ser menor a 3 y mayor a 50.");
        else {
            char[] linea = new char[tamanio];

            for (int i = 0; i < tamanio; i++) {
                if (i <= 1)
                    linea[i] = '>';
                else if (i >= (tamanio - 2))
                    linea[i] = '<';
                else
                    linea[i] = '-';
            }
            return linea;
        }
    }

    public static char[] crear(int tamanio, int nuevaLinea, Opcion opcion) throws Exception {
        if ((tamanio < 4 || nuevaLinea < 0) && (tamanio > 50 || nuevaLinea > 50))
            throw new Exception(
                "[1]> La \"tamaño\" no puede ser menor a 4.\n" + 
                "[2]> \"una nueva linea\" no puede ser menor a 0.\n" +
                "[3]> La \"tamaño\" no puede ser mayor a 50.\n" +
                "[4]> \"una nueva linea\" no puede ser mayor a 50."
            );
        else {
            switch (opcion) {
                case INICIO:
                    return LineaNLI.crear(tamanio, nuevaLinea);
                case DOBLE:
                    return LineaNLD.crear(tamanio, nuevaLinea);
                case FINAL:
                    return LineaNLF.crear(tamanio, nuevaLinea);
                default:
                    throw new Exception("La opción ingresada no existe.");
            }
        }
    }

}
