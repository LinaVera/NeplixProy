package neplixmvc.modelo;

public class Personaje {

    private String nombre;
    private Integer cod_personaje;
    //agregación
    private Capitulo cod_capitulo;
    private Actor cod_actor;

    public Personaje() {
    }

    public Personaje(String nombre, Integer cod_personaje, Capitulo cod_capitulo, Actor cod_actor) {
        this.nombre = nombre;
        this.cod_personaje = cod_personaje;
        this.cod_capitulo = cod_capitulo;
        this.cod_actor = cod_actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCod_personaje() {
        return cod_personaje;
    }

    public void setCod_personaje(Integer cod_personaje) {
        this.cod_personaje = cod_personaje;
    }

    public Capitulo getCod_capitulo() {
        return cod_capitulo;
    }

    public void setCod_capitulo(Capitulo cod_capitulo) {
        this.cod_capitulo = cod_capitulo;
    }

    public Actor getCod_actor() {
        return cod_actor;
    }

    public void setCod_actor(Actor cod_actor) {
        this.cod_actor = cod_actor;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", cod_personaje=" + cod_personaje + ", cod_capitulo=" + cod_capitulo + ", cod_actor=" + cod_actor + '}';
    }
    

    
}
