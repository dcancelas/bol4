package bol4_03;

public class Circulo {
    private double radio;
    private double PI=3.14;

    public Circulo() {
        radio=0;
    }
    public Circulo(double r) {
        radio=r;
    }
    
    public double calcularArea() {
        return (PI*Math.pow(radio,2));
    }
    public double calcularLonxitude() {
        return ((2*PI)*radio);
    }

}