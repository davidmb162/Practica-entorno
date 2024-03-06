package Trabajo_Prog_2T;

import javax.print.attribute.standard.PageRanges;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
//tenemos interfaces!!!!!!?
public class Interfaz {
    public static String IataOrigen;
    public static String IataDestino;

    public static void main(String[] args) {
        LocalDate fecha = null;
        PilotoAPV pilotoAPV = new PilotoAPV();
        ApoyoPuntoVenta apoyoPuntoVenta = new ApoyoPuntoVenta(fecha);

        JFrame marco = new JFrame();
        JPanel Paneltitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel titulo = new JLabel("PUNTO DE VENTA DE BILLETES");
        Font fuente = new Font("Verdana", Font.BOLD, 20);

        JPanel Panelmodalidad = new JPanel();
        Border borde = BorderFactory.createTitledBorder("Modalidad");
        JRadioButton boton1 = new JRadioButton("Ida solo");
        JRadioButton boton2 = new JRadioButton("Ida y vuelta");
        ButtonGroup botones = new ButtonGroup();
        botones.add(boton1);
        botones.add(boton2);

        Panelmodalidad.add(boton1);
        Panelmodalidad.add(boton2);
        Panelmodalidad.setBorder(borde);


        JPanel Panelviaje = new JPanel();
        Border borde1 = BorderFactory.createTitledBorder("Fecha ida");
        Panelviaje.setBorder(borde1);
        String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


        JPanel PanelViajMod = new JPanel();
        PanelViajMod.setLayout(new BoxLayout(PanelViajMod, BoxLayout.Y_AXIS));
        JLabel label1 = new JLabel("Dia");
        SpinnerModel model = new SpinnerNumberModel(1, 1, 31, 1);
        JSpinner dia = new JSpinner(model);
        JLabel label2 = new JLabel("Mes");
        SpinnerModel model2 = new SpinnerListModel(Meses);
        model2.setValue("Septiembre");
        JSpinner mes = new JSpinner(model2);

        mes.setPreferredSize(new Dimension(80, 20));

        JLabel label3 = new JLabel("Año");
        SpinnerModel model3 = new SpinnerNumberModel(2022, 2022, 3000, 1);
        JSpinner anio = new JSpinner(model3);
        Panelviaje.add(label1);
        PanelViajMod.add(Panelviaje);
        Panelviaje.add(dia);
        Panelviaje.add(label2);
        Panelviaje.add(mes);
        Panelviaje.add(label3);
        Panelviaje.add(anio);


        JPanel PanelviajeVu = new JPanel();
        Border borde2 = BorderFactory.createTitledBorder("Fecha vuelta");
        PanelviajeVu.setBorder(borde2);
        String[] Meses2 = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


        JPanel PanelViajMod2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        PanelViajMod2.setLayout(new BoxLayout(PanelViajMod2, BoxLayout.Y_AXIS));
        JLabel label4 = new JLabel("Dia");
        SpinnerModel model4 = new SpinnerNumberModel(1, 1, 31, 1);
        JSpinner dia2 = new JSpinner(model4);
        JLabel label5 = new JLabel("Mes");
        SpinnerModel model5 = new SpinnerListModel(Meses2);
        model5.setValue("Septiembre");
        JSpinner mes2 = new JSpinner(model5);

        mes2.setPreferredSize(new Dimension(80, 20));
        JLabel label6 = new JLabel("Año");
        SpinnerModel model6 = new SpinnerNumberModel(2022, 2022, 3000, 1);
        JSpinner anio2 = new JSpinner(model6);

        PanelViajMod2.add(PanelviajeVu);
        PanelviajeVu.add(label4);
        PanelviajeVu.add(dia2);
        PanelviajeVu.add(label5);
        PanelviajeVu.add(mes2);
        PanelviajeVu.add(label6);
        PanelviajeVu.add(anio2);

        boton1.addActionListener(e -> {
            {
                PanelviajeVu.setEnabled(false);
                dia2.setEnabled(false);
                mes2.setEnabled(false);
                anio2.setEnabled(false);


            }
        });
        boton2.addActionListener(e -> {
            {
                PanelviajeVu.setEnabled(true);
                dia2.setEnabled(true);
                mes2.setEnabled(true);
                anio2.setEnabled(true);


            }
        });
        dia.addChangeListener(e -> {
            if (boton2.isSelected()) {
                dia2.setValue(dia.getValue());
            }
        });
        mes.addChangeListener(e -> {
            if (boton2.isSelected()) {
                mes2.setValue(mes.getValue());
            }
        });
        anio.addChangeListener(e -> {
            if (boton2.isSelected()) {
                anio2.setValue(anio.getValue());
            }
        });


        JPanel Tra = new JPanel();
        JPanel Origen = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Origen.setLayout(new BoxLayout(Origen, BoxLayout.Y_AXIS));
        JLabel label7 = new JLabel("Origen:");
        JComboBox origen = new JComboBox();
        origen.setEditable(false);
        origen.addItem("------------");
        origen.addItem("Sevilla");
        origen.addItem("Madrid");
        origen.addItem("Barcelona");
        origen.addItem("Valencia");
        origen.addItem("Bilbao");
        origen.addItem("Málaga");
        origen.addItem("A Coruña");
        origen.addItem("Santander");
        origen.addItem("Asturias");


        JPanel Tra2 = new JPanel();
        JPanel Destino = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Destino.setLayout(new BoxLayout(Destino, BoxLayout.Y_AXIS));
        JLabel label8 = new JLabel("Destino:");
        JComboBox destino = new JComboBox();
        destino.setEditable(false);
        destino.addItem("------------");
        destino.addItem("Madrid");
        destino.addItem("Sevilla");
        destino.addItem("Barcelona");
        destino.addItem("Valencia");
        destino.addItem("Bilbao");
        destino.addItem("Málaga");
        destino.addItem("A Coruña");
        destino.addItem("Santander");
        destino.addItem("Asturias");
        ArrayList<String> seleccionados = new ArrayList<>();

        JPanel veri = new JPanel();
        JPanel Perso = new JPanel();
        PanelViajMod2.setLayout(new BoxLayout(PanelViajMod2, BoxLayout.Y_AXIS));
        JLabel  personas = new JLabel("Nº de personas");
        SpinnerModel conteo  = new SpinnerNumberModel(1, 1, 10, 1);
        JSpinner contaso = new JSpinner(conteo);
        JButton boton3 = new JButton("Buscar");

        destino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (destino.getSelectedIndex() > 0) {
                    if (destino.getSelectedItem() == origen.getSelectedItem()) {
                        JOptionPane.showMessageDialog(null, "El destino no puede ser igual al origen", "Error", JOptionPane.ERROR_MESSAGE);
                        destino.setSelectedIndex(0);
                    }
                }

            }
        });
        origen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (origen.getSelectedIndex() > 0) {
                    if (origen.getSelectedItem() == destino.getSelectedItem()) {
                        JOptionPane.showMessageDialog(null, "El destino no puede ser igual al origen", "Error", JOptionPane.ERROR_MESSAGE);
                        origen.setSelectedIndex(0);
                    }
                }
            }
        });



        Origen.add(Tra);
        Destino.add(Tra2);
        Tra.add(label7);
        Tra.add(origen);
        Tra2.add(label8);
        Tra2.add(destino);
        veri.add(Perso);
        Perso.add(personas);
        Perso.add(contaso);
        Perso.add(boton3);


        JPanel Trayecto = new JPanel();
        Border borde3 = BorderFactory.createTitledBorder("Trayecto");
        Trayecto.setBorder(borde3);
        Trayecto.setLayout(new BoxLayout(Trayecto, BoxLayout.Y_AXIS));
        Trayecto.add(Origen);
        Trayecto.add(Destino);
        Trayecto.add(veri);


//Tercer Bloque

        JPanel Panelslider = new JPanel();
        Border border1 = BorderFactory.createTitledBorder("Asiento");
        Panelslider.setBorder(border1);


        JLabel asiento = new JLabel();
        JSlider asientos = new JSlider(1, 26, 1);
        asientos.setPaintTrack(true);
        asientos.setPaintTicks(true);
        asientos.setPaintLabels(true);
        asientos.setMajorTickSpacing(5);
        asientos.setMinorTickSpacing(2);
        asientos.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                asiento.setText("Filas = " + asientos.getValue());
            }
        });
        Panelslider.add(asiento);
        Panelslider.add(asientos);
        asiento.setText("Filas = " + asientos.getValue());
        Panelslider.setBorder(border1);
        Panelslider.setVisible(false);


        JPanel Panelposicion = new JPanel();
        Border border2 = BorderFactory.createTitledBorder("Posición");
        Panelposicion.setBorder(border2);

        JRadioButton button1 = new JRadioButton("Pasillo");
        JRadioButton button2 = new JRadioButton("Centro");
        JRadioButton button3 = new JRadioButton("Ventana");
        ButtonGroup button = new ButtonGroup();
        button.add(button1);
        button.add(button2);
        button.add(button3);

        Panelposicion.add(button1);
        Panelposicion.add(button2);
        Panelposicion.add(button3);
        Panelposicion.setBorder(border2);
        Panelposicion.setVisible(false);

        JPanel Panelcheck = new JPanel();
        Border border3 = BorderFactory.createTitledBorder("Extras");
        Panelcheck.setBorder(border3);

        JCheckBox check1 = new JCheckBox("Embarque Prior.");
        JCheckBox check2 = new JCheckBox("Equipaje");
        Panelcheck.add(check1);
        Panelcheck.add(check2);
        Panelcheck.setBorder(border3);
        Panelcheck.setVisible(false);

        JPanel Panelcampos = new JPanel();

        JLabel asientaso = new JLabel();
        asientaso.setText("Asiento:");
        JTextField campotexto1=new JTextField(10);
        JLabel embarcaso = new JLabel();
        JTextField campotexto2=new JTextField(10);
        embarcaso.setText("Embarque:");
        JLabel equipaso = new JLabel();
        JTextField campotexto3=new JTextField(10);
        equipaso.setText("Equipaje:");
        Panelcampos.add(asientaso);
        Panelcampos.add(campotexto1);
        Panelcampos.add(embarcaso);
        Panelcampos.add(campotexto2);
        Panelcampos.add(equipaso);
        Panelcampos.add(campotexto3);


        JPanel preciofinal = new JPanel();
        JLabel preciofinaliso = new JLabel();
        JTextField campotexto4=new JTextField(15);
        preciofinaliso.setText("Precio Final:");
        Font fuente2 = new Font("Verdana", Font.BOLD, 20);
        preciofinaliso.setFont(fuente2);
        preciofinal.add(preciofinaliso);
        preciofinal.add(campotexto4);

        JPanel Panelbotonaci = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Panelbotonaci.setLayout(new BoxLayout(Panelbotonaci, BoxLayout.Y_AXIS));
        Panelbotonaci.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        Icon icono = new ImageIcon("src/Trabajo_Prog_2T/aceptar.png");
        JButton botontick = new JButton(icono);
        Icon icono2 = new ImageIcon("src/Trabajo_Prog_2T/rechazar.png");
        JButton botonmal = new JButton(icono2);
        Panelbotonaci.add(botontick);
        Panelbotonaci.add(botonmal);



        JPanel Paneldetalles = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Border border = BorderFactory.createTitledBorder("Detalles");
        Paneldetalles.setLayout(new BoxLayout(Paneldetalles, BoxLayout.Y_AXIS));
        Paneldetalles.setBorder(border);
        Paneldetalles.add(Panelslider);
        Paneldetalles.add(Panelposicion);
        Paneldetalles.add(Panelcheck);

        JPanel Panelimportes = new JPanel();
        Border border6 = BorderFactory.createTitledBorder("Importes");
        Panelimportes.setLayout(new BoxLayout(Panelimportes, BoxLayout.Y_AXIS));
        Panelimportes.setBorder(border6);

        Panelimportes.add(Panelcampos);
        Panelimportes.add(preciofinal);
        Panelimportes.add(Panelbotonaci);

        Panelimportes.setVisible(false);

        JPanel Panelbilletes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Border border7 = BorderFactory.createTitledBorder("Billete");
        Panelbilletes.setLayout(new BoxLayout(Panelbilletes, BoxLayout.X_AXIS));
        Panelbilletes.setBorder(border7);
        ImageIcon billeteida = new ImageIcon("src/Trabajo_Prog_2T/ico_bill_av_ida.png");
        ImageIcon billetevuelta = new ImageIcon("src/Trabajo_Prog_2T/ico_bill_av_iv.png");
        JLabel billete1 = new JLabel(billeteida);
        JLabel billete2 = new JLabel(billetevuelta);
        Panelbilletes.add(billete1);
        Panelbilletes.add(billete2);
        Panelbilletes.setVisible(false);

        asientos.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = asientos.getValue();
                if (valor >= 1 );
            }
        });

        JPanel PanelCentro = new JPanel();
        new JPanel(new FlowLayout(FlowLayout.CENTER));
        PanelCentro.setLayout(new BoxLayout(PanelCentro, BoxLayout.Y_AXIS));
        PanelCentro.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        titulo.setFont(fuente);
        Paneltitulo.add(titulo);
        Paneltitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        Paneltitulo.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        JPanel Contenido1izquierda = new JPanel();
        Contenido1izquierda.setLayout(new BoxLayout(Contenido1izquierda, BoxLayout.Y_AXIS));
        Contenido1izquierda.add(Panelmodalidad);
        Contenido1izquierda.add(PanelViajMod);
        Contenido1izquierda.add(PanelViajMod2);


        JPanel Contenido1derecha = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Contenido1derecha.setLayout(new BoxLayout(Contenido1derecha, BoxLayout.Y_AXIS));
        Contenido1derecha.add(Trayecto, BorderLayout.NORTH);

        JPanel Contenidoarriba = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Contenidoarriba.add(Paneltitulo);

        JPanel ContenidoArriba2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ContenidoArriba2.setLayout(new BoxLayout(ContenidoArriba2, BoxLayout.X_AXIS));
        ContenidoArriba2.add(Contenido1izquierda);
        ContenidoArriba2.add(Contenido1derecha);
        ContenidoArriba2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        JPanel panelaso = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelaso.setLayout(new BoxLayout(panelaso, BoxLayout.Y_AXIS));
        panelaso.add(Panelimportes);
        panelaso.add(Panelbilletes);



        JPanel Contenidoabajo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Contenidoabajo.add(Paneldetalles, BorderLayout.WEST);
        Contenidoabajo.add(panelaso, BorderLayout.EAST);
        Contenidoabajo.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        JPanel Contenidogeneral = new JPanel();
        Contenidogeneral.setLayout(new BoxLayout(Contenidogeneral, BoxLayout.Y_AXIS));
        Contenidogeneral.add(Contenidoarriba);
        Contenidogeneral.add(ContenidoArriba2);
        Contenidogeneral.add(Contenidoabajo);




        boton3.addActionListener(e -> {
            {
                int eleccion = 0;
                if (origen.getSelectedIndex() == 0 || destino.getSelectedIndex() == 0) {

                    JOptionPane.showMessageDialog(null, "Tienes que seleccionar una ubicación", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (boton1.isSelected() == false && boton2.isSelected() == false) {
                    JOptionPane.showMessageDialog(null, "Tienes que seleccionar una modalidad", "Error", JOptionPane.ERROR_MESSAGE);
                } else {


                    String[] buttones = {"Si", "No", "Cancelar"};

                    if (boton1.isSelected()) {
                        eleccion = JOptionPane.showOptionDialog(null, "Ida:" + origen.getSelectedItem() + "/" + destino.getSelectedItem() + " " + dia.getValue() + "-" + mes.getValue() + "-" + anio.getValue() + "\n(" + contaso.getValue() + " persona)", "Seleccionar una opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttones, buttones[0]);
                    } else if (boton2.isSelected()) {
                        eleccion = JOptionPane.showOptionDialog(null, "Ida:" + origen.getSelectedItem() + "/" + destino.getSelectedItem() + " " + dia.getValue() + "-" + mes.getValue() + "-" + anio.getValue() + "\nVuelta:" + destino.getSelectedItem() + "/" + origen.getSelectedItem() + " " + dia2.getValue() + "-" + mes2.getValue() + "-" + anio2.getValue() + "\n(" + contaso.getValue() + " persona)", "Seleccionar una opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttones, buttones[0]);
                        ;
                    }
                    if (eleccion == JOptionPane.YES_OPTION) {

                        JPanel PanelVuelosDisponibles = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        PanelVuelosDisponibles.setLayout(new BoxLayout(PanelVuelosDisponibles, BoxLayout.X_AXIS));
                        JLabel subtitulo = new JLabel("LOS VUELOS DISPONIBLES SON:");
                        Font fuenteVD = new Font("Verdana", Font.BOLD, 10);
                        subtitulo.setFont(fuenteVD);
                        PanelVuelosDisponibles.add(subtitulo, BorderLayout.CENTER);


                        IataOrigen = (String) origen.getSelectedItem();
                        IataDestino = (String) destino.getSelectedItem();
                        apoyoPuntoVenta.opcion5(IataOrigen, IataDestino);
                        JRadioButton boton1VD = new JRadioButton(apoyoPuntoVenta.iata + "-" + apoyoPuntoVenta.iata2 + "  " + apoyoPuntoVenta.data + "  " + apoyoPuntoVenta.minTotal + "  " + apoyoPuntoVenta.preciocentimos.format(apoyoPuntoVenta.precioramdom));
                        JRadioButton boton2VD = new JRadioButton(apoyoPuntoVenta.iata + "-" + apoyoPuntoVenta.iata2 + "  " + apoyoPuntoVenta.data2 + "  " + apoyoPuntoVenta.minTotal2 + "  " + apoyoPuntoVenta.preciocentimos2.format(apoyoPuntoVenta.precioramdom2));
                        ButtonGroup botones2 = new ButtonGroup();
                        botones2.add(boton1VD);
                        botones2.add(boton2VD);

                        JPanel Ida = new JPanel(new GridLayout(0, 1));
                        Border borde1VD = BorderFactory.createTitledBorder("Ida");
                        Ida.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 1));

                        Ida.setBorder(borde1VD);

                        Ida.add(boton1VD, BorderLayout.WEST);
                        Ida.add(boton2VD, BorderLayout.WEST);

                        JPanel Vuelta = new JPanel(new GridLayout(0, 1));
                        JRadioButton boton3VD = new JRadioButton(apoyoPuntoVenta.iata3 + "-" + apoyoPuntoVenta.iata4 + "  " + apoyoPuntoVenta.data3 + "  " + apoyoPuntoVenta.minTotal3 + "  " + apoyoPuntoVenta.preciocentimos3.format(apoyoPuntoVenta.precioramdom3));
                        JRadioButton boton4VD = new JRadioButton(apoyoPuntoVenta.iata3 + "-" + apoyoPuntoVenta.iata4 + "  " + apoyoPuntoVenta.data4 + "  " + apoyoPuntoVenta.minTotal4 + "  " + apoyoPuntoVenta.preciocentimos4.format(apoyoPuntoVenta.precioramdom4));
                        ButtonGroup botones3 = new ButtonGroup();

                        if (boton2.isSelected()) {

                            botones3.add(boton3VD);
                            botones3.add(boton4VD);

                            Border borde2VD = BorderFactory.createTitledBorder("Vuelta");
                            Vuelta.setBorder(borde2VD);

                            Vuelta.add(boton3VD);
                            Vuelta.add(boton4VD);





                        }
                        JPanel Panelidavuelta = new JPanel();
                        Panelidavuelta.add(Ida, BorderLayout.WEST);
                        Panelidavuelta.add(Vuelta, BorderLayout.EAST);
                        JButton botonConfirmar = new JButton("Confirmar Elecciones");
                        JPanel PanelConfirmacion = new JPanel();
                        PanelVuelosDisponibles.setBorder(BorderFactory.createEmptyBorder(50, 1, 0, 1));
                        PanelConfirmacion.setBorder(BorderFactory.createEmptyBorder(0, 1, 50, 1));
                        PanelConfirmacion.add(botonConfirmar);
                        PanelCentro.setLayout(new BoxLayout(PanelCentro, BoxLayout.Y_AXIS));
                        PanelCentro.add(PanelVuelosDisponibles, BorderLayout.CENTER);
                        PanelCentro.add(Panelidavuelta, BorderLayout.CENTER);
                        PanelCentro.add(PanelConfirmacion, BorderLayout.SOUTH);
                        Contenidogeneral.add(PanelCentro);
                        Contenidogeneral.add(Contenidoabajo);
                        marco.pack();

                        botonConfirmar.addActionListener(i -> {
                            if (boton1.isSelected()) {
                                if (boton1VD.isSelected() == false && boton2VD.isSelected() == false) {
                                    JOptionPane.showMessageDialog(null, "Tienes que seleccionar un vuelo de ida", "Error", JOptionPane.ERROR_MESSAGE);
                                    Contenidoabajo.setVisible(true);
                                    Panelslider.setVisible(true);
                                    Panelposicion.setVisible(true);
                                    Panelimportes.setVisible(true);
                                    Panelbilletes.setVisible(true);
                                    Panelcheck.setVisible(true);
                                    marco.pack();

                                }
                            }

                            botonConfirmar.addActionListener(o -> {
                                if (boton1.isSelected()) {
                                    if (boton1VD.isSelected() == false && boton3VD.isSelected() == false) {
                                        JOptionPane.showMessageDialog(null, "Tienes que seleccionar un vuelo de ida y uno de vuelta", "Error", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        Contenidoabajo.setVisible(true);
                                        Panelslider.setVisible(true);
                                        Panelposicion.setVisible(true);
                                        Panelcheck.setVisible(true);
                                        Panelimportes.setVisible(true);
                                        Panelbilletes.setVisible(true);
                                        marco.pack();
                                    }
                                } else if (boton2.isSelected()) {
                                    if (boton2VD.isSelected() == false && boton4VD.isSelected() == false) {
                                        JOptionPane.showMessageDialog(null, "Tienes que seleccionar un vuelo de ida y uno de vuelta", "Error", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        Contenidoabajo.setVisible(true);
                                        Panelslider.setVisible(true);
                                        Panelposicion.setVisible(true);
                                        Panelcheck.setVisible(true);
                                        Panelimportes.setVisible(true);
                                        Panelbilletes.setVisible(true);
                                        marco.pack();
                                    }
                                }
                            });
                        });

                    } else if (eleccion == JOptionPane.NO_OPTION) {
                        origen.setSelectedIndex(0);
                        destino.setSelectedIndex(0);
                        boton1.setSelected(false);
                        boton2.setSelected(false);
                        dia.setValue(1);
                        mes.setValue("Septiembre");
                        anio.setValue(2022);
                        dia2.setValue(1);
                        mes2.setValue("Septiembre");
                        anio2.setValue(2022);
                        contaso.setValue(1);
                        Panelslider.setVisible(false);
                        Panelposicion.setVisible(false);
                        Panelcheck.setVisible(false);
                        botones.clearSelection();
                        marco.pack();

                    } else if (eleccion == JOptionPane.CANCEL_OPTION) {


                    }
                }
            }
        });


        botontick.addActionListener(e -> {
            {
                if (origen.getSelectedIndex() == 0 || destino.getSelectedIndex() == 0) {

                    JOptionPane.showMessageDialog(null, "Tienes que seleccionar una ubicación", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (boton1.isSelected() == false && boton2.isSelected() == false) {
                    JOptionPane.showMessageDialog(null, "Tienes que seleccionar una modalidad", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (botontick.isSelected() & boton1.isSelected()) {



                    }

                }
            }
        });


            marco.add(Contenidogeneral, BorderLayout.NORTH);
            marco.pack();

            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
        };

    }



;