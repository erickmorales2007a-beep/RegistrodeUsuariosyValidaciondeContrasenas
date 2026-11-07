public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    public Usuario(String nombreUsuario, String correo, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        setContrasena(contrasena);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        if (contrasena != null && contrasena.length() >= 8) {
            this.contrasena = contrasena;
        } else {
            System.out.println("Advertencia [" + nombreUsuario + "]: La contraseña debe tener al menos 8 caracteres.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Usuario: " + nombreUsuario + " | Correo: " + correo);
    }
}