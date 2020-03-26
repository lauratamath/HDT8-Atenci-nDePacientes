/**
*@author: Laura Tamath
*@since 26/03/2020
*@version /03/2020
*referencias: Documentos subidos por Douglas a canvas
**/
import java.util.*;

public class PriorityQueue<E> implements Iterable{
	protected IPriorityQueue<E> data;

	public PriorityQueue(){
		data = new IPriorityQueue<>();
	}

	public E peek(){
		return data.peek();
	}

	public int size(){
		return datos.size();
	}

	public boolean add (E e){
		return data.add(e);
	}

	public void clear(){
		data.clear();
	}

	public boolean offer(E e){
		return data.offer(e);
	}

	public E poll(){
		if(data.size()==0){
			System.out.println("Sin pacientes para atender");
		}return data.poll();
	}

	@Override
	public Iterator iterator(){
		String ans="";
            Iterator<Paciente> iterator = pendientes.iterator();
            while(iterator.hasNext())
            {
                ans+=iterator.next().toString()+"\n";
                
            }
            return ans;
	}

	public String next(PriorityQueue<Paciente> pendientes)
        {
            
            Iterator<Paciente> iterator = pendientes.iterator();
            String ans=iterator.next().toString();
            return ans;
            
        }
    

}