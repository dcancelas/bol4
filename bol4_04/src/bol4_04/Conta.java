package bol4_04;

public class Conta {
    private String nomCliente;
    private String numConta;
    private Double tipoInterese;
    private Double saldo;

    public Conta() {
        
    }
    public Conta(String nom,String num,Double t,Double s) {
        nomCliente=nom;
        numConta=num;
        tipoInterese=t;
        saldo=s;
    }
    public void setNom(String nom) {
        nomCliente=nom;
    }
    public String getNom() {
        return nomCliente;
    }
    public void setNum(String num) {
        numConta=num;
    }
    public String getNum() {
        return numConta;
    }
    public void setTipo(Double t) {
        tipoInterese=t;
    }
    public Double getTipo() {
        return tipoInterese;
    }
    public void setSaldo(Double s) {
        saldo=s;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void ingreso(Double cantIngreso) {
        if (cantIngreso<0) System.out.println("ERROR");
        if (cantIngreso>=0) {
            saldo=(saldo+cantIngreso);
            System.out.println("Realizouse o ingreso de: "+cantIngreso+"€");
        }
    }
    public void reintegro(Double cantReintegro) {
        if (cantReintegro<0) System.out.println("ERROR");
        if (cantReintegro>=0) {
            saldo=(saldo-cantReintegro);
            System.out.println("Realizouse o reintegro de: "+cantReintegro+"€");
        }
    }
    public void transferencia(Conta contaDestino,Double importe) {
        saldo=(saldo-importe);
        contaDestino.setSaldo((contaDestino.getSaldo())+importe);
        System.out.println("Realizouse a transferencia de "+importe+
        "€ a o número de conta "+(contaDestino.getNum()));
    }

}