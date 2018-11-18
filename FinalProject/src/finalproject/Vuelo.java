package finalproject;

public class Vuelo {

    String codigo;
    String puntoPartida;
    String puntoLlegada;
    int costo;
    int duracionMinutos;
    String fechaLlegada;
    String fechaPartida;

    public Vuelo() {
    }

    public Vuelo(String codigo, String puntoPartida, String puntoLlegada, int costo, int duracionMinutos, String fechaLlegada, String fechaPartida) {
        this.codigo = codigo;
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;
        this.costo = costo;
        this.duracionMinutos = duracionMinutos;
        this.fechaLlegada = fechaLlegada;
        this.fechaPartida = fechaPartida;
    }

    public Vuelo conseguirVuelo1() {
        //Se instancia el objecto
        Vuelo vuelo = new Vuelo();

        vuelo.codigo = "TACA85";
        vuelo.puntoPartida = "Aeropuerto Juan Santamaria";
        vuelo.puntoLlegada = "Aeropuerto Internacional de Liberia";
        vuelo.costo = 16000;
        vuelo.duracionMinutos = 7000;
        vuelo.fechaPartida = "20-10-2018 6";
        vuelo.fechaLlegada = "20/10/2018";
        return vuelo;
    }

    public Vuelo conseguirVuelo2() {
        //Se instancia el objecto
        Vuelo vuelo = new Vuelo();

        vuelo.codigo = "TACA86";
        vuelo.puntoPartida = "Aeropuerto Juan Santamaria";
        vuelo.puntoLlegada = "Aeropuerto Internacional de Liberia";
        vuelo.costo = 16000;
        vuelo.duracionMinutos = 7000;
        vuelo.fechaPartida = "25/11/2018";
        vuelo.fechaLlegada = "25/11/2018";

        return vuelo;
    }

    public Vuelo conseguirVuelo3() {
        //Se instancia el objecto
        Vuelo vuelo = new Vuelo();

        vuelo.codigo = "TACA87";
        vuelo.puntoPartida = "Aeropuerto Juan Santamaria";
        vuelo.puntoLlegada = "Aeropuerto Internacional de Liberia";
        vuelo.costo = 16000;
        vuelo.duracionMinutos = 7000;
        vuelo.fechaPartida = "23/12/2018";
        vuelo.fechaLlegada = "23/12/2018";

        return vuelo;
    }
}
