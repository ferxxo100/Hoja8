package Main;

import PriorityQueueController.PriorityQueue;
import PriorityQueueController.PriorityQueueJF;
import PriorityQueueController.VectorHeap;
import ProcessModel.Process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        System.out.println("Ingrese que opcion de implementacion de Priority Queue quiere?\n" +
                "1) Vector\n2) Priority Queue Java Framework Collection");
        String opc = sc.nextLine();
        PriorityQueue<Process> priorityQueue;
        if(opc.equals("1")){
            priorityQueue = new VectorHeap<>();
        }else{
            priorityQueue = new PriorityQueueJF<>();
        }
        System.out.println("Cargando Procesos");
        Thread.sleep(1000);
        createVector(priorityQueue);
        System.out.println("Atendiendo Procesos");
        while(!priorityQueue.isEmpty()){
            Thread.sleep(1000);
            System.out.println(priorityQueue.remove());
        }
    }

    public static void createVector(PriorityQueue priorityQueue){
        FileReader ar;
        BufferedReader reader;
        try {
            ar = new FileReader("procesos.txt");
            if (ar.ready()) {
                reader = new BufferedReader(ar);
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    priorityQueue.add(new Process(data[0],data[1],Integer.valueOf(data[2])));
                }
            } else {
                System.out.println("El archivo no se encuentra");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}