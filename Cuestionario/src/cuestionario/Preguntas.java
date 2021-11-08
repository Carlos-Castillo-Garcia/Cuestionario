package cuestionario;

import java.util.Scanner;

public class Preguntas {
    Scanner sc = new Scanner(System.in);
    Personaje persona = new Personaje();

    public void run() {

    }

    public void realizarpreguntas(){
        System.out.println("Introduzca su nombre de usuario: ");
        persona.nombre_personaje = sc.nextLine();
        System.out.println("Introduzca su email de vinculacion: ");
        persona.email_vinculado = sc.nextLine();
        System.out.println("Introduzca la alianza a la que esta asociado: ");
        persona.alianza = sc.nextLine();
        System.out.println("Introduzca la galaxia en la que esta: ");
        persona.numero_galaxia = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca  el numero de planetas que ");

    }

}
