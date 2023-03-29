package Main;

import PriorityQueueController.VectorHeap;
import ProcessModel.Process;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VectorHeap<Process> priorityQueue = new VectorHeap<Process>();
        System.out.println("Cargando Procesos");
        createVector(priorityQueue);
        System.out.println("Atendiendo Procesos");
        while(!priorityQueue.isEmpty()){
            Thread.sleep(1000);
            System.out.println(priorityQueue.remove());
        }
    }

    public static void createVector(VectorHeap vectorData){
        FileReader ar;
        BufferedReader reader;
        try {
            ar = new FileReader("procesos.txt");
            if (ar.ready()) {
                reader = new BufferedReader(ar);
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    vectorData.add(new Process(data[0],data[1],Integer.valueOf(data[2])));
                }
            } else {
                System.out.println("El archivo no se encuentra");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}