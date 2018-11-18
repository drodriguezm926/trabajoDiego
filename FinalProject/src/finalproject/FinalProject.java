package finalproject;

public class FinalProject {

    public static void main(String[] args) {

        Formulario formulario = new Formulario();
        formulario.rellenarFormularioPersona();
        formulario.rellenarFormularioVuelos();//
        formulario.validarCorreo("diegosm0199@gmail.com");//shfjsjghgj
       //sadasdsadasdasd
          
        ServAdicionales servAdicionales = new ServAdicionales();
        
        
        formulario.preguntarServiciosAdicionales();
        

        System.out.println("El precio del tipo de vuelo es: " + servAdicionales.getTipoVueloPrice() + "\n"
        + " Estimado cliente el precio total es por: " + servAdicionales.getPrecioTotal()
        );
    }

}
