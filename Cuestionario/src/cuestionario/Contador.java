package cuestionario;

public class Contador extends Thread{
    int tiempo = 0;

    @Override
    public void run() {
        for (int i = 0; i <18 ; i++){
            try {
                sleep(7000);
                tiempo++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void mostrar_tiempo(){
        System.out.println("tiempo transcurrido: " + tiempo);
    }
}
