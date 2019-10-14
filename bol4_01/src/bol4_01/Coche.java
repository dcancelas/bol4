package bol4_01;

public class Coche {
    private int velocidade;
    public Coche() {
        velocidade=0;
    }

    public int getVelocidade() {
        return velocidade;
    }   
    public void acelerar() {
        velocidade++;
    }
    public void frenar() {
        velocidade--;
    }
    public void printV() {
        System.out.println("A velocidade é: "+velocidade+" km/h");
    }
    public void saltoLinea() {
        System.out.println("");
    }

}