/**
*@author: Laura Tamath
*@since 26/03/2020
*@version /03/2020
*referencias: Documentos subidos por Douglas a canvas
**/
import java.util.Iterator;
import java.util.Vector;


public class VectorHeap<E extends Comparable<E>> implements Iterable, PriorityQueue<E>{
	protected Vector<E> dato; 

	public VectorHeap(){
		/**Construye una nueva prioridad queue**/
		dato = new Vector<>();
	}

	public String imprimir(VectorHeap<Paciente> tPacientes){
		/**Imprime el contenido del vector
		Devuelve un String conectando todos los pacientes**/
		String ans = "";
		Iterator<Paciente> iterator = tPacientes.iterator();
		while(iterator.hasNext()){
			ans += iterator.next().toString() + "\n";
		} return ans;
	}

	public String next(VectorHeap<Paciente> tPacientes){
		/**Retorna al siguiente paciente de la lista**/
		Iterator<Paciente> iterator = tPacientes.iterator();
		String ans = iterator.next().toString();
		return ans;
	}

	public VectorHeap(Vector<E> v){
		/**Constructor  de un VectorHeap
		Construye un nuevo priority queue de un vector desordenado*/
		int i;
		dato = new Vector<>(v.size());
		for (i=0;i<v.size() ; i++ ) {
			add(v.get(i));
		}
	}


	protected static int parent(int i){
		/**Pre: 0 mayor o igual i menor o igual
		Post: retorna el indice del padre del nodo en la ubicacion i**/
		return (i-1)/2;
	}


	protected static int left(int i){
		/*Pre: 0 mayor o igual i menor o igual
		Post: retorna el indice del hijo izquierdo del nodo en la ubicacion i*/
        return 2*i+1;
	}


	protected static int right(int i){
		/*Pre: 0 mayor o igual i menor o igual
		Post: retorna el indice del hijo derecho del nodo en la ubicacion i*/
        return (2*i+1) + 1;
	}


	protected void percolateUp(int leaf){
		/**Pre: 0 mayor o igual i menor o igual
		Post: Mueve el nodo en la hoja índice hasta la posición adecuada*/
        int parent = parent(leaf);
        E value = dato.get(leaf);
            
        while (leaf > 0 && (value.compareTo(dato.get(parent)) < 0)){
            dato.set(leaf, dato.get(parent));
            leaf = parent;
            parent = parent(leaf);
        } dato.set(leaf, value);
	}

	@Override
	public void add(E value){
		/*pre: el valor no es nulo comparable
        post: el valor se agrega a la cola de prioridad*/
		dato.add(value);
		percolateUp(dato.size()-1);
	}

	protected void pushDownRoot(int root){
		/* post: mueve el nodo en la raíz del índice hacia abajo*/
		int heapSize = dato.size();
		E value = dato.get(root);
		while (root <heapSize){
			int post = left(root);
			if (post <heapSize){
				if ((right(root) < heapSize) && ((dato.get(post+1)).compareTo(dato.get(post)) < 0)){
                    post++;
                }
                if ((dato.get(post)).compareTo(value) < 0){
                    dato.set(root,dato.get(post));
                    root = post; /*lo mantiene moviendo abajo*/
                } else { /* encuentra la locacion derecha*/
                    dato.set(root,value);
                    return;
                } 
			}else { /* at a leaf! insert and hal*t*/
              	dato.set(root,value);
                return;
            }
		}
	}


	public E remove(){
		/*retorna y devuleve el valor minimo del queue*/
		E min = null;
		if(dato.size() != 0){
			min = getFirst();
			dato.set(0, dato.get(dato.size() -1));
		}
		else if (dato.size()>=1) {
			pushDownRoot(0);
		}else {
			System.out.println("Sin pacientes para atender");
		}return min;
	}
	
	public E getFirst(){
		//Devuelve el primer elemento del vectorHeap
		//Devuelve el valor mas pequeno
		return dato.get(0);
	}

	public boolean isEmpty(){
		//Verifica si esta vacia el vectorHeap
		//retorna verdadero, si esta esta vacia
		return dato.isEmpty();
	}

	public int size(){
		//retorna el largo del vector
		return dato.size();
	}

	public void clear(){
		//Elimina todos los elementos del vectorHeap
		dato.removeAllElements();
	}

	public Iterator iterator(){
		//interator del vectorHeap
		return dato.iterator();
	}

}