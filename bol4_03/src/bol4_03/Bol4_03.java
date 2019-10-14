package bol4_03;

public class Bol4_03 {

    public static void main(String[] args) {
        Circulo circulo1=new Circulo();
            System.out.println("\nÁrea da circunferencia: "+circulo1.calcularArea()+
            "\nLonxitude da circunferencia: "+circulo1.calcularLonxitude());
        Circulo circulo2=new Circulo(24);
            System.out.println("\nÁrea da circunferencia: "+circulo2.calcularArea()+
            "\nLonxitude da circunferencia: "+circulo2.calcularLonxitude());
    }
    
}
