public class Main {
    public static void main(String[] args) {
        Usuario[] listaUsuarios = new Usuario[3];
        int contador = 0;

        System.out.println("=== INGRESO DE USUARIOS ===");

        if (contador < listaUsuarios.length) {
            listaUsuarios[contador] = new Usuario("erick_cujilema", "erick@example.com", "ClaveSegura123");
            contador++;
            System.out.println("Usuario 1 agregado con éxito.");
        }

        if (contador < listaUsuarios.length) {
            listaUsuarios[contador] = new Usuario("admin_test", "admin@example.com", "12345");
            contador++;
            System.out.println("Usuario 2 agregado.");
        }

        if (contador < listaUsuarios.length) {
            listaUsuarios[contador] = new Usuario("dev_user", "dev@example.com", "DevPass2026");
            contador++;
            System.out.println("Usuario 3 agregado con éxito.");
        }
        if (contador < listaUsuarios.length) {
            listaUsuarios[contador] = new Usuario("extra_user", "extra@example.com", "Password888");
        } else {
            System.out.println("\n[AVISO]: No se puede registrar 'extra_user'. El arreglo está lleno (Capacidad: " + listaUsuarios.length + ").");
        }

        System.out.println("\n=== CONSULTA Y OPERACIÓN ===");

        int indiceBuscar = 0;
        if (indiceBuscar >= 0 && indiceBuscar < contador) {
            System.out.println("Mostrando información en posición " + indiceBuscar + ":");
            listaUsuarios[indiceBuscar].mostrarDatos();
        }

        int indiceModificar = 1;
        if (indiceModificar >= 0 && indiceModificar < contador) {
            System.out.println("\nActualizando clave del usuario en índice " + indiceModificar + "...");
            listaUsuarios[indiceModificar].setContrasena("NuevaClaveValida2026");
        }
    }
}