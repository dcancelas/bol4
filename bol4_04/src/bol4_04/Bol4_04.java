package bol4_04;

public class Bol4_04 {

    public static void main(String[] args) {
        Conta conta1=new Conta();
            conta1.setNom("Antonio");
            conta1.setNum("343765345");
            conta1.setTipo(1.05d);
            conta1.setSaldo(5000d);
            System.out.println("\nNome: "+conta1.getNom()+"\nNúmero de conta: "+conta1.getNum()+
            "\nTipo de interese: "+conta1.getTipo()+"\nSaldo: "+conta1.getSaldo()+"€");

        Conta conta2=new Conta("Daniel","754234842",1.5d,3000d);
            System.out.println("\nNome: "+conta2.getNom()+"\nNúmero de conta: "+conta2.getNum()+
            "\nTipo de interese: "+conta2.getTipo()+"\nSaldo: "+conta2.getSaldo()+"€");
            conta2.ingreso(2000d);
            conta2.reintegro(500d);
            conta2.transferencia(conta1,1000d);

            System.out.println("\nSaldo de "+(conta1.getNom())+": "+conta1.getSaldo()+"€");
            System.out.println("\nSaldo de "+(conta2.getNom())+": "+conta2.getSaldo()+"€");
    }
    
}
