/*
 * Created on Sat Feb 18 2023
 *
 * Copyright (c) 2023 UsuiSama
 */
import devusuisama.linea.Linea;

public class App {

    private static String APP_NAME = "Lista Enlazada Simple";

    public static void main(String[] args) throws Exception {
        Lista lista = new Lista(new Persona("Inicio", "Lista"));
        char opcion;

        Console.setTitle(APP_NAME);
        Console.command("color 0b");

        do {

            Persona persona = new Persona();

            System.out.println(APP_NAME);
            System.out.println(Linea.crear(80, 1, Linea.Opcion.DOBLE));
            
            System.out.print("> Ingresa nombre: ");
            persona.setNombre(System.console().readLine());

            System.out.print("> Ingrese apellido: ");
            persona.setApellido(System.console().readLine());

            lista.insertar(persona);

            System.out.println(Linea.crear(80, 1, Linea.Opcion.DOBLE));

            System.out.println("Opciones Disponibles:");
            System.out.println("\t- Presione [e] para finalizar");
            System.out.println("\t- Presione cualquier botón para continuar\n");

            System.out.print("> ingrese una opción: ");

            opcion = System.console().readLine().charAt(0);
            
            Console.command("cls");
            
        } while (!(opcion == 'e'));

        System.out.println("Resultado");
        System.out.println(Linea.crear(80, 1, Linea.Opcion.FINAL));

        lista.mostrar();

        System.out.println(Linea.crear(80));

        Console.command("pause");
    }

}