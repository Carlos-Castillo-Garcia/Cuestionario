/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class HiloUnico extends Thread{
    String frase;
    int tiempoEspera = 10000;
    Auxiliar aux = new Auxiliar();
    
    public void HiloUnico(){
        
    }
    
    @Override
    public void run(){
        CrearAuxiliar(0);
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(aux.frase);
                sleep(tiempoEspera);
            } catch (Exception e) {
            }
        }
    }
    public void CrearAuxiliar(int tiempoespera){
        Scanner sc = new Scanner(System.in);
        System.out.println("Frase a reperir");
        aux.frase = sc.nextLine();
        aux.tiempoespera = 500;
    }
}
