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

    private double tarifaBase;

    private double totalPagar;
    private double subTotal;

    public ServAdicionales() {
    }

    public ServAdicionales(String tipoVuelo, double tipoVueloPrice, String equipaje, double equipajePrice, String tipoPasaj, double pasajeroPrice, String alim, double alimPrice, String tipoServ, double tipoServPrice, String codigoProm, double codigoDesc, double tarifaBase, double totalPagar, double subTotal) {
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
        this.tarifaBase = tarifaBase;
        this.totalPagar = totalPagar;
        this.subTotal = subTotal;
    }

    public String getCodigoProm() {
        return codigoProm;
    }

    public void setCodigoProm(String codigoProm) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        boolean confirmar = true;

        while (continuar) {

            if (codigoProm.toUpperCase().equals("SI")) {

                while (confirmar) {
                    System.out.println("ingrese codigo promocional");

                    String nuevoValor = scanner.nextLine();
                    codigoProm = nuevoValor;

                    if (codigoProm.toUpperCase().equals("UCR")) {
                        continuar = false;
                        confirmar = false;
                        this.codigoDesc = 15000.00;
                    } else if (codigoProm.toUpperCase().equals("PROGRA")) {
                        continuar = false;
                        confirmar = false;
                        this.codigoDesc = 15000;
                    } else {
                        System.out.println("Valor ingresado incorrectamente");
                    }
                }

            } else if (codigoProm.toUpperCase().equals("NO")) {
                continuar = false;
            } else {
                System.out.println("Valor ingresado incorrectamente");
                System.out.println("Codigo promocional? si o no");
                String repeticion = scanner.nextLine();
                codigoProm = repeticion;
            }
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

        return tipoServ;
    }

    public void setTipoServ(String tipoServ) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            if (tipoServ.toUpperCase().equals("ECONOMICO")) {
                continuar = false;
                this.tipoServPrice = 0.00;
            } else if (tipoServ.toUpperCase().equals("EJECUTIVO")) {
                continuar = false;
                this.tipoServPrice = 85000;
            } else {
                System.out.println("Opcion invalidad..");
                System.out.println("Ingresa nuevamente el tipo de vuelo: Economico o Ejecutivo");
                String nuevoValor = scanner.nextLine();
                tipoServ = nuevoValor;
            }
        }

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
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            if (alim.toUpperCase().equals("SI")) {
                continuar = false;
                this.alimPrice = 10000.00;
            } else if (alim.toUpperCase().equals("NO")) {
                continuar = false;
                this.alimPrice = 0.00;
            } else {
                System.out.println("Opcion invalidad..");
                System.out.println("Ingresa nuevamente el tipo de vuelo: Si o No");
                String nuevoValor = scanner.nextLine();
                alim = nuevoValor;
            }
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

    public void setTotalPagar() {

        this.totalPagar = getSubTotal() - this.codigoDesc;;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal() {
        this.subTotal = this.tipoVueloPrice
                + this.equipajePrice
                + this.pasajeroPrice
                + this.alimPrice
                + this.tipoServPrice;;
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
                this.tipoVueloPrice = this.tarifaBase * 2;
            } else if (tipoVuelo.toUpperCase().equals("SIMPLE")) {
                continuar = false;
                this.tipoVueloPrice = this.tarifaBase * 1.7;
            } else {
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

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            if (equipaje.toUpperCase().equals("BASICO")) {
                continuar = false;
                this.equipajePrice = 0.00;
            } else if (equipaje.toUpperCase().equals("ADICIONAL")) {
                continuar = false;
                this.equipajePrice = 35000.00;
            } else {
                System.out.println("Opcion invalidad..");
                System.out.println("Ingresa nuevamente el tipo de vuelo: Basico o Adicional?");
                String nuevoValor = scanner.nextLine();
                equipaje = nuevoValor;
            }
        }

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
        //ACADA
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
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            if (tipoPasaj.toUpperCase().equals("NINO")) {
                continuar = false;
                this.pasajeroPrice = 0.00;
            } else if (tipoPasaj.toUpperCase().equals("ADULTO")) {
                continuar = false;
                this.pasajeroPrice = 5000.00;
            } else {
                System.out.println("Opcion invalidad..");
                System.out.println("Ingresa nuevamente el tipo de vuelo: Nino o Adulto?");
                String nuevoValor = scanner.nextLine();
                tipoPasaj = nuevoValor;
            }
        }

        this.tipoPasaj = tipoPasaj;

    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public String toString() {
        return "ServAdicionales{" + "tipoVuelo=" + tipoVuelo + ", tipoVueloPrice=" + tipoVueloPrice + ", equipaje=" + equipaje + ", equipajePrice=" + equipajePrice + ", tipoPasaj=" + tipoPasaj + ", pasajeroPrice=" + pasajeroPrice + ", alim=" + alim + ", alimPrice=" + alimPrice + ", tipoServ=" + tipoServ + ", tipoServPrice=" + tipoServPrice + ", codigoProm=" + codigoProm + ", codigoDesc=" + codigoDesc + ", totalPagar=" + totalPagar + ", subTotal=" + subTotal + '}';
    }

}
