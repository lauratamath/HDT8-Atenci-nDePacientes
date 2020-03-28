/**
*@author: Laura Tamath
*@since 26/03/2020
*@version /03/2020
*referencias: Documentos subidos por Douglas a canvas
**/

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] arg) throws FileNotFoundException, IOException{

		File archivo = new File ("pacientes.txt");

        FileReader fr = new FileReader(archivo);
        BufferedReader br1 = new BufferedReader(fr);
        String linea = "";
        Scanner scanner = new Scanner(fr);
        
        Scanner teclado = new Scanner(System.in);
        String seleccion;
        
        
        String nombre;
        String sintoma;
        String prioridad;
        PriorityQueueC<Paciente> pendientes=new PriorityQueueC<Paciente>();
        VectorHeap<Paciente> tPacientes=new VectorHeap<Paciente>();
        
        //Vector<Paciente> pacientes = new Vector<>();
        System.out.println("Ingrese 1 para realizar el programa implementando VectorHeap");
        System.out.println("Ingrese 2 para realizar el programa implementando PriorityQueueJCF");
        
        String objeto=teclado.nextLine();

        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            
            nombre = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            sintoma = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            prioridad = linea.substring(0, linea.length());
            
            //System.out.println(nombre + "-" + sintoma + "-" + prioridad);
            
            if (objeto.equals("1")) 
            {
                tPacientes.add(new Paciente(nombre, sintoma, prioridad));
                
            }
            else if(objeto.equals("2"))
            {
                pendientes.add(new Paciente(nombre, sintoma, prioridad));
                
            }
            
            
            
            fr.close();
            br1.close();
        }

        while (true)
        {
            System.out.println("1. Ver todos los pacientes");
            System.out.println("2. Ver siguiente en la lista");
            System.out.println("3. Atender al paciente");
            System.out.println("4. Salir");
            seleccion=teclado.nextLine();
            
            //OPCION 1
            if (seleccion.equals("1") && objeto.equals("1")) 
            {
                System.out.println(tPacientes.imprimir(tPacientes));
                
            }
            else if (seleccion.equals("1") && objeto.equals("2")) 
            {
                System.out.println(pendientes.imprimir(pendientes));
            }
            
            //OPCION 2
            if (seleccion.equals("2") && objeto.equals("1")) 
            {
                System.out.println(tPacientes.next(tPacientes));
                
            }
            else if (seleccion.equals("2") && objeto.equals("2")) 
            {
                System.out.println(pendientes.next(pendientes));
            }
            //OPCION 3
             if (seleccion.equals("3") && objeto.equals("1")) 
            {
                tPacientes.remove();
                
            }
            else if (seleccion.equals("3") && objeto.equals("2")) 
            {
                pendientes.poll();
            }
            
            
            if (seleccion.equals("4")) 
            {
                break;
                
            }
               
        }
        
        
	}
	
}