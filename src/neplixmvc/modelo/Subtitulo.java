package neplixmvc.modelo;


public class Subtitulo {

    private String idioma;
    private String autor;
    private Integer cod_subtitulo;

    public Subtitulo() {
    }

    public Subtitulo(String idioma, String autor, Integer cod_subtitulo, Integer cod_capitulo) {
        this.idioma = idioma;
        this.autor = autor;
        this.cod_subtitulo = cod_subtitulo;

    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCod_subtitulo() {
        return cod_subtitulo;
    }

    public void setCod_subtitulo(Integer cod_subtitulo) {
        this.cod_subtitulo = cod_subtitulo;
    }

    @Override
    public String toString() {
        return "Subtitulo{" + "idioma=" + idioma
                + ", autor=" + autor + ", cod_subtitulo="
                + cod_subtitulo + '}';
    }

}
