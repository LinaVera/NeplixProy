package neplixmvc.modelo;

public class Usuario extends Capitulo {

    private String nombre;
    private String apellido;
    private String email;
    private String fechaNac;
    private Integer cod_usuario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email, String fechaNac, Integer cod_usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.cod_usuario = cod_usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Integer cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void crirtica() {
    }

    public void puntuarSerie() {
    }

    public void addFavorito() {
    }

    public void estadoCapitulo() {
    }

    public void cancelarTemporada() {
        Temporada t = new Temporada();
        t.setEstado(false);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", fechaNac=" + fechaNac + ", cod_usuario=" + cod_usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
