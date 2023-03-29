package Tests;
import org.junit.Test;

import PriorityQueueController.PriorityQueue;
import PriorityQueueController.VectorHeap;
import ProcessModel.Process;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void addTest(){
        PriorityQueue priorityQueue = new VectorHeap<>();
        Process process = new Process("angelatruqui", "popshmack", 5);
        priorityQueue.add(process);
        Object result = priorityQueue.getFirst();
        assertEquals(result, process);
    }
    @Test
    public void removeTest(){
        PriorityQueue priorityQueue = new VectorHeap<>();
        Process process = new Process("angelatruqui", "popshmack", 5);
        priorityQueue.add(process);
        Object result = priorityQueue.remove();
        assertEquals(result, process);
    }
}
