package Trabajo_Prog_2T;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ApoyoPuntoVenta {
    Scanner scanner = new Scanner(System.in);
    String dia;
    String mes;
    String anio;
    LocalDate fecha;
    String IataOrigen;
    String IataDestino;
    public String iata;
    public String iata2;
    public LocalTime data = null;
    public int min = 0;
    public LocalTime minTotal = null;
    public LocalTime minTotal2 = null;
    public LocalTime data2 = null;
    public DecimalFormat preciocentimos = null;
    public DecimalFormat preciocentimos2 = null;
    double precioramdom = 0;
    double precioramdom2 = 0;

    public String iata3;
    public String iata4;
    public LocalTime data3 = null;
    public int min3 = 0;
    public LocalTime minTotal3 = null;
    public LocalTime minTotal4 = null;
    public LocalTime data4 = null;
    public DecimalFormat preciocentimos3 = null;
    public DecimalFormat preciocentimos4 = null;
    double precioramdom3 = 0;
    double precioramdom4 = 0;

    ArrayList<String> tabla = new ArrayList<>(); // Creamos un ArrayList para guardar todos los meses del año
    Interfaz inter = new Interfaz();
    public ApoyoPuntoVenta(LocalDate fechilla){
        fecha=fechilla;
    }
    public String tipofecha() {
        DateTimeFormatter fechatotal = DateTimeFormatter.ofPattern("d-MMMM-yyyy").withLocale(new Locale("es", "ES"));
        return fechatotal.format(fecha);

    }


    public void opcion12(String[] args){
        System.out.println("\tOpcion 1");
        dia = args[0];
        mes = args[1];
        anio = args[2];
        System.out.println("\tSe ha recibido como parámetro de ejecución");
        System.out.println("\tDía: "+dia);
        System.out.println("\tMes: "+mes);
        System.out.println("\tAño: "+anio);
        System.out.println("\tEl resultado solicitado de la misma es: "+ tipofecha());


    }



    public static void op2(String hor, int min) {
        LocalTime Hora = LocalTime.parse(hor);
        LocalTime totalHora = Hora.plusMinutes(min);
        System.out.println("La hora de llegada es: " + totalHora);

    }



    public void op3() {
        // Añadimos los meses del año en la tabla (teniendo en cuenta que la primera posición de un ArrayList es 0)
        tabla.add("Enero");
        tabla.add("Febrero");
        tabla.add("Marzo");
        tabla.add("Abril");
        tabla.add("Mayo");
        tabla.add("Junio");
        tabla.add("Julio");
        tabla.add("Agosto");
        tabla.add("Septiembre");
        tabla.add("Octubre");
        tabla.add("Noviembre");
        tabla.add("Diciembre");




        System.out.println("Introduzca el mes en formato numérico:");
        int numMes = scanner.nextInt();
        System.out.println("La tabla se está generando...");
        System.out.println("El resultado solicitado es:");

        for (int i = numMes - 1; i < tabla.size() + numMes - 1; i++) {
            System.out.println(tabla.get(i % tabla.size()));
        }
    }



    public static int op41(String nombreMes) {

        Map<String, Integer> calendarioMes = new HashMap<>();
        calendarioMes.put("enero", 31);
        calendarioMes.put("febrero", 28);
        calendarioMes.put("marzo", 31);
        calendarioMes.put("abril", 30);
        calendarioMes.put("mayo", 31);
        calendarioMes.put("junio", 30);
        calendarioMes.put("julio", 31);
        calendarioMes.put("agosto", 31);
        calendarioMes.put("septiembre", 30);
        calendarioMes.put("octubre", 31);
        calendarioMes.put("noviembre", 30);
        calendarioMes.put("diciembre", 31);



        try {
            return calendarioMes.get(nombreMes.toLowerCase()).intValue();
        } catch (NullPointerException e) {

            System.out.println("Error: El mes '" + nombreMes + "' no está registrado.");
            return -1;

        }

    }
    public static void op4(String nombreMes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del mes:");
        nombreMes = scanner.next();
        System.out.println("El resultado solicitado es: " + op41(nombreMes));
    }




    public void opcion5(String pais, String pais2) {
        HashMap<String, String> Ciudadvuelo = new HashMap<>();
        Ciudadvuelo.put("Sevilla", "SVQ");
        Ciudadvuelo.put("Madrid", "MAD");
        Ciudadvuelo.put("Barcelona", "BCN");
        Ciudadvuelo.put("Valencia", "VLC");
        Ciudadvuelo.put("Bilbao", "BIO");
        Ciudadvuelo.put("Málaga", "AGP");
        Ciudadvuelo.put("A Coruña", "LCG");
        Ciudadvuelo.put("Santander", "SDR");
        Ciudadvuelo.put("Asturias", "OVD");



        HashMap<String, ArrayList<String>[]> aeropuerto = new HashMap<>();



        ArrayList<String> SVQ = new ArrayList<>();
        SVQ.add("SVQ");
        SVQ.add("07:00");
        SVQ.add("08:20");
        SVQ.add("80");

        ArrayList<String> MAD = new ArrayList<>();
        MAD.add("MAD");
        MAD.add("08:25");
        MAD.add("09:45");
        MAD.add("60");

        ArrayList<String> BCN = new ArrayList<>();
        BCN.add("BCN");
        BCN.add("07:45");
        BCN.add("18:55");
        BCN.add("90");

        ArrayList<String> VLC = new ArrayList<>();
        VLC.add("VLC");
        VLC.add("12:00");
        VLC.add("13:30");
        VLC.add("90");

        ArrayList<String> BIO = new ArrayList<>();
        BIO.add("BIO");
        BIO.add("14:00");
        BIO.add("15:30");
        BIO.add("90");

        ArrayList<String> AGP = new ArrayList<>();
        AGP.add("AGP");
        AGP.add("16:00");
        AGP.add("17:30");
        AGP.add("90");

        ArrayList<String> LCG = new ArrayList<>();
        LCG.add("LCG");
        LCG.add("18:00");
        LCG.add("19:30");
        LCG.add("90");

        ArrayList<String> SDR = new ArrayList<>();
        SDR.add("SDR");
        SDR.add("20:00");
        SDR.add("21:30");
        SDR.add("90");

        ArrayList<String> OVD = new ArrayList<>();
        OVD.add("OVD");
        OVD.add("22:00");
        OVD.add("23:30");
        OVD.add("90");





        ArrayList<String>[] Sevilla = new ArrayList[]{MAD, BCN, VLC, BIO, AGP, LCG, SDR, OVD};

        aeropuerto.put("SVQ", Sevilla);

        ArrayList<String> SVQ1 = new ArrayList<>();
        SVQ1.add("SVQ");
        SVQ1.add("07:20");
        SVQ1.add("09:00");
        SVQ1.add("45");

        ArrayList<String> BCN1 = new ArrayList<>();
        BCN1.add("BCN");
        BCN1.add("09:30");
        BCN1.add("11:00");
        BCN1.add("45");

        ArrayList<String> VLC1 = new ArrayList<>();
        VLC1.add("VLC");
        VLC1.add("11:30");
        VLC1.add("13:00");
        VLC1.add("90");

        ArrayList<String> BIO1 = new ArrayList<>();
        BIO1.add("BIO");
        BIO1.add("13:30");
        BIO1.add("15:00");
        BIO1.add("90");

        ArrayList<String> AGP1 = new ArrayList<>();
        AGP1.add("AGP");
        AGP1.add("15:30");
        AGP1.add("17:00");
        AGP1.add("60");

        ArrayList<String> LCG1 = new ArrayList<>();
        LCG1.add("LCG");
        LCG1.add("17:30");
        LCG1.add("19:00");
        LCG1.add("120");

        ArrayList<String> SDR1 = new ArrayList<>();
        SDR1.add("SDR");
        SDR1.add("19:30");
        SDR1.add("21:00");
        SDR1.add("40");

        ArrayList<String> OVD1 = new ArrayList<>();
        OVD1.add("OVD");
        OVD1.add("21:30");
        OVD1.add("23:00");
        OVD1.add("70");

        ArrayList<String>[] Madrid = new ArrayList[]{BCN1, VLC1, BIO1, AGP1, LCG1, SDR1, OVD1, SVQ1};

        aeropuerto.put("MAD", Madrid);

        ArrayList<String> SVQ2 = new ArrayList<>(); SVQ2.add("SVQ"); SVQ2.add("07:00"); SVQ2.add("08:20"); SVQ2.add("80");

        ArrayList<String> MAD2 = new ArrayList<>(); MAD2.add("MAD"); MAD2.add("08:25"); MAD2.add("09:45"); MAD2.add("60");

        ArrayList<String> VLC2 = new ArrayList<>(); VLC2.add("VLC"); VLC2.add("12:00"); VLC2.add("13:30"); VLC2.add("90");

        ArrayList<String> BIO2 = new ArrayList<>(); BIO2.add("BIO"); BIO2.add("14:00"); BIO2.add("15:30"); BIO2.add("90");

        ArrayList<String> AGP2 = new ArrayList<>(); AGP2.add("AGP"); AGP2.add("16:00"); AGP2.add("17:30"); AGP2.add("90");

        ArrayList<String> LCG2 = new ArrayList<>(); LCG2.add("LCG"); LCG2.add("18:00"); LCG2.add("19:30"); LCG2.add("90");

        ArrayList<String> SDR2 = new ArrayList<>(); SDR2.add("SDR"); SDR2.add("20:00"); SDR2.add("21:30"); SDR2.add("90");

        ArrayList<String> OVD2 = new ArrayList<>(); OVD2.add("OVD"); OVD2.add("22:00"); OVD2.add("23:30"); OVD2.add("90");

        ArrayList<String>[] Barcelona = new ArrayList[]{VLC2, BIO2, AGP2, LCG2, SDR2, OVD2, SVQ2, MAD2};

        aeropuerto.put("BCN", Barcelona);

        ArrayList<String> SVQ3 = new ArrayList<>(); SVQ3.add("SVQ"); SVQ3.add("06:00"); SVQ3.add("09:20"); SVQ3.add("80");

        ArrayList<String> MAD3 = new ArrayList<>(); MAD3.add("MAD"); MAD3.add("04:25"); MAD3.add("01:45"); MAD3.add("60");

        ArrayList<String> BIO3 = new ArrayList<>(); BIO3.add("BIO"); BIO3.add("15:00"); BIO3.add("16:30"); BIO3.add("90");

        ArrayList<String> AGP3 = new ArrayList<>(); AGP3.add("AGP"); AGP3.add("17:00"); AGP3.add("18:30"); AGP3.add("90");

        ArrayList<String> LCG3 = new ArrayList<>(); LCG3.add("LCG"); LCG3.add("19:00"); LCG3.add("20:30"); LCG3.add("90");

        ArrayList<String> SDR3 = new ArrayList<>(); SDR3.add("SDR"); SDR3.add("21:00"); SDR3.add("22:30"); SDR3.add("90");

        ArrayList<String> OVD3 = new ArrayList<>(); OVD3.add("OVD"); OVD3.add("23:00"); OVD3.add("00:30"); OVD3.add("90");

        ArrayList<String>[] Valencia = new ArrayList[]{BIO3, AGP3, LCG3, SDR3, OVD3, SVQ3, MAD3};

        aeropuerto.put("VLC", Valencia);

        ArrayList<String> SVQ4 = new ArrayList<>(); SVQ4.add("SVQ"); SVQ4.add("07:00"); SVQ4.add("08:20"); SVQ4.add("80");

        ArrayList<String> MAD4 = new ArrayList<>(); MAD4.add("MAD"); MAD4.add("08:25"); MAD4.add("09:45"); MAD4.add("60");

        ArrayList<String> BCN4 = new ArrayList<>(); BCN4.add("BCN"); BCN4.add("07:45"); BCN4.add("18:55"); BCN4.add("90");

        ArrayList<String> AGP4 = new ArrayList<>(); AGP4.add("AGP"); AGP4.add("16:00"); AGP4.add("17:30"); AGP4.add("90");

        ArrayList<String> LCG4 = new ArrayList<>(); LCG4.add("LCG"); LCG4.add("18:00"); LCG4.add("19:30"); LCG4.add("90");

        ArrayList<String> SDR4 = new ArrayList<>(); SDR4.add("SDR"); SDR4.add("20:00"); SDR4.add("21:30"); SDR4.add("90");

        ArrayList<String> OVD4 = new ArrayList<>(); OVD4.add("OVD"); OVD4.add("22:00"); OVD4.add("23:30"); OVD4.add("90");
        ArrayList <String> VLC4 = new ArrayList<>(); VLC4.add("VLC"); VLC4.add("12:00"); VLC4.add("13:30"); VLC4.add("90");

        ArrayList<String>[] Bilbao = new ArrayList[]{AGP4, LCG4, SDR4, OVD4, SVQ4, MAD4, BCN4, VLC4};

        aeropuerto.put("BIO", Bilbao);

        ArrayList<String> SVQ5 = new ArrayList<>(); SVQ5.add("SVQ"); SVQ5.add("07:00"); SVQ5.add("08:20"); SVQ5.add("80");

        ArrayList<String> MAD5 = new ArrayList<>(); MAD5.add("MAD"); MAD5.add("08:25"); MAD5.add("09:45"); MAD5.add("60");

        ArrayList<String> BCN5 = new ArrayList<>(); BCN5.add("BCN"); BCN5.add("07:45"); BCN5.add("18:55"); BCN5.add("90");

        ArrayList<String> VLC5 = new ArrayList<>(); VLC5.add("VLC"); VLC5.add("12:00"); VLC5.add("13:30"); VLC5.add("90");

        ArrayList<String> LCG5 = new ArrayList<>(); LCG5.add("LCG"); LCG5.add("18:00"); LCG5.add("19:30"); LCG5.add("90");

        ArrayList<String> SDR5 = new ArrayList<>(); SDR5.add("SDR"); SDR5.add("20:00"); SDR5.add("21:30"); SDR5.add("90");
        ArrayList<String> AGP5 = new ArrayList<>(); AGP5.add("AGP"); AGP5.add("16:00"); AGP5.add("17:30"); AGP5.add("90");

        ArrayList<String> OVD5 = new ArrayList<>(); OVD5.add("OVD"); OVD5.add("22:00"); OVD5.add("23:30"); OVD5.add("90");

        ArrayList<String>[] Málaga = new ArrayList[]{LCG5, SDR5, OVD5, SVQ5, MAD5, BCN5, VLC5, AGP5};

        aeropuerto.put("AGP", Málaga);

        ArrayList<String> SVQ6 = new ArrayList<>(); SVQ6.add("SVQ"); SVQ6.add("07:00"); SVQ6.add("08:20"); SVQ6.add("80");

        ArrayList<String> MAD6 = new ArrayList<>(); MAD6.add("MAD"); MAD6.add("08:25"); MAD6.add("09:45"); MAD6.add("60");

        ArrayList<String> BCN6 = new ArrayList<>(); BCN6.add("BCN"); BCN6.add("07:45"); BCN6.add("18:55"); BCN6.add("90");

        ArrayList<String> VLC6 = new ArrayList<>(); VLC6.add("VLC"); VLC6.add("12:00"); VLC6.add("13:30"); VLC6.add("90");

        ArrayList<String> BIO6 = new ArrayList<>(); BIO6.add("BIO"); BIO6.add("14:00"); BIO6.add("15:30"); BIO6.add("90");
        ArrayList<String> AGP6 = new ArrayList<>(); AGP6.add("OVD"); AGP6.add("22:00"); AGP6.add("23:30"); AGP6.add("90");

        ArrayList<String> SDR6 = new ArrayList<>(); SDR6.add("SDR"); SDR6.add("20:00"); SDR6.add("21:30"); SDR6.add("90");

        ArrayList<String> OVD6 = new ArrayList<>(); OVD6.add("OVD"); OVD6.add("22:00"); OVD6.add("23:30"); OVD6.add("90");


        ArrayList<String>[] A_Coruña = new ArrayList[]{SDR6, OVD6, SVQ6, MAD6, BCN6, VLC6, BIO6, AGP6};

        aeropuerto.put("LCG", A_Coruña);

        ArrayList<String> SVQ7 = new ArrayList<>(); SVQ7.add("SVQ"); SVQ7.add("07:00"); SVQ7.add("08:20"); SVQ7.add("80");

        ArrayList<String> MAD7 = new ArrayList<>(); MAD7.add("MAD"); MAD7.add("08:25"); MAD7.add("09:45"); MAD7.add("60");

        ArrayList<String> BCN7 = new ArrayList<>(); BCN7.add("BCN"); BCN7.add("07:45"); BCN7.add("18:55"); BCN7.add("90");

        ArrayList<String> VLC7 = new ArrayList<>(); VLC7.add("VLC"); VLC7.add("12:00"); VLC7.add("13:30"); VLC7.add("90");

        ArrayList<String> BIO7 = new ArrayList<>(); BIO7.add("BIO"); BIO7.add("14:00"); BIO7.add("15:30"); BIO7.add("90");

        ArrayList<String> AGP7 = new ArrayList<>(); AGP7.add("AGP"); AGP7.add("16:00"); AGP7.add("17:30"); AGP7.add("90");

        ArrayList<String> OVD7 = new ArrayList<>(); OVD7.add("OVD"); OVD7.add("22:00"); OVD7.add("23:30"); OVD7.add("90");

        ArrayList<String>[] Santander = new ArrayList[]{OVD7, SVQ7, MAD7, BCN7, VLC7, BIO7, AGP7};

        aeropuerto.put("SDR", Santander);

        ArrayList<String> SVQ8 = new ArrayList<>(); SVQ8.add("SVQ"); SVQ8.add("07:00"); SVQ8.add("08:20"); SVQ8.add("80");

        ArrayList<String> MAD8 = new ArrayList<>(); MAD8.add("MAD"); MAD8.add("08:25"); MAD8.add("09:45"); MAD8.add("60");

        ArrayList<String> BCN8 = new ArrayList<>(); BCN8.add("BCN"); BCN8.add("07:45"); BCN8.add("18:55"); BCN8.add("90");

        ArrayList<String> VLC8 = new ArrayList<>(); VLC8.add("VLC"); VLC8.add("12:00"); VLC8.add("13:30"); VLC8.add("90");

        ArrayList<String> BIO8 = new ArrayList<>(); BIO8.add("BIO"); BIO8.add("14:00"); BIO8.add("15:30"); BIO8.add("90");

        ArrayList<String> AGP8 = new ArrayList<>(); AGP8.add("AGP"); AGP8.add("16:00"); AGP8.add("17:30"); AGP8.add("90");

        ArrayList<String> LCG8 = new ArrayList<>(); LCG8.add("LCG"); LCG8.add("18:00"); LCG8.add("19:30"); LCG8.add("90");

        ArrayList<String>[] Asturias = new ArrayList[]{SVQ8, MAD8, BCN8, VLC8, BIO8, AGP8, LCG8};

        aeropuerto.put("OVD", Asturias);





        Scanner scanner = new Scanner(System.in);
        this.iata = Ciudadvuelo.get(inter.IataOrigen);
        this.iata2 = Ciudadvuelo.get(inter.IataDestino);

        this.iata3 = Ciudadvuelo.get(inter.IataDestino);
        this.iata4 = Ciudadvuelo.get(inter.IataOrigen);


        if (aeropuerto.containsKey(iata)) {
            for (ArrayList<String> resul : aeropuerto.get(iata)) {
                int ola = resul.indexOf(iata2);
                for (String resul2 : resul) {
                    for (int i = 0; ola == i; i++) {
                        this.data = LocalTime.parse(resul.get(1));
                        this.data2 = LocalTime.parse(resul.get(2));
                        this.min = Integer.parseInt(resul.get(3));
                        this.minTotal = data.plusMinutes(min);
                        this.minTotal2 = data2.plusMinutes(min);
                        double precillo = 35.00;
                        double preciaco = 60.00;
                        Random random = new Random();
                        double rangodeprecio = precillo - preciaco;
                        this.precioramdom = precillo + (random.nextDouble() * rangodeprecio);
                        this.preciocentimos = new DecimalFormat("#.##€");
                        this.precioramdom2 = precillo + (random.nextDouble() * rangodeprecio);
                        this.preciocentimos2 = new DecimalFormat("#.##€");

                    }
                }

            }
        }
        if (aeropuerto.containsKey(iata3)) {
            for (ArrayList<String> resul : aeropuerto.get(iata3)) {
                int ola = resul.indexOf(iata4);
                for (String resul2 : resul) {
                    for (int i = 0; ola == i; i++) {
                        this.data3 = LocalTime.parse(resul.get(1));
                        this.data4 = LocalTime.parse(resul.get(2));
                        this.min3 = Integer.parseInt(resul.get(3));
                        this.minTotal3 = data3.plusMinutes(min);
                        this.minTotal4 = data4.plusMinutes(min);
                        double precillo = 35.00;
                        double preciaco = 60.00;
                        Random random = new Random();
                        double rangodeprecio = precillo - preciaco;
                        this.precioramdom3 = precillo + (random.nextDouble() * rangodeprecio);
                        this.preciocentimos3 = new DecimalFormat("#.##€");
                        this.precioramdom4 = precillo + (random.nextDouble() * rangodeprecio);
                        this.preciocentimos4 = new DecimalFormat("#.##€");

                    }
                }

            }
        }
    }
}