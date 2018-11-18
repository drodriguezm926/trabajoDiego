package finalproject;

public class Vuelo {

    private String codigo;
    private String puntoPartida;
    private String puntoLlegada;
    private double costo;
    private int duracionMinutos;
    private String fechaLlegada;
    private String fechaPartida;

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
        vuelo.costo = 31000.00;
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
        vuelo.costo = 19000.00;
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
        vuelo.costo = 6000.00;
        vuelo.duracionMinutos = 7000;
        vuelo.fechaPartida = "23/12/2018";
        vuelo.fechaLlegada = "23/12/2018";

        return vuelo;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codigo=" + codigo + ", puntoPartida=" + puntoPartida + ", puntoLlegada=" + puntoLlegada + ", costo=" + costo + ", duracionMinutos=" + duracionMinutos + ", fechaLlegada=" + fechaLlegada + ", fechaPartida=" + fechaPartida + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(String puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(String fechaPartida) {
        this.fechaPartida = fechaPartida;
    }
    
    
}
