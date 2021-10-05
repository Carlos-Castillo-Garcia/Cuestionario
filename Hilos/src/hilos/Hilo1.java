/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author Manuel
 */
public class Hilo1 extends Thread{
    
    @Override
    public void run(){
        Runnable sub1 = new Subhilos_1_1();
        Subhilos_1_2 sub2 = new Subhilos_1_2();
        
        sub1.run();
        sub2.start();
        
    }
    
    public void Saludar(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo1: Ola ke aseh");
        }
    }
    
    public void Vasilar(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo1: Te queda bn la riñonera");
        }
    }
}
