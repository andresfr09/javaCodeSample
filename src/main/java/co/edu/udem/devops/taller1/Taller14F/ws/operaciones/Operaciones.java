package co.edu.udem.devops.taller1.Taller14F.ws.operaciones;

public class Operaciones {

    private Operaciones() {
        throw new IllegalStateException("Constructor");
    }

    public static double suma(double a, double b){
        return a+b;
    }

    public static double resta(double a, double b){
        return a-b;
    }

}
