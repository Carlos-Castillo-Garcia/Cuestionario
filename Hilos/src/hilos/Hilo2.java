/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author Manuel
 */
public class Hilo2 implements Runnable{
    
    @Override
    public void run(){
       Saludar();
    }
    
    public void Saludar(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo2: Ola ke aseh");
        }
    }
}
