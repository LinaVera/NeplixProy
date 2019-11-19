package neplixmvc.principal;

import neplixmvc.controlador.Controlador;
import neplixmvc.modelo.*;
import neplixmvc.vista.*;

public class Principal {

    public static void main(String[] args) {
        Entrar e = new Entrar();
        A_menu amenu = new A_menu();

        R_Series rserie = new R_Series();
        Serie serie = new Serie();
        U_VerTemporada vtemp = new U_VerTemporada();

        R_Actor ractor = new R_Actor();
        Actor actor = new Actor();

        R_Capitulo rcap = new R_Capitulo();
        Capitulo cap = new Capitulo();
        U_VerCapitulo vcap = new U_VerCapitulo();

        R_Personajes rpePersonaje = new R_Personajes();
        Personaje personaje = new Personaje();

        R_Subtitulos rsub = new R_Subtitulos();
        Subtitulo sub = new Subtitulo();

        R_Temporadas rtemp = new R_Temporadas();
        Temporada temp = new Temporada();

        Critica cri = new Critica();
        U_Critica rcri = new U_Critica();

        Usuario usu = new Usuario();
        R_Usuario rusu = new R_Usuario();
        Controlador c = new Controlador(amenu, e, rserie, serie, vtemp, ractor,
                actor, rcap, cap, vcap, rpePersonaje, personaje, rsub, sub,
                rtemp, temp, cri, rcri, usu, rusu);
    }

}
