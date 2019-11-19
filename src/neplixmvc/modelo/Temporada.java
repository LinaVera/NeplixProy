package neplixmvc.modelo;


public class Temporada {

    private String fechaP;
    private String fechaE;
    private boolean estado;
    private Integer cod_temporada;
    ///agrega
    private Serie cod_serie;
    //compo
    private Capitulo cod_cap;

    public Temporada() {
        this.cod_cap = new Capitulo();
    }

    public Temporada(String fechaP, String fechaE, boolean estado, Integer cod_temporada, Serie  cod_serie, Capitulo cod_cap) {
        this.fechaP = fechaP;
        this.fechaE = fechaE;
        this.estado = estado;
        this.cod_temporada = cod_temporada;
        this.cod_serie = cod_serie;
        this.cod_cap = new Capitulo();
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getCod_temporada() {
        return cod_temporada;
    }

    public void setCod_temporada(Integer cod_temporada) {
        this.cod_temporada = cod_temporada;
    }

    public Serie  getCod_serie() {
        return cod_serie;
    }

    public void setCod_serie(Serie  cod_serie) {
        this.cod_serie = cod_serie;
    }

    public Capitulo getCod_cap() {
        return cod_cap;
    }

    public void setCod_cap(Capitulo cod_cap) {
        this.cod_cap = cod_cap;
    }

    @Override
    public String toString() {
        return "Temporada{" + "fechaP=" + fechaP + ", fechaE=" + fechaE + ", estado=" + estado + ", cod_temporada=" + cod_temporada + ", cod_serie=" + cod_serie + ", cod_cap=" + cod_cap + '}';
    }
}
