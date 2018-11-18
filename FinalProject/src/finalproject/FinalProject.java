package finalproject;

public class FinalProject {

    public static void main(String[] args) {

        Formulario formulario = new Formulario();
        formulario.rellenarFormularioPersona();
        formulario.rellenarFormularioVuelos();
      ServAdicionales servAdicionales = new ServAdicionales();
        
        
      formulario.preguntarServiciosAdicionales();
        
    }

}
