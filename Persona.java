// public class Persona {
//     private String nombre;

//     // Método estático que intenta acceder a un atributo no estático (genera un error)
//     public static void mostrarNombre() {
//         // System.out.println(nombre); // Error: Cannot make a static reference to the non-static field nombre
//     }
// }

public class Persona {
    private String nombre;

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
