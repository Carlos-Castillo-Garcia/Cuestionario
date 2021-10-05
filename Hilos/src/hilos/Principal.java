/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author Manuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo1 hilos1 = new Hilo1();
        Runnable hilos2 = new Hilo2();
     
//       hilos1.start();
//       hilos2.run();
        HiloUnico hilounico1 = new HiloUnico();
        HiloUnico hilounico2 = new HiloUnico();

        hilounico1.start();
        hilounico2.start();
    }

}
