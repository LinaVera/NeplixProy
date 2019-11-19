 package neplixmvc.modelo;

public class Serie {

    private Integer cod_serie;
    private String titulo;
    private String ano_inicio;
    private String sinopsis;
    private Boolean favorita;
    private Integer puntaje;
    private String ruta_img;
    //agrega
    private Genero Cod_genero;
    //compo
    private Temporada cod_tempo;

    public Serie() {
        this.cod_tempo = new Temporada();
    }

    public Serie(Integer cod_serie, String titulo, String ano_inicio, String sinopsis, Boolean favorita, Integer puntaje, String ruta_img, Genero Cod_genero, Temporada cod_tempo) {
        this.cod_serie = cod_serie;
        this.titulo = titulo;
        this.ano_inicio = ano_inicio;
        this.sinopsis = sinopsis;
        this.favorita = favorita;
        this.puntaje = puntaje;
        this.ruta_img = ruta_img;
        this.Cod_genero = Cod_genero;

        this.cod_tempo = new Temporada();
    }

    public Integer getCod_serie() {
        return cod_serie;
    }

    public void setCod_serie(Integer cod_serie) {
        this.cod_serie = cod_serie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno_inicio() {
        return ano_inicio;
    }

    public void setAno_inicio(String ano_inicio) {
        this.ano_inicio = ano_inicio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Boolean getFavorita() {
        return favorita;
    }

    public void setFavorita(Boolean favorita) {
        this.favorita = favorita;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getRuta_img() {
        return ruta_img;
    }

    public void setRuta_img(String ruta_img) {
        this.ruta_img = ruta_img;
    }

    public Genero getCod_genero() {
        return Cod_genero;
    }

    public void setCod_genero(Genero Cod_genero) {
        this.Cod_genero = Cod_genero;
    }

    public Temporada getCod_tempo() {
        return cod_tempo;
    }

    public void setCod_tempo(Temporada cod_tempo) {
        this.cod_tempo = cod_tempo;
    }

    @Override
    public String toString() {
        return "Serie{" + "cod_serie=" + cod_serie + ", titulo=" + titulo + ", ano_inicio=" + ano_inicio + ", sinopsis=" + sinopsis + ", favorita=" + favorita + ", puntaje=" + puntaje + ", ruta_img=" + ruta_img + ", Cod_genero=" + Cod_genero + ", cod_tempo=" + cod_tempo + '}';
    }

}
