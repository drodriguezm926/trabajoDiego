package finalproject;

import java.util.Scanner;

public class Formulario {

//Instacia del objeto Persona
    Persona persona = new Persona();
    Vuelo vuelo = new Vuelo();
    ServAdicionales servadicionales = new ServAdicionales();
//Metodo para rellenar formulario en consola

    public  void rellenarFormularioPersona() {
        //Se inicia objecto scanner
        Scanner scanner = new Scanner(System.in);
        //Captura de datos
        System.out.println("*Nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.println("*Apellidos: ");
        persona.setApellido(scanner.nextLine());

        System.out.println("*Cédula: ");
        persona.setCed(scanner.nextLine());

        System.out.println("*Nacionalidad: ");
        persona.setNacionalidad(scanner.nextLine());
        boolean confirmar = false;
        do {
            System.out.println("*Correo ");
            String correo = scanner.nextLine();
            confirmar = validarCorreo(correo);
            persona.setCorreo(correo);

        } while (!confirmar);

//Se verifica la introduccion de solo numeros positivos
        do {

            System.out.println("*Edad: ");
            persona.setEdad(scanner.nextInt());

        } while (persona.getEdad() < 0);

    }

    public void rellenarFormularioVuelos() {

        //Se inicia objecto scanner
        boolean respuesta = false;

        while (!respuesta) {
            respuesta = validarVuelo();

        }

    }

    public boolean validarVuelo() {
        boolean respuesta = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código de vuelo: ");
        String vueloRespuesta = scanner.nextLine();

        vuelo.setCodigo(vueloRespuesta); 

        if (vuelo.getCodigo().equals(vuelo.conseguirVuelo1().getCodigo())) {

            System.out.println("Código de vuelo: " + vuelo.conseguirVuelo1().getCodigo());
            System.out.println("Fecha de partida: " + vuelo.conseguirVuelo1().getFechaPartida());
            System.out.println("Punto de partida: " + vuelo.conseguirVuelo1().getPuntoPartida());
            System.out.println("Punto de llegada: " + vuelo.conseguirVuelo1().getPuntoLlegada());
            System.out.println("Fecha de llegada: " + vuelo.conseguirVuelo1().getFechaLlegada());
            System.out.println("Duración: " + vuelo.conseguirVuelo1().getDuracionMinutos() + " minutos");
            System.out.println("Tarifa base: " + vuelo.conseguirVuelo1().getCosto() + " CRC");
            vuelo = vuelo.conseguirVuelo1();
            respuesta = true;
        } else if (vuelo.getCodigo().equals(vuelo.conseguirVuelo2().getCodigo())) {
              System.out.println("Código de vuelo: " + vuelo.conseguirVuelo2().getCodigo());
            System.out.println("Fecha de partida: " + vuelo.conseguirVuelo2().getFechaPartida());
            System.out.println("Punto de partida: " + vuelo.conseguirVuelo2().getPuntoPartida());
            System.out.println("Punto de llegada: " + vuelo.conseguirVuelo2().getPuntoLlegada());
            System.out.println("Fecha de llegada: " + vuelo.conseguirVuelo2().getFechaLlegada());
            System.out.println("Duración: " + vuelo.conseguirVuelo2().getDuracionMinutos() + " minutos");
            System.out.println("Tarifa base: " + vuelo.conseguirVuelo2().getCosto() + " CRC");
            vuelo = vuelo.conseguirVuelo2();    
            respuesta = true;
        } else if (vuelo.getCodigo().equals(vuelo.conseguirVuelo3().getCodigo())) {
            System.out.println("Código de vuelo: " + vuelo.conseguirVuelo3().getCodigo());
            System.out.println("Fecha de partida: " + vuelo.conseguirVuelo3().getFechaPartida());
            System.out.println("Punto de partida: " + vuelo.conseguirVuelo3().getPuntoPartida());
            System.out.println("Punto de llegada: " + vuelo.conseguirVuelo3().getPuntoLlegada());
            System.out.println("Fecha de llegada: " + vuelo.conseguirVuelo3().getFechaLlegada());
            System.out.println("Duración: " + vuelo.conseguirVuelo3().getDuracionMinutos() + " minutos");
            System.out.println("Tarifa base: " + vuelo.conseguirVuelo3().getCosto() + " CRC");
            respuesta = true;
        }

        if (!respuesta) {
            System.out.println("Ingrese un código de vuelo valido.");

        } else {
            boolean verificarTrueORFalse = true;
            while (verificarTrueORFalse) {

                System.out.println("El codigo ingresado es el correcto?");
                String respCodigo = scanner.nextLine();
                if (respCodigo.toUpperCase().equals("FALSE")) {
                    respuesta = false;
                    verificarTrueORFalse = false;
                    vuelo = new Vuelo();
                } else if (respCodigo.toUpperCase().equals("TRUE")) {
                    System.out.println("Vuelo agregado!!");
                    verificarTrueORFalse = false;
                } else {
                    System.out.println("Solo se puede ingresar true o False como respuesta..");
                }

            }
        }

        return respuesta;
    }

    public void preguntarServiciosAdicionales() {

        Scanner scanner = new Scanner(System.in);
        
        servadicionales.setTarifaBase(vuelo.getCosto());
        System.out.println("Tipo de vuelo: Roundtrip o Simple?");
        servadicionales.setTipoVuelo(scanner.nextLine());

        System.out.println("Tipo de equipaje: BAsico o Adicional?");
        servadicionales.setEquipaje(scanner.nextLine());

        System.out.println("Tipo de pasajero: Nino o adulto?");
        servadicionales.setTipoPasaj(scanner.nextLine());

        System.out.println("Alimentacion: si o no?");
        servadicionales.setAlim(scanner.nextLine());

        System.out.println("Tipo de servicio: Ejecutivo o economico?");
        servadicionales.setTipoServ(scanner.nextLine());

        System.out.println("Codigo promocional? si o no");
        servadicionales.setCodigoProm(scanner.nextLine());
        
        servadicionales.setSubTotal();
        servadicionales.setTotalPagar();
    }

    public boolean validarCorreo(String correo) {
        boolean arrobaYpunto = false;   //contains tengo una cadena de texto y le especifico al contains que es lo que quiero que busque...
        if (correo.contains("@") & correo.contains(".")) {
            arrobaYpunto = true;

        } else {
            System.out.println("Ingrese un correo valido. ");
        }
        return arrobaYpunto;
    }

    public void imprimir() {
      
        System.out.println(persona + "\n" + vuelo + "\n" + servadicionales) ;
        /*  System.out.println("cacacacacac");
        System.out.println(persona.getNombre()+ persona.getApellido() + persona.getCed() + persona.getCorreo() + persona.getNacionalidad()+ persona.getEdad()+ vuelo.codigo + vuelo.fechaPartida + vuelo.puntoPartida + vuelo.fechaLlegada + vuelo.puntoLlegada + vuelo.costo + servadicionales.getTipoVuelo() + servadicionales.getTipoVueloPrice() + servadicionales.getEquipaje()+ "\n"
                + servadicionales.getEquipajePrice()+ servadicionales.getAlim()+ servadicionales.getAlimPrice()+ servadicionales.getTipoServ()+ servadicionales.getTipoServPrice() + servadicionales.getSubTotal() + servadicionales.getCodigoProm()+servadicionales.getCodigoDesc() + servadicionales.getTotalPagar() );
        */
    }

}
