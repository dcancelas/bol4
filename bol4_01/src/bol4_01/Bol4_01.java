package bol4_01;

public class Bol4_01 {

    public static void main(String[] args) {
        Coche coche=new Coche();
            coche.printV();
            coche.saltoLinea();
            int contador=0;
            while (contador<60) {
                coche.acelerar();
                coche.printV();
                contador++;
            }
            coche.saltoLinea();
            while (contador>0) {
                coche.frenar();
                coche.printV();
                contador--;
            }
            
    }
    
}
