package bol4_02;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite( ) {
        meridiano=paralelo=distanciaTerra=0;
    }
    public Satelite(double m,double p,double d) {
        meridiano=m;
        paralelo=p;
        distanciaTerra=d;
    }
    public void verPosicion ( ) {
        System.out.println("\nO satelite atopase no paralelo: "+paralelo+"\nNo meridiano: "
        +meridiano+"\nA unha distancia da terra de: "+distanciaTerra+" km");
    }
}