package PriorityQueueController;

import java.util.PriorityQueue;

public class PriorityQueueJF<E extends Comparable<E>> implements PriorityQueueController.PriorityQueue<E> {

    protected PriorityQueue<E> data;
    public PriorityQueueJF(){
        data = new PriorityQueue<E>();
    }

    public void add(E element){
        data.add(element);
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {

    }

    @Override
    public E getFirst() {
        return null;
    }

    public E remove(){
        return data.remove();
    }

}
