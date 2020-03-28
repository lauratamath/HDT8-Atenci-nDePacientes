/**
*@author: Laura Tamath
*@since 26/03/2020
*@version 26/03/2020
*referencias: Documentos subidos por Douglas a canvas
**/

public interface PriorityQueue<E extends Comparable<E>>{
	public E getFirst();
	/** retorna el minimo valor de la prioridad **/

	public E remove();
	/**retorna y remueve el minimo valor de queue**/

	public void add (E value);
	/*el valor se adhiere a la prioridad*/

	public boolean isEmpty();
	/*retorna verdadero si no hay elementos en queue*/
	
	public int size();
	/*retorna el numero de los elementos existentes en el queue*/
	
	public void clear();
	/*remueve todos los elementos del queue*/
}