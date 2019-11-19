package neplixmvc.modelo;


public class Capitulo {

    private String titulo;
    private String duracion;
    private String sinopsis;
    private boolean estado;
    private Integer cod_capitulo;
    //agre
    private Temporada cod_tempoTemporada;
    private Subtitulo cod_subtitulos;

    public Capitulo() {
    }

    public Capitulo(String titulo, String duracion, String sinopsis, boolean estado, Integer cod_capitulo, Temporada cod_tempoTemporada, Subtitulo cod_subtitulos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.estado = estado;
        this.cod_capitulo = cod_capitulo;
        this.cod_tempoTemporada = cod_tempoTemporada;
        this.cod_subtitulos = cod_subtitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   public Integer getCod_capitulo() {
        return cod_capitulo;
    }

    public void setCod_capitulo(Integer cod_capitulo) {
        this.cod_capitulo = cod_capitulo;
    }

    public Temporada getCod_tempoTemporada() {
        return cod_tempoTemporada;
    }

    public void setCod_tempoTemporada(Temporada cod_tempoTemporada) {
        this.cod_tempoTemporada = cod_tempoTemporada;
    }

    public Subtitulo getCod_subtitulos() {
        return cod_subtitulos;
    }

    public void setCod_subtitulos(Subtitulo cod_subtitulos) {
        this.cod_subtitulos = cod_subtitulos;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "titulo=" + titulo + ", duracion=" + duracion + ", sinopsis=" + sinopsis + ", estado=" + estado + ", cod_capitulo=" + cod_capitulo + ", cod_tempoTemporada=" + cod_tempoTemporada + ", cod_subtitulos=" + cod_subtitulos + '}';
    }

  

}
