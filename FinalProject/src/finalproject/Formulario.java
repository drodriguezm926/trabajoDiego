package finalproject;

import java.util.Scanner;

public class Formulario {

//Instacia del objeto Persona
    Persona persona = new Persona();
    Vuelo vuelo = new Vuelo();
    ServAdicionales servadicionales = new ServAdicionales();
//Metodo para rellenar formulario en consola

    public void rellenarFormularioPersona() {
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

        vuelo.codigo = vueloRespuesta;

        if (vuelo.codigo.equals(vuelo.conseguirVuelo1().codigo)) {

            System.out.println("Código de vuelo: " + vuelo.conseguirVuelo1().codigo);
            System.out.println("Fecha de partida: " + vuelo.conseguirVuelo1().fechaPartida);
            System.out.println("Punto de partida: " + vuelo.conseguirVuelo1().puntoPartida);
            System.out.println("Punto de llegada: " + vuelo.conseguirVuelo1().puntoLlegada);
            System.out.println("Duración: " + vuelo.conseguirVuelo1().duracionMinutos + " minutos");
            System.out.println("Tarifa base: " + vuelo.conseguirVuelo1().costo + " CRC");

            respuesta = true;
        } else if (vuelo.codigo.equals(vuelo.conseguirVuelo2().codigo)) {
            System.out.println("Código de vuelo: " + vuelo.conseguirVuelo2().codigo);
            System.out.println("Fecha de partida: " + vuelo.conseguirVuelo2().fechaPartida);
            System.out.println("Punto de partida: " + vuelo.conseguirVuelo2().puntoPartida);
            System.out.println("Punto de llegada: " + vuelo.conseguirVuelo2().puntoLlegada);
            System.out.println("Fecha de llegada: " + vuelo.conseguirVuelo2().fechaLlegada);
            System.out.println("Duración: " + vuelo.conseguirVuelo2().duracionMinutos + " minutos");
            System.out.println("Tarifa base: " + vuelo.conseguirVuelo2().costo + " CRC");

            respuesta = true;
        } else if (vuelo.codigo.equals(vuelo.conseguirVuelo3().codigo)) {
            System.out.println("Código de vuelo: " + vuelo.conseguirVuelo3().codigo);
            System.out.println("Fecha de partida: " + vuelo.conseguirVuelo3().fechaPartida);
            System.out.println("Punto de partida: " + vuelo.conseguirVuelo3().puntoPartida);
            System.out.println("Punto de llegada: " + vuelo.conseguirVuelo3().puntoLlegada);
            System.out.println("Duración: " + vuelo.conseguirVuelo3().duracionMinutos + " minutos");
            System.out.println("Duración: " + vuelo.conseguirVuelo3().duracionMinutos);
            System.out.println("Tarifa base: " + vuelo.conseguirVuelo3().costo + " CRC");
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

    public boolean preguntarServiciosAdicionales() {

        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Codigo promocional?");
        servadicionales.setCodigoProm(scanner.nextLine());

        return true;
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
    
    public boolean verificarOpcionesIngresadas(String opcion1, String opcion2, String respuesta){
        
        if (opcion1.equals(respuesta) || opcion2.equals(respuesta)) {
            return true;
        }else{
            return false;
        }
    }

}
