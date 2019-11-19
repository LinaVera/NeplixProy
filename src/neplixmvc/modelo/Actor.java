package neplixmvc.modelo;


public class Actor {

    private String nombre;
    private Integer cod_actor;
    private String nombreAr;

    public Actor() {
        super();
    }

    public Actor(String nombre, Integer cod_actor, String nombreAr) {
        this.nombre = nombre;
        this.cod_actor = cod_actor;
        this.nombreAr = nombreAr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCod_actor() {
        return cod_actor;
    }

    public void setCod_actor(Integer cod_actor) {
        this.cod_actor = cod_actor;
    }

    public String getNombreAr() {
        return nombreAr;
    }

    public void setNombreAr(String nombreAr) {
        this.nombreAr = nombreAr;
    }

  

}
