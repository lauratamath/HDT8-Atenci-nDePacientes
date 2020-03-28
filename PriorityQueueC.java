/**
*@author: Laura Tamath
*@since 26/03/2020
*@version 26/03/2020
*referencias: Documentos subidos por Douglas a canvas
**/
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;
import java.util.Vector;
import java.util.PriorityQueue;


public class PriorityQueueC<E> implements Iterable{
	protected PriorityQueue<E> data;

	public PriorityQueueC(){
		data = new PriorityQueue<>();
	}

	public E peek(){
		return data.peek();
	}

	public int size(){
		return data.size();
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
		return data.iterator();
	}

	public String imprimir(PriorityQueueC<Paciente> pendientes){
		String ans="";
        Iterator<Paciente> iterator = pendientes.iterator();
        while(iterator.hasNext()){
            ans+=iterator.next().toString()+"\n";        
        }
        return ans;
	}

	public String next(PriorityQueueC<Paciente> pendientes){  
        Iterator<Paciente> iterator = pendientes.iterator();
        String ans=iterator.next().toString();
    	return ans;
    }

    

}