package neplixmvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import neplixmvc.modelo.*;
import neplixmvc.vista.*;

public class Controlador implements ActionListener {

    private Entrar e = null;
    private A_menu amenu = null;
    //1.Serie
    private R_Series rserie = null;
    private Serie serie = null;
    private U_VerTemporada vtempo = null;
    //2.Actor
    private R_Actor ractor = null;
    private Actor actor = null;
    //3.Capitulo
    private R_Capitulo rcap = null;
    private Capitulo cap = null;
    private U_VerCapitulo vcap = null;
    //4.personaje
    private R_Personajes rpe = null;
    private Personaje pe = null;
    //5.subtitulo
    private R_Subtitulos rsub = null;
    private Subtitulo sub = null;
    //6.temporada
    private R_Temporadas rtemp = null;
    private Temporada temp = null;
    //7.Critica
    private Critica cri = null;
    private U_Critica rcri = null;
    //8.Usuario
    private Usuario usu = null;
    private R_Usuario rusu = null;

    public Controlador(A_menu amenu, Entrar e,
            R_Series rserie, Serie serie, U_VerTemporada vtemp,
            R_Actor ractor, Actor actor,
            R_Capitulo rcap, Capitulo cap, U_VerCapitulo vcap,
            R_Personajes rpePersonaje, Personaje personaje,
            R_Subtitulos rsub, Subtitulo sub,
            R_Temporadas rtemp, Temporada temp,
            Critica cri, U_Critica rcri,
            Usuario usu, R_Usuario rusu) {
        super();
        //menu y entrar
        this.e = e;
        this.amenu = amenu;
        amenu.setVisible(true);
        //registros
        this.rserie = rserie;
        this.serie = serie;
        this.vtempo = vtemp; //       
        this.ractor = ractor;
        this.actor = actor;  //      
        this.rcap = rcap;
        this.cap = cap;
        this.vcap = vcap;//        
        this.rpe = rpePersonaje;
        this.pe = personaje;//        
        this.rsub = rsub;
        this.sub = sub;//        
        this.rtemp = rtemp;
        this.temp = temp;//
        this.cri = cri;
        this.rcri = rcri;
        this.usu = usu;
        this.rusu = rusu;
        // rusu.setVisible(true);
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        //Menu
        amenu.jButton1.addActionListener(controlador);
        amenu.jButton2.addActionListener(controlador);
        amenu.jButton3.addActionListener(controlador);
        amenu.jButton4.addActionListener(controlador);
        amenu.jButton5.addActionListener(controlador);
        amenu.jButton6.addActionListener(controlador);
        amenu.jButton7.addActionListener(controlador);
        //Registros
        rserie.btnRegistrarSerie.addActionListener(controlador);
        rserie.jButton5.addActionListener(controlador);
        ractor.btnRegistrarActor.addActionListener(controlador);
        rcap.jButton3.addActionListener(controlador);
        rcap.jButton6.addActionListener(controlador);
        rcri.jButton2.addActionListener(controlador);
        rsub.btnRegistrarSubtitulos.addActionListener(controlador);
        rpe.btnRegistrarPersonaje.addActionListener(controlador);
        rusu.btnRegistrarUsuario.addActionListener(controlador);
        rtemp.btnRegistrarTemporada.addActionListener(controlador);
    }

    @Override

    public void actionPerformed(ActionEvent ae) {
        try {
            //menu
            switch (ae.getActionCommand()) {
                case "Series":
                    System.out.println("Series");
                    rserie.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Temporadas":
                    System.out.println("Temporadas");
                    rtemp.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Capítulos":
                    System.out.println("Capítulos");
                    rcap.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Subtítulos":
                    System.out.println("Subtítulos");
                    rsub.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Actor":
                    System.out.println("Actor");
                    ractor.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Personaje":
                    System.out.println("Personaje");
                    rpe.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Salir":
                    System.out.println("Salir");
                    e.setVisible(true);
                    amenu.setVisible(false);
                    break;
                case "Volver":
                    System.out.println("Volver");
                    amenu.setVisible(true);

                    break;
                default:
                    break;
            }
            //1.Registros Actor
            if (ae.getActionCommand().contentEquals("RegistrarActor")) {

                String nombre = this.ractor.txtNombreRealActor.getText();
                Integer cod_actor = Integer.parseInt(this.ractor.txtCodigoActor.getText());
                String nombreAr = this.ractor.btnNombreArtistico.getText();

                actor.setCod_actor(cod_actor);
                actor.setNombre(nombre);
                actor.setNombreAr(nombreAr);
                String oo = String.valueOf(actor.getCod_actor());
                ractor.jTextArea1.setText("Nombre del actor: " + actor.getNombre()
                        + "\nCódigo: " + oo
                        + "\nNombre artistico: " + actor.getNombreAr());

            } //2.Registrar serie
            else if (ae.getActionCommand().contentEquals("RegistrarSerie")) {

                int id_serie = Integer.parseInt(this.rserie.jTextField5.getText());
                String titulo = this.rserie.jTextField1.getText();
                String anio = this.rserie.jTextField4.getText();
                String sinopsis = this.rserie.jTextArea1.getText();
                Integer genero = this.rserie.jComboBox1.getSelectedIndex();

                serie.setCod_serie(id_serie);
                serie.setTitulo(titulo);
                serie.setAno_inicio(anio);
                serie.setSinopsis(sinopsis);
//              serie.getCod_genero().setCod_genero(genero);

            /*    vtempo.setVisible(true);
                vtempo.jLabel1.setText(serie.getTitulo());
                vtempo.jLabel2.setText(serie.getSinopsis());
                vtempo.jButton7.setText(serie.getAno_inicio());
*/
                System.out.println("Código de serie: " + serie.getCod_serie()
                        + "\nTítulo: " + serie.getTitulo()
                        + "\nAño de inicio: " + serie.getAno_inicio()
                        + "\nSinopsis: " + serie.getSinopsis()
                        + "\nGenero: " + serie.getCod_serie());

            }
            //3.Registros capitulo
            if (ae.getActionCommand().contentEquals("RegistrarCapitulo")) {
                String titulo = this.rcap.jTextField4.getText();
                String duracion = this.rcap.jTextField5.getText();
                String sinopsis = this.rcap.jTextArea2.getText();
                Integer cod_capitulo = Integer.parseInt(this.rcap.jTextField1.getText());
                Integer cod_tempo = Integer.parseInt(this.rcap.jTextField3.getText());
                
                cap.setTitulo(titulo);
                cap.setDuracion(duracion);
                cap.setSinopsis(sinopsis);
                cap.setCod_capitulo(cod_capitulo);
               // cap.getCod_tempoTemporada().setCod_temporada(cod_tempo);

              /*  vcap.setVisible(true);
                vcap.jLabel1.setText(cap.getTitulo());
                vcap.jLabel2.setText(cap.getSinopsis());
                vcap.jLabel3.setText(cap.getDuracion());
*/
                System.out.println("Título de capítulo: " + cap.getTitulo()
                        + "\nDuracion: " + cap.getDuracion()
                        + "\nSinopsis: " + cap.getSinopsis()
                        + "\nCódigo del Capítulo: " + cap.getCod_capitulo()
                      /*+ "\nCódigo temporada: " + cap.getCod_tempoTemporada()*/);

            } //4.Registrar Critica-configurar vista usuario
            else if (ae.getActionCommand().contentEquals("GuardarCritica")) {
                String fechaC = this.rcri.jLabel1.getText();
                String critica = this.rcri.jTextArea1.getText();
                //prueba
                Integer cod_critica = (int) (100 * Math.random());
                Integer tipo_critica = 2;

                cri.setTipo_critica(tipo_critica);
                cri.setFechaC(fechaC);
                cri.setCritica(critica);
                cri.setCod_critica(cod_critica);

                System.out.println("Tipo de Critica: " + cri.getCritica()
                        + "\nFecha: " + cri.getFechaC()
                        + "\nCódigo de critica: " + cri.getCod_critica()
                        + "Critica: " + cri.getCritica());
            } //5.Registros subtítulos
            else if (ae.getActionCommand().contentEquals("RegistrarSub")) {
                String idioma = this.rsub.jTextField3.getText();
                String autor = this.rsub.jTextField4.getText();
                // Integer cod_subtitulo = Integer.parseInt(this.rsub.jTextField1.getText());

                sub.setAutor(autor);
                //sub.setCod_subtitulo(cod_subtitulo);
                sub.setIdioma(idioma);

                System.out.println("Código de subtítulo: " + sub.getCod_subtitulo()
                        + "\nAutor: " + sub.getAutor()
                        + "Idioma: " + sub.getIdioma());

            } //6.Registros personaje
            else if (ae.getActionCommand().contentEquals("RegistrarPersonaje")) {
                String nombre = this.rpe.jTextField2.getText();
                Integer cod_personaje = Integer.parseUnsignedInt(this.rpe.jTextField1.getText());
                Integer cod_capitulo = Integer.parseUnsignedInt(this.rpe.jTextField3.getText());
                Integer cod_actor = Integer.parseUnsignedInt(this.rpe.jTextField4.getText());

                //pe.getCod_actor().setCod_actor(cod_actor);
                // pe.getCod_capitulo().setCod_capitulo(cod_capitulo);
                pe.setNombre(nombre);
                pe.setCod_personaje(cod_personaje);
                rpe.jTextArea1.setText("Nombre: " + pe.getNombre()
                        + "\nCódigo personaje: " + pe.getCod_personaje()
                        + "\nCódigo actor: " + pe.getCod_actor()
                        + "\nCódigo capítulo" + pe.getCod_capitulo());

            } //7.Registros usuario
            else if (ae.getActionCommand().contentEquals("RegistrarUsuario")) {
                String nombre = this.rusu.txtNombreUsuario.getText();
                String apellido = this.rusu.txtApellidoUsuario.getText();
                String email = this.rusu.txtCorreo.getText();
                String dia = String.valueOf(this.rusu.jComboBox1.getSelectedIndex()),
                        mes = String.valueOf(this.rusu.jComboBox2.getSelectedIndex()),
                        anio = String.valueOf(this.rusu.jComboBox1.getSelectedIndex());
                String fechaNac = dia + "/" + mes + "/" + anio;
                Integer cod_usuario = Integer.parseUnsignedInt(this.rusu.txtCedula.getText());
                String contraseña = this.rusu.txtContraseñaU.getText();

                usu.setNombre(nombre);
                usu.setApellido(apellido);
                usu.setCod_usuario(cod_usuario);
                usu.setContraseña(contraseña);
                usu.setFechaNac(fechaNac);
                usu.setEmail(email);

                System.out.println("Nombre: " + usu.getNombre()
                        + "\nApellido: " + usu.getApellido()
                        + "\nCédula: " + usu.getCod_usuario()
                        + "\nContraseña: " + usu.getContraseña()
                        + "\nCorreo eléctronico: " + usu.getEmail()
                        + "\nFecha de nacimiento" + usu.getFechaNac());

            } //8.Registros temporada
            else if (ae.getActionCommand().contentEquals("RegistrarTemporada")) {
                String dia = String.valueOf(this.rtemp.jComboBox1.getSelectedIndex()),
                        mes = String.valueOf(this.rtemp.jComboBox3.getSelectedIndex()),
                        anio = String.valueOf(this.rtemp.jComboBox6.getSelectedIndex());
                String fechaP = dia + "/" + mes + "/" + anio;;
                String dia2 = String.valueOf(this.rtemp.jComboBox2.getSelectedIndex()),
                        mes2 = String.valueOf(this.rtemp.jComboBox4.getSelectedIndex()),
                        anio2 = String.valueOf(this.rtemp.jComboBox5.getSelectedIndex());
                String fechaE = dia2 + "/" + mes2 + "/" + anio2;
                Integer cod_temporada = Integer.parseInt(this.rtemp.jTextField7.getText());
                Integer cod_serie = Integer.parseInt(this.rtemp.jTextField8.getText());
                Integer cod_cap = Integer.parseInt(this.rtemp.jTextField6.getText());

                temp.setFechaE(fechaE);
                temp.setFechaP(fechaP);
                temp.setCod_temporada(cod_temporada);
                // temp.getCod_serie().setCod_serie(cod_serie);
                //temp.getCod_cap().setCod_capitulo(cod_cap);

                System.out.println("Código temporada: " + temp.getCod_temporada()
                        + "\nFecha de producción: " + temp.getFechaP()
                        + "\nFecha estreno: " + temp.getFechaE()
                        + "\nCódigo serie: " + temp.getCod_serie()
                        + "\nCódigo capítulo: " + temp.getCod_cap());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
