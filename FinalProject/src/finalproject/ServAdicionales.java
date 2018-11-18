package finalproject;

import java.util.Scanner;

public class ServAdicionales {

    private String tipoVuelo;
    private double tipoVueloPrice;
    private String equipaje;
    private double equipajePrice;
    private String tipoPasaj;
    private double pasajeroPrice;
    private String alim;
    private double alimPrice;
    private String tipoServ;
    private double tipoServPrice;
    private String codigoProm;
    private double codigoDesc;

    private double totalPagar;
    private double subTotal;

    public ServAdicionales(String tipoVuelo, double tipoVueloPrice, String equipaje, double equipajePrice, String tipoPasaj, double pasajeroPrice, String alim, double alimPrice, String tipoServ, double tipoServPrice, String codigoProm, double codigoDesc, double totalPagar, double subTotal) {
        this.tipoVuelo = tipoVuelo;
        this.tipoVueloPrice = tipoVueloPrice;
        this.equipaje = equipaje;
        this.equipajePrice = equipajePrice;
        this.tipoPasaj = tipoPasaj;
        this.pasajeroPrice = pasajeroPrice;
        this.alim = alim;
        this.alimPrice = alimPrice;
        this.tipoServ = tipoServ;
        this.tipoServPrice = tipoServPrice;
        this.codigoProm = codigoProm;
        this.codigoDesc = codigoDesc;
        this.totalPagar = totalPagar;
        this.subTotal = subTotal;
    }

    public String getCodigoProm() {
        return codigoProm;
    }

    public void setCodigoProm(String codigoProm) {
        if (this.codigoProm.equals("UCR")) {
            this.codigoDesc = this.subTotal - 15000;
        } else {
            this.codigoDesc = this.subTotal;
        }

        this.codigoProm = codigoProm;
    }

    public double getCodigoDesc() {
        return codigoDesc;
    }

    public void setCodigoDesc(double codigoDesc) {
        this.codigoDesc = codigoDesc;
    }

    public String getTipoServ() {

        if (tipoServ.equals("Ejecutivo")) {
            this.tipoServPrice = this.subTotal + 85000;
        } else {
            this.tipoServPrice = this.subTotal;
        }
        return tipoServ;
    }

    public void setTipoServ(String tipoServ) {
        this.tipoServ = tipoServ;
    }

    public double getTipoServPrice() {
        return tipoServPrice;
    }

    public void setTipoServPrice(double tipoServPrice) {
        this.tipoServPrice = tipoServPrice;
    }

    public double getPasajeroPrice() {
        return pasajeroPrice;
    }

    public void setPasajeroPrice(double pasajeroPrice) {
        this.pasajeroPrice = pasajeroPrice;
    }

    public String getAlim() {
        return alim;
    }

    public void setAlim(String alim) {
        if (this.alim.equals("Si")) {
            this.alimPrice = this.subTotal + 10000;
        } else {
            this.alimPrice = this.subTotal;
        }
        this.alim = alim;
    }

    public double getAlimPrice() {
        return alimPrice;
    }

    public void setAlimPrice(double alimPrice) {
        this.alimPrice = alimPrice;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public ServAdicionales() {
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            if (tipoVuelo.toUpperCase().equals("ROUNDTRIP")) {
                continuar = false;
                this.tipoVueloPrice = this.subTotal * 2;
            } else if (tipoVuelo.toUpperCase().equals("SIMPLE")){
                continuar = false;
                this.tipoVueloPrice = this.subTotal * 1.7;
            }else{
                System.out.println("Opcion invalidad..");
                System.out.println("Ingresa nuevamente el tipo de vuelo: Roundtrip o Simple?");
                String nuevoValor = scanner.nextLine();
                tipoVuelo = nuevoValor;
            }
        }

        this.tipoVuelo = tipoVuelo;
    }

    public String getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(String equipaje) {

        if (tipoVuelo.equals("basic")) {

        } else {
            this.equipajePrice = this.subTotal + 35000;
        }

        this.tipoVuelo = tipoVuelo;

        this.equipaje = equipaje;
    }

    public double getPrecioTotal() {
        this.totalPagar = this.totalPagar + this.equipajePrice + this.tipoVueloPrice + this.equipajePrice;
        return totalPagar;
    }

    public double getTipoVueloPrice() {
        return tipoVueloPrice;
    }

    public void setTipoVueloPrice(double tipoVueloPrice) {
        this.tipoVueloPrice = tipoVueloPrice;
    }

    public double getEquipajePrice() {
        return equipajePrice;
    }

    public void setEquipajePrice(double equipajePrice) {
        this.equipajePrice = equipajePrice;
    }

    public void setPrecioTotal(double precioTotal) {
        this.totalPagar = precioTotal;
    }

    public double getPrecioVuelo() {
        return subTotal;
    }

    public void setPrecioVuelo(double precioVuelo) {
        this.subTotal = precioVuelo;
    }

    public String getTipoPasaj() {
        return tipoPasaj;
    }

    public void setTipoPasaj(String tipoPasaj) {
        this.tipoPasaj = tipoPasaj;
        if (this.tipoPasaj.equals("Nino")) {
            this.pasajeroPrice = this.subTotal + 0;
        } else {
            this.pasajeroPrice = this.subTotal + 5000;
        }
    }

    @Override
    public String toString() {
        return "tipoVuelo " + tipoVuelo + ", tipoVueloPrice " + tipoVueloPrice + ", equipaje " + equipaje + ", equipajePrice " + equipajePrice + ", subtotal " + subTotal;
    }
}
