<<<<<<< HEAD:PriorityQueueController/PriorityQueue.java
package PriorityQueueController;

=======
// Universidad del Valle de Guatemala
// Algoritmos y Estructuras de Datos
// Gerardo Pineda, 22880
// Fernando Echeverría, 22610

// Esta interfaz fue tomada del libro Java Structures
>>>>>>> b81bc4bc5e07649df112dfc4bf6a6ffd9bc0964e:PriorityQueue.java
public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	public int size();
	// post: returns number of elements within queue
	
	public void clear();
	// post: removes all elements from queue
}