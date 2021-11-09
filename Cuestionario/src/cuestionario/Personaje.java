package cuestionario;

public class Personaje {
    String nombre_personaje;
    String email_vinculado;
    String alianza;
    int numero_galaxia;
    int metal;
    int deuterio;
    int cristal;
    int planetas;
    int mat_oscura;
    int nivel_extractor_deuterio;
    int nivel_extractor_metal;
    int nivel_extractor_cristal;
    int n_flotas;
    int n_cazador_ligero;
    int n_cazador_pesado;
    int n_naves_carga;
    int n_colonizadores;
    int numero_defensas_totales;

    public Personaje() {
    }

    public Personaje(String nombre_personaje, String email_vinculado, String alianza,
                     int numero_galaxia, int metal, int deuterio, int cristal, int planetas,
                     int mat_oscura, int nivel_extractor_deuterio, int nivel_extractor_metal,
                     int nivel_extractor_cristal, int n_flotas, int n_cazador_ligero,
                     int n_cazador_pesado, int n_naves_carga, int n_colonizadores, int numero_defensas_totales) {
        this.nombre_personaje = nombre_personaje;
        this.email_vinculado = email_vinculado;
        this.alianza = alianza;
        this.numero_galaxia = numero_galaxia;
        this.metal = metal;
        this.deuterio = deuterio;
        this.cristal = cristal;
        this.planetas = planetas;
        this.mat_oscura = mat_oscura;
        this.nivel_extractor_deuterio = nivel_extractor_deuterio;
        this.nivel_extractor_metal = nivel_extractor_metal;
        this.nivel_extractor_cristal = nivel_extractor_cristal;
        this.n_flotas = n_flotas;
        this.n_cazador_ligero = n_cazador_ligero;
        this.n_cazador_pesado = n_cazador_pesado;
        this.n_naves_carga = n_naves_carga;
        this.n_colonizadores = n_colonizadores;
        this.numero_defensas_totales = numero_defensas_totales;

    }
}
