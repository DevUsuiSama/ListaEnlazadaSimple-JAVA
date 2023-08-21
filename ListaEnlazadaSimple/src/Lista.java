public class Lista {

    private Persona head = null;

    public Lista(Persona nodo) {
        insertar(nodo);
    }

    public void insertar(Persona nodo) {
        if (estaVacio(head))
            head = nodo;
        else {
            Persona aux = irHastaElUltimoNodo(head);
            aux.setSiguiente(nodo);
        }
    }

    public boolean estaVacio(Persona lista) {
        return (lista == null);
    }

    public Persona irHastaElUltimoNodo(Persona lista) {
        while (!estaVacio(lista.getSiguiente()))
            lista = lista.getSiguiente();
        return lista;
    }

    public void mostrar() {
        if (estaVacio(head))
            System.out.println("> La lista esta vacia");
        else {
            int cont = 1;

            while (!estaVacio(head)) {
                System.out.println("> [" + cont + "] Nombre: " + head.getNombre());
                System.out.println("> [" + cont + "] Apellido: " + head.getApellido() + "\n");
                head = head.getSiguiente();
                cont++;
            }
        }
    }

}