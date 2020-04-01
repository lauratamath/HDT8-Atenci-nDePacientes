/**
*@author: Laura Tamath
*@since 26/03/2020
*@version /03/2020
*referencias: Documentos subidos por Douglas a canvas
**/
public class Paciente implements Comparable<Paciente>{
	private String nombre;
    private String sintoma;
    private String prioridad;


    public Paciente(String nombre, String sintoma, String prioridad){
    	this.nombre = nombre;
    	this.sintoma = sintoma;
    	this.prioridad = prioridad;
    }

    public String getNombre(){
    	return nombre;
    }

    public void setNombre(String nombre){
    	this.nombre = nombre;
    }

    public String getSintoma(){
    	return sintoma;
    }

    public void setSintoma(String sintoma){
    	this.sintoma = sintoma;
    }

   public String getPrioridad(){
    	return prioridad;
    }

    public void setPrioridad(String prioridad){
    	this.prioridad = prioridad;
    }


     @Override
    public String toString() {
        String texto = "";
        texto = nombre + " -- " + sintoma + " -- " + prioridad;
        
        return texto;
    }

    @Override
    public int compareTo(Paciente o) {
        int resultado = 0;
        
        if(this.prioridad.compareTo(o.prioridad) < 0){
            resultado = -1;
        }else if(this.prioridad.compareTo(o.prioridad) > 0){
            resultado = 1;
        }else{
            resultado = 0;
        }
        
        return resultado;
    }
}