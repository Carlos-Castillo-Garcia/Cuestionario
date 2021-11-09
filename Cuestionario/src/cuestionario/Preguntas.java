package cuestionario;

import java.util.Scanner;

public class Preguntas extends Thread{
    Scanner sc = new Scanner(System.in);
    Personaje persona = new Personaje();

    public void run() {
        realizarpreguntas();
        mostrar_resultados(persona);
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
        persona.planetas = Integer.parseInt(sc.nextLine());
        if(persona.planetas > 1){
            System.out.println("Introduzca la cantidad total de metal que tiene entre todos sus planetas: ");
            persona.metal = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca la cantidad total de cristal que tiene entre todos sus planetas: ");
            persona.metal = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca la cantidad total de deuterio que tiene entre todos sus planetas: ");
            persona.metal = Integer.parseInt(sc.nextLine());
        }else{
            System.out.println("Introduzca la cantidad total de metal que tiene: ");
            persona.metal = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca la cantidad total de cristal que tiene: ");
            persona.metal = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca la cantidad total de deuterio que tiene: ");
            persona.metal = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Introduzca el nivel de su extractor de metal: ");
        persona.nivel_extractor_metal = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el nivel de su extractor de cristal: ");
        persona.nivel_extractor_cristal = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el nivel de su extractor de deuterio: ");
        persona.nivel_extractor_deuterio = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el numero de flotas activas que puede tener: ");
        persona.n_flotas = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el numero de cazadores ligeros que tiene: ");
        persona.n_cazador_ligero = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el numero de cazadores pesados que tiene: ");
        persona.n_cazador_pesado = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el numero de naves de cargar que tiene: ");
        persona.n_naves_carga = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el numero de colonizadores que puede tener: ");
        persona.n_colonizadores = Integer.parseInt(sc.nextLine());
        if(persona.planetas > 1){
            System.out.println("Introduzca el numero de defensas que tiene cada uno de sus planetas: ");
            for (int i = 0; i <= persona.planetas; i++){
                for (int j = 0; j <= 1; j++){
                    persona.defensas_planeta[i][j] = persona.defensas_planeta[persona.planetas][Integer.parseInt(sc.nextLine())];
                }
            }
        }else{
            System.out.println("Introduzca el numero de defensas que tiene su planeta: ");
            for (int i = 0; i <= persona.planetas; i++){
                for (int j = 0; j <= 1; j++){
                    persona.defensas_planeta[i][j] = persona.defensas_planeta[persona.planetas][Integer.parseInt(sc.nextLine())];
                }
            }
        }
    }

    public void mostrar_resultados(Personaje persona){
        System.out.println("Nombre de Usuario: " + persona.nombre_personaje);
        System.out.println("Email vinculado: " + persona.email_vinculado);
        System.out.println("Alianza: " + persona.alianza);
        System.out.println("Numero de la galaxia: " + persona.numero_galaxia);
        System.out.println("Numero de Planetas: " + persona.planetas);
        System.out.println("Cantida de Metal: " + persona.metal);
        System.out.println("Cantida de Deuterio: " + persona.deuterio);
        System.out.println("Cantida de Cristal: " + persona.cristal);
        System.out.println("Nivel extractor deuterio: " + persona.nivel_extractor_deuterio);
        System.out.println("Nivel extractor metal: " + persona.nivel_extractor_metal);
        System.out.println("Nivel extractor cristal: " + persona.nivel_extractor_metal);
        System.out.println("Numero de flotas: " + persona.n_flotas);
        System.out.println("Numero de cazador_ligero: " + persona.n_cazador_ligero);
        System.out.println("Numero de cazador_pesado: " + persona.n_cazador_pesado);
        System.out.println("Numero de naves_carga: " + persona.n_naves_carga);
        System.out.println("Numero de colonizadores: " + persona.n_colonizadores);
        for (int i = 0; i <= persona.planetas; i++){
            for (int j = 0; j <= 1; j++){
                System.out.println("Planeta " + persona.defensas_planeta[i] + " numero de defensas: "
                        + persona.defensas_planeta[i][j]);
            }
        }
    }

}
