/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuestionario;

/**
 *
 * @author Manuel
 *
 */
public class Cuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        Preguntas preguntas = new Preguntas();
        System.out.println("Este cuestionario es sobre el juego OGAME.");
        System.out.println("En el deberas de poner informacion como (nombre de jugador, numero de planetas colonizados, cantidad de recursos y muchos mas.)");
        System.out.println("Deberas ser totalmente sincero. \n Bien empecemos.");
        contador.start();
        preguntas.start();
        preguntas.join();
        contador.mostrar_tiempo();
    }

}
